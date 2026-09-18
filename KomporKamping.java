package com.mycompany.penyewaanalatcamping;

public class KomporKamping extends PeralatanCamping {

    private String jenisBahanBakar;

    public KomporKamping(String idPeralatan, String nama,
            double hargaSewa, String status, String jenisBahanBakar) {

        super(idPeralatan, nama, hargaSewa, status);
        this.jenisBahanBakar = jenisBahanBakar;
    }
}