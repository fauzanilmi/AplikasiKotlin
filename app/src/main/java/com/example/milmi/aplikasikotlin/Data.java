package com.example.milmi.aplikasikotlin;

public class Data {
    private int gambar;
    private String judul;
    private String genre;
    private String durasi;
    private String rating;

    public Data(int gambar, String judul, String genre, String durasi, String rating) {
        this.gambar = gambar;
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


}
