package com.example.bevasarlas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<Product> products;
    private ListView pList;
    private Button add_btn;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();

        RetrofitApiService apiService = RetrofitClient.getInstance().create(RetrofitApiService.class);
        loadProducts(apiService);

    }

    private void init(){
        this.products = new ArrayList<>();
        this.pList = findViewById(R.id.product_list);
        this.add_btn = findViewById(R.id.add_btn);
        this.customAdapter = new CustomAdapter(products, this);
        pList.setAdapter(customAdapter);
    }

    private void loadProducts(RetrofitApiService apiService){
        apiService.getProducts().enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    products.clear();
                    products.addAll(response.body());
                    customAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Ez most nem jött össze kicsi!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Ez most nem jött össze kicsi!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}