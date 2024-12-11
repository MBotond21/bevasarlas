package com.example.bevasarlas;

public class Product {
    private int id;
    private String nev;
    private int darab_ar;
    private int kategoria;
    private int mennyiseg;

    public Product(int id, String nev, int darab_ar, int kategoria, int mennyiseg) {
        this.id = id;
        this.nev = nev;
        this.darab_ar = darab_ar;
        this.kategoria = kategoria;
        this.mennyiseg = mennyiseg;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getDarab_ar() {
        return darab_ar;
    }

    public void setDarab_ar(int darab_ar) {
        this.darab_ar = darab_ar;
    }

    public int getKategoria() {
        return kategoria;
    }

    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
}
