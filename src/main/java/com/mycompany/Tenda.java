package com.mycompany.penyewaanalatcamping;

public class Tenda extends PeralatanCamping {

    private int kapasitas;

    public Tenda(String idPeralatan, String nama,
            double hargaSewa, String status, int kapasitas) {

        super(idPeralatan, nama, hargaSewa, status);
        this.kapasitas = kapasitas;
    }
}