package com.mycompany.penyewaanalatcamping;

public class SleepingBag extends PeralatanCamping {

    private int suhuMinimum;

    public SleepingBag(String idPeralatan, String nama,
            double hargaSewa, String status, int suhuMinimum) {

        super(idPeralatan, nama, hargaSewa, status);
        this.suhuMinimum = suhuMinimum;
    }
}