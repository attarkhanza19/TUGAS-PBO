# Sistem Penyewaan Alat Camping

## Identitas Mahasiswa

**Nama:** Muhammad Attar Khanza Habibillah
**NIM:** 2509116006
**Program Studi:** Sistem Informasi
**Universitas:** Universitas Mulawarman

---

## 1. Studi Kasus

Program yang dibuat adalah **Sistem Penyewaan Alat Camping**. Program ini digunakan untuk mengelola data peralatan camping, data pelanggan, dan data penyewaan.

Program memiliki beberapa fitur utama, yaitu pengelolaan data peralatan, pelanggan, dan penyewaan. Setiap data dapat ditambahkan, dilihat, diubah, dan dihapus melalui menu yang tersedia.

Jenis peralatan camping yang digunakan dalam program ini terdiri dari **Tenda, Sleeping Bag, dan Kompor Camping**. Pada proses penyewaan, pengguna dapat memilih pelanggan dan peralatan yang tersedia, kemudian menentukan jumlah hari penyewaan. Total harga akan dihitung berdasarkan harga sewa per hari dan jumlah hari penyewaan.

Program dibuat menggunakan Java berbasis console dengan menerapkan konsep Pemrograman Berorientasi Objek.

---

## 2. Hierarki Class

Struktur class pada program adalah sebagai berikut:

```text
                    PeralatanCamping
                           |
             +-------------+-------------+
             |             |             |
           Tenda       SleepingBag   KomporCamping


Pelanggan


Penyewaan
```

`PeralatanCamping` merupakan superclass yang digunakan sebagai dasar untuk class `Tenda`, `SleepingBag`, dan `KomporCamping`.

Class `Pelanggan` digunakan untuk menyimpan data pelanggan, sedangkan class `Penyewaan` digunakan untuk mengelola data transaksi penyewaan.

---

## 3. Penerapan Inheritance

Inheritance diterapkan dengan menjadikan `PeralatanCamping` sebagai superclass dan `Tenda`, `SleepingBag`, serta `KomporCamping` sebagai subclass.

Contohnya pada class `Tenda`:

```java
public class Tenda extends PeralatanCamping {

    private int kapasitas;

    public Tenda(String idPeralatan, String nama,
            double hargaSewa, String status, int kapasitas) {

        super(idPeralatan, nama, hargaSewa, status);
        this.kapasitas = kapasitas;
    }
}
```

Penggunaan `extends PeralatanCamping` menunjukkan bahwa class `Tenda` mewarisi atribut dan constructor dari class `PeralatanCamping`. Class `Tenda` kemudian memiliki atribut tambahan berupa `kapasitas`.

Penerapan yang sama digunakan pada `SleepingBag` dan `KomporCamping`, dengan atribut khusus yang berbeda sesuai dengan jenis peralatan.

---

# 4. Screenshot Running Program

## 4.1 Menu Utama

Menu utama merupakan tampilan awal program yang berisi pilihan untuk mengelola data peralatan, pelanggan, penyewaan, serta pilihan untuk keluar dari program.

**Screenshot:**

> <img width="288" height="182" alt="image" src="https://github.com/user-attachments/assets/f7251d62-82ba-4240-8b23-1c1e270705f7" />


---

## 4.2 Tambah Peralatan

Menu tambah peralatan digunakan untuk memasukkan data alat camping baru. Pengguna memasukkan ID, nama, harga sewa, serta memilih jenis peralatan yang akan ditambahkan.

**Screenshot:**

> <img width="313" height="565" alt="image" src="https://github.com/user-attachments/assets/76eba987-4848-4f5a-8039-f553efab454c" />


---

## 4.3 Lihat Peralatan

Menu lihat peralatan digunakan untuk menampilkan data peralatan camping yang sudah tersimpan di dalam program.

**Screenshot:**

> <img width="276" height="170" alt="image" src="https://github.com/user-attachments/assets/40ed26eb-24ef-43c9-b699-06d153542323" />

---

## 4.4 Ubah Peralatan

Menu ubah peralatan digunakan untuk mengubah data peralatan berdasarkan ID peralatan yang dimasukkan oleh pengguna.

