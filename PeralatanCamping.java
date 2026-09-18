package com.mycompany.penyewaanalatcamping;

public class PeralatanCamping {

    protected String idPeralatan;
    protected String nama;
    protected double hargaSewa;
    protected String status;

    public PeralatanCamping(String idPeralatan, String nama,
            double hargaSewa, String status) {

        this.idPeralatan = idPeralatan;
        this.nama = nama;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }
}