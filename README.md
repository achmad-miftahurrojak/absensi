# Sistem Absensi Sederhana (Java)

Proyek aplikasi konsol (CLI) sederhana berbasis Java untuk mencatat dan melihat riwayat kehadiran (Hadir, Izin, Sakit) mahasiswa/karyawan beserta timestamp otomatis.

---

## 📌 Fitur Aplikasi
- **Submit Absence**: Mencatat nama pengguna, waktu pencatatan otomatis (`yyyy-MM-dd HH:mm:ss`), serta status kehadiran (`Hadir`, `Izin`, `Sakit`).
- **View History**: Menampilkan seluruh riwayat daftar absensi yang telah diinput secara berurutan.
- **Validasi Input**:
  - Validasi pilihan menu hanya boleh angka.
  - Nama tidak boleh kosong atau hanya berupa spasi.
  - Status kehadiran harus sesuai pilihan (`Hadir`, `Izin`, atau `Sakit`).

---

## 📁 Struktur Proyek
```text
absensi/
├── src/
│   ├── Attendance.java   # Model representasi data kehadiran (OOP)
│   └── Main.java         # Alur logika menu dan eksekusi program
├── .gitignore            # Daftar file yang diabaikan oleh Git
├── LICENSE               # Lisensi proyek
└── README.md             # Dokumentasi proyek
```

---

## 🚀 Cara Menjalankan Program

Pastikan komputer Anda sudah terpasang **Java Development Kit (JDK 8 atau lebih baru)**.

### Opsi 1: Menjalankan via Terminal / Command Prompt
1. Buka terminal pada folder proyek (`absensi`).
2. Kompilasi kode Java ke dalam folder build:
   ```bash
   javac -d bin src/*.java
   ```
3. Jalankan aplikasi:
   ```bash
   java -cp bin Main
   ```

### Opsi 2: Menggunakan Visual Studio Code
1. Buka folder `absensi` di VS Code.
2. Pastikan ekstensi **Extension Pack for Java** sudah terpasang.
3. Buka file `src/Main.java`, lalu klik tombol **Run** (atau tekan `F5`) yang muncul di atas method `main()`.

---

## 👥 Kolaborator & Pengembang
Proyek ini dikembangkan bersama untuk tugas mata kuliah Dasar-dasar Pemrograman.