**Screenshot:**

> <img width="288" height="132" alt="image" src="https://github.com/user-attachments/assets/723836a3-0b15-4e16-96dc-8b766ea4bfee" />


---

## 4.5 Hapus Peralatan

Menu hapus peralatan digunakan untuk menghapus data peralatan berdasarkan ID yang dipilih.

**Screenshot:**

> <img width="271" height="66" alt="image" src="https://github.com/user-attachments/assets/2f81069a-0339-4552-aa84-56865260bd5a" />


---

## 4.6 Tambah Pelanggan

Menu tambah pelanggan digunakan untuk memasukkan data pelanggan baru, seperti ID pelanggan, nama, dan nomor telepon.

**Screenshot:**

> <img width="278" height="98" alt="image" src="https://github.com/user-attachments/assets/241c2ce4-2aab-4273-b855-161188825f1b" />


---

## 4.7 Lihat Pelanggan

Menu lihat pelanggan digunakan untuk menampilkan seluruh data pelanggan yang sudah ditambahkan.

**Screenshot:**

> <img width="267" height="128" alt="image" src="https://github.com/user-attachments/assets/28261210-b5d6-486f-989d-a04b332216f5" />


---

## 4.8 Ubah Pelanggan

Menu ubah pelanggan digunakan untuk mengubah data pelanggan berdasarkan ID pelanggan.

**Screenshot:**

> <img width="272" height="121" alt="image" src="https://github.com/user-attachments/assets/e2885a34-4d58-4c5c-8a71-d1e35d69ae06" />


---

## 4.9 Hapus Pelanggan

Menu hapus pelanggan digunakan untuk menghapus data pelanggan berdasarkan ID pelanggan yang dimasukkan.

**Screenshot:**

> <img width="267" height="70" alt="image" src="https://github.com/user-attachments/assets/e94a8866-5ded-4dbf-9225-a8b010780afa" />


---

## 4.10 Tambah Penyewaan

Menu tambah penyewaan digunakan untuk membuat transaksi penyewaan baru. Pengguna memilih pelanggan, memilih peralatan yang tersedia, kemudian menentukan jumlah hari penyewaan. Setelah itu, sistem menghitung total harga secara otomatis.

**Screenshot:**

> <img width="411" height="271" alt="image" src="https://github.com/user-attachments/assets/f4e9889b-5e7f-4cd8-8f48-93a2475bc725" />


---

## 4.11 Lihat Penyewaan

Menu lihat penyewaan digunakan untuk menampilkan data transaksi penyewaan yang sudah dibuat, termasuk pelanggan, peralatan, jumlah hari, dan total harga.

**Screenshot:**

> <img width="290" height="168" alt="image" src="https://github.com/user-attachments/assets/85fedb60-7a96-4fed-92a4-b8776d0a6a46" />


---

## 4.12 Ubah Penyewaan

Menu ubah penyewaan digunakan untuk mengubah jumlah hari pada transaksi penyewaan. Setelah jumlah hari diubah, total harga akan dihitung kembali oleh sistem.

**Screenshot:**

> <img width="286" height="108" alt="image" src="https://github.com/user-attachments/assets/71a9e374-f46f-450e-812a-4bfa1e323ca9" />


---

## 4.13 Hapus Penyewaan

Menu hapus penyewaan digunakan untuk menghapus transaksi penyewaan berdasarkan ID penyewaan. Setelah transaksi dihapus, status peralatan akan kembali menjadi tersedia.

**Screenshot:**

> <img width="275" height="62" alt="image" src="https://github.com/user-attachments/assets/5e450f9c-df2f-404e-8bd8-f3646eae9c55" />


---

## 5. Kesimpulan

Sistem Penyewaan Alat Camping merupakan program berbasis Java yang digunakan untuk mengelola data peralatan, pelanggan, dan transaksi penyewaan. Program memiliki fitur CRUD pada masing-masing data dan menerapkan konsep OOP, terutama inheritance melalui hubungan antara `PeralatanCamping` dengan class `Tenda`, `SleepingBag`, dan `KomporCamping`.
