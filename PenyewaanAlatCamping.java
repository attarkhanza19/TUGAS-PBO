package com.mycompany.penyewaanalatcamping;

import java.util.ArrayList;
import java.util.Scanner;

public class PenyewaanAlatCamping {

    static Scanner input = new Scanner(System.in);

    static ArrayList<PeralatanCamping> daftarPeralatan
            = new ArrayList<>();

    static ArrayList<Pelanggan> daftarPelanggan
            = new ArrayList<>();

    static ArrayList<Penyewaan> daftarPenyewaan
            = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEM PENYEWAAN ALAT CAMPING");
            System.out.println("=================================");
            System.out.println("1. Kelola Data Peralatan");
            System.out.println("2. Kelola Data Pelanggan");
            System.out.println("3. Kelola Data Penyewaan");
            System.out.println("4. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    menuPeralatan();
                    break;

                case 2:
                    menuPelanggan();
                    break;

                case 3:
                    menuPenyewaan();
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);
    }

    // =================================
    // MENU PERALATAN
    // =================================

    static void menuPeralatan() {

        int pilihan;

        do {
            System.out.println("\n===== DATA PERALATAN =====");
            System.out.println("1. Tambah Peralatan");
            System.out.println("2. Lihat Peralatan");
            System.out.println("3. Ubah Peralatan");
            System.out.println("4. Hapus Peralatan");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPeralatan();
                    break;

                case 2:
                    lihatPeralatan();
                    break;

                case 3:
                    ubahPeralatan();
                    break;

                case 4:
                    hapusPeralatan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    static void tambahPeralatan() {

        System.out.println("\n===== TAMBAH PERALATAN =====");

        System.out.print("ID Peralatan: ");
        String id = input.nextLine();

        System.out.print("Nama Peralatan: ");
        String nama = input.nextLine();

        System.out.print("Harga Sewa per Hari: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.println("\nJenis Peralatan:");
        System.out.println("1. Tenda");
        System.out.println("2. Sleeping Bag");
        System.out.println("3. Kompor Camping");
        System.out.print("Pilih jenis: ");

        int jenis = input.nextInt();
        input.nextLine();

        PeralatanCamping peralatan;

        switch (jenis) {

            case 1:
                System.out.print("Kapasitas (orang): ");
                int kapasitas = input.nextInt();
                input.nextLine();

                peralatan = new Tenda(
                        id, nama, harga, "Tersedia", kapasitas
                );
                break;

            case 2:
                System.out.print("Suhu Minimum (°C): ");
                int suhuMinimum = input.nextInt();
                input.nextLine();

                peralatan = new SleepingBag(
                        id, nama, harga, "Tersedia", suhuMinimum
                );
                break;

            case 3:
                System.out.print("Jenis Bahan Bakar: ");
                String bahanBakar = input.nextLine();

                peralatan = new KomporKamping(
                        id, nama, harga, "Tersedia", bahanBakar
                );
                break;

            default:
                System.out.println("Jenis peralatan tidak tersedia.");
                return;
        }

        daftarPeralatan.add(peralatan);

        System.out.println("Peralatan berhasil ditambahkan.");
    }

    static void lihatPeralatan() {

        System.out.println("\n===== DATA PERALATAN =====");

        if (daftarPeralatan.isEmpty()) {
            System.out.println("Belum ada data peralatan.");
            return;
        }

        for (PeralatanCamping peralatan : daftarPeralatan) {

            System.out.println("-----------------------------");
            System.out.println("ID     : " + peralatan.idPeralatan);
            System.out.println("Nama   : " + peralatan.nama);
            System.out.println("Harga  : Rp" + peralatan.hargaSewa);
            System.out.println("Status : " + peralatan.status);

            if (peralatan instanceof Tenda) {
                System.out.println("Jenis  : Tenda");

            } else if (peralatan instanceof SleepingBag) {
                System.out.println("Jenis  : Sleeping Bag");

            } else if (peralatan instanceof KomporKamping) {
                System.out.println("Jenis  : Kompor Camping");
            }
        }

        System.out.println("-----------------------------");
    }

    static void ubahPeralatan() {

        System.out.println("\n===== UBAH PERALATAN =====");

        System.out.print("Masukkan ID peralatan: ");
        String id = input.nextLine();

        for (PeralatanCamping peralatan : daftarPeralatan) {

            if (peralatan.idPeralatan.equalsIgnoreCase(id)) {

                System.out.print("Nama baru: ");
                peralatan.nama = input.nextLine();

                System.out.print("Harga sewa baru: ");
                peralatan.hargaSewa = input.nextDouble();
                input.nextLine();

                System.out.print("Status baru: ");
                peralatan.status = input.nextLine();

                System.out.println("Data peralatan berhasil diubah.");
                return;
            }
        }

        System.out.println("Peralatan dengan ID tersebut tidak ditemukan.");
    }

    static void hapusPeralatan() {

        System.out.println("\n===== HAPUS PERALATAN =====");

        System.out.print("Masukkan ID peralatan: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarPeralatan.size(); i++) {

            if (daftarPeralatan.get(i).idPeralatan
                    .equalsIgnoreCase(id)) {

                daftarPeralatan.remove(i);

                System.out.println("Data peralatan berhasil dihapus.");
                return;
            }
        }

        System.out.println("Peralatan dengan ID tersebut tidak ditemukan.");
    }

    // =================================
    // MENU PELANGGAN
    // =================================

    static void menuPelanggan() {

        int pilihan;

        do {
            System.out.println("\n===== DATA PELANGGAN =====");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Ubah Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPelanggan();
                    break;

                case 2:
                    lihatPelanggan();
                    break;

                case 3:
                    ubahPelanggan();
                    break;

                case 4:
                    hapusPelanggan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    static void tambahPelanggan() {

        System.out.println("\n===== TAMBAH PELANGGAN =====");

        System.out.print("ID Pelanggan: ");
        String id = input.nextLine();

        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();

        System.out.print("No. Telepon: ");
        String noTelepon = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(
                id, nama, noTelepon
        );

        daftarPelanggan.add(pelanggan);

        System.out.println("Pelanggan berhasil ditambahkan.");
    }

    static void lihatPelanggan() {

        System.out.println("\n===== DATA PELANGGAN =====");

        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            return;
        }

        for (Pelanggan pelanggan : daftarPelanggan) {

            System.out.println("-----------------------------");
            System.out.println("ID Pelanggan : "
                    + pelanggan.getIdPelanggan());

            System.out.println("Nama         : "
                    + pelanggan.getNama());

            System.out.println("No. Telepon  : "
                    + pelanggan.getNoTelepon());
        }

        System.out.println("-----------------------------");
    }

    static void ubahPelanggan() {

        System.out.println("\n===== UBAH PELANGGAN =====");

        System.out.print("Masukkan ID pelanggan: ");
        String id = input.nextLine();

        for (Pelanggan pelanggan : daftarPelanggan) {

            if (pelanggan.getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                System.out.print("Nama baru: ");
                pelanggan.setNama(input.nextLine());

                System.out.print("No. Telepon baru: ");
                pelanggan.setNoTelepon(input.nextLine());

                System.out.println(
                        "Data pelanggan berhasil diubah."
                );

                return;
            }
        }

        System.out.println(
                "Pelanggan dengan ID tersebut tidak ditemukan."
        );
    }

    static void hapusPelanggan() {

        System.out.println("\n===== HAPUS PELANGGAN =====");

        System.out.print("Masukkan ID pelanggan: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarPelanggan.size(); i++) {

            if (daftarPelanggan.get(i)
                    .getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                daftarPelanggan.remove(i);

                System.out.println(
                        "Data pelanggan berhasil dihapus."
                );

                return;
            }
        }

        System.out.println(
                "Pelanggan dengan ID tersebut tidak ditemukan."
        );
    }

    // =================================
    // MENU PENYEWAAN
    // =================================

    static void menuPenyewaan() {

        int pilihan;

        do {
            System.out.println("\n===== DATA PENYEWAAN =====");
            System.out.println("1. Tambah Penyewaan");
            System.out.println("2. Lihat Penyewaan");
            System.out.println("3. Ubah Penyewaan");
            System.out.println("4. Hapus Penyewaan");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPenyewaan();
                    break;

                case 2:
                    lihatPenyewaan();
                    break;

                case 3:
                    ubahPenyewaan();
                    break;

                case 4:
                    hapusPenyewaan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    static void tambahPenyewaan() {

        System.out.println("\n===== TAMBAH PENYEWAAN =====");

        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            System.out.println("Tambahkan pelanggan terlebih dahulu.");
            return;
        }

        if (daftarPeralatan.isEmpty()) {
            System.out.println("Belum ada data peralatan.");
            System.out.println("Tambahkan peralatan terlebih dahulu.");
            return;
        }

        System.out.print("ID Penyewaan: ");
        String id = input.nextLine();

        System.out.println("\n--- Pilih Pelanggan ---");

        for (Pelanggan pelanggan : daftarPelanggan) {
            System.out.println(
                    pelanggan.getIdPelanggan()
                    + " - "
                    + pelanggan.getNama()
            );
        }

        System.out.print("Masukkan ID Pelanggan: ");
        String idPelanggan = input.nextLine();

        Pelanggan pelangganDipilih = null;

        for (Pelanggan pelanggan : daftarPelanggan) {

            if (pelanggan.getIdPelanggan()
                    .equalsIgnoreCase(idPelanggan)) {

                pelangganDipilih = pelanggan;
                break;
            }
        }

        if (pelangganDipilih == null) {
            System.out.println("Pelanggan tidak ditemukan.");
            return;
        }

        System.out.println("\n--- Pilih Peralatan ---");

        for (PeralatanCamping peralatan : daftarPeralatan) {

            System.out.println(
                    peralatan.idPeralatan
                    + " - "
                    + peralatan.nama
                    + " - Rp"
                    + peralatan.hargaSewa
                    + " - "
                    + peralatan.status
            );
        }

        System.out.print("Masukkan ID Peralatan: ");
        String idPeralatan = input.nextLine();

        PeralatanCamping peralatanDipilih = null;

        for (PeralatanCamping peralatan : daftarPeralatan) {

            if (peralatan.idPeralatan
                    .equalsIgnoreCase(idPeralatan)) {

                peralatanDipilih = peralatan;
                break;
            }
        }

        if (peralatanDipilih == null) {
            System.out.println("Peralatan tidak ditemukan.");
            return;
        }

        if (!peralatanDipilih.status.equalsIgnoreCase("Tersedia")) {
            System.out.println("Peralatan sedang tidak tersedia.");
            return;
        }

        System.out.print("Jumlah Hari: ");
        int jumlahHari = input.nextInt();
        input.nextLine();

        Penyewaan penyewaan = new Penyewaan(
                id,
                pelangganDipilih,
                peralatanDipilih,
                jumlahHari
        );

        daftarPenyewaan.add(penyewaan);

        peralatanDipilih.status = "Disewa";

        System.out.println("Penyewaan berhasil ditambahkan.");
        System.out.println("Total Harga: Rp"
                + penyewaan.getTotalHarga());
    }

    static void lihatPenyewaan() {

        System.out.println("\n===== DATA PENYEWAAN =====");

        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        for (Penyewaan penyewaan : daftarPenyewaan) {

            System.out.println("-----------------------------");

            System.out.println("ID Penyewaan : "
                    + penyewaan.getIdPenyewaan());

            System.out.println("Pelanggan    : "
                    + penyewaan.getPelanggan().getNama());

            System.out.println("Peralatan    : "
                    + penyewaan.getPeralatan().nama);

            System.out.println("Jumlah Hari  : "
                    + penyewaan.getJumlahHari());

            System.out.println("Total Harga  : Rp"
                    + penyewaan.getTotalHarga());
        }

        System.out.println("-----------------------------");
    }

    static void ubahPenyewaan() {

        System.out.println("\n===== UBAH PENYEWAAN =====");

        System.out.print("Masukkan ID penyewaan: ");
        String id = input.nextLine();

        for (Penyewaan penyewaan : daftarPenyewaan) {

            if (penyewaan.getIdPenyewaan()
                    .equalsIgnoreCase(id)) {

                System.out.print("Jumlah hari baru: ");
                int jumlahHari = input.nextInt();
                input.nextLine();

                penyewaan.setJumlahHari(jumlahHari);

                System.out.println(
                        "Data penyewaan berhasil diubah."
                );

                System.out.println("Total Harga Baru: Rp"
                        + penyewaan.getTotalHarga());

                return;
            }
        }

        System.out.println(
                "Penyewaan dengan ID tersebut tidak ditemukan."
        );
    }

    static void hapusPenyewaan() {

        System.out.println("\n===== HAPUS PENYEWAAN =====");

        System.out.print("Masukkan ID penyewaan: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarPenyewaan.size(); i++) {

            Penyewaan penyewaan = daftarPenyewaan.get(i);

            if (penyewaan.getIdPenyewaan()
                    .equalsIgnoreCase(id)) {

                penyewaan.getPeralatan().status = "Tersedia";

                daftarPenyewaan.remove(i);

                System.out.println(
                        "Data penyewaan berhasil dihapus."
                );

                return;
            }
        }

        System.out.println(
                "Penyewaan dengan ID tersebut tidak ditemukan."
        );
    }
}