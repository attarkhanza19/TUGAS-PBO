package com.mycompany.penyewaanalatcamping;

public class Penyewaan {

    private String idPenyewaan;
    private Pelanggan pelanggan;
    private PeralatanCamping peralatan;
    private int jumlahHari;
    private double totalHarga;

    public Penyewaan(String idPenyewaan,
            Pelanggan pelanggan,
            PeralatanCamping peralatan,
            int jumlahHari) {

        this.idPenyewaan = idPenyewaan;
        this.pelanggan = pelanggan;
        this.peralatan = peralatan;
        this.jumlahHari = jumlahHari;
        hitungTotalHarga();
    }

    public void hitungTotalHarga() {
        this.totalHarga = peralatan.hargaSewa * jumlahHari;
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public PeralatanCamping getPeralatan() {
        return peralatan;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
        hitungTotalHarga();
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setPeralatan(PeralatanCamping peralatan) {
        this.peralatan = peralatan;
        hitungTotalHarga();
    }
}