# 🏥 Laporan Praktikum PBO: Integrasi JPA (EclipseLink) & PostgreSQL

## 🏷️ Nama Proyek
**Sistem Manajemen Data Entitas dengan Java Persistence API (JPA)**

---

## ✨ Deskripsi Proyek
Proyek ini merupakan hasil dari praktikum mata kuliah Pemrograman Berorientasi Objek (PBO) yang fokus pada implementasi **Java Persistence API (JPA)** menggunakan **EclipseLink** sebagai *provider* untuk berinteraksi dengan basis data **PostgreSQL**. Tujuan utamanya adalah mendemonstrasikan teknik *Object-Relational Mapping (ORM)*, di mana tabel database direpresentasikan sebagai **Entity Class** di Java, memfasilitasi operasi data yang efisien dan terstruktur.

## 🛠️ Teknologi yang Digunakan

* **Bahasa Pemrograman:** Java (JDK)
* **Database:** PostgreSQL
* **ORM Framework:** Java Persistence API (JPA)
* **JPA Provider:** EclipseLink
* **IDE:** Eclipse (berdasarkan *screenshot* di laporan)

---

## 🚀 Fitur Utama

Proyek ini mencakup fungsionalitas dasar manajemen data melalui antarmuka grafis (GUI):

* **C**reate (Tambah Data Baru) ➕
* **R**ead (Tampilkan Data) 📋
* **U**pdate (Ubah Data) ✏️
* **D**elete (Hapus Data) 🗑️
* **Cetak/Laporan:** Fungsionalitas untuk menghasilkan laporan data. 🖨️
* **Upload:** Fungsionalitas untuk mengelola atau mengintegrasikan data eksternal. 📤

---

## ⚙️ Persyaratan Sistem

Untuk menjalankan atau mereplikasi proyek ini, Anda memerlukan:

1.  **Java Development Kit (JDK)**
2.  **PostgreSQL Server** yang sudah terinstal dan berjalan.
3.  **IDE** (misalnya, Eclipse) dengan plugin yang mendukung JPA/EclipseLink.
4.  **Driver JDBC** untuk PostgreSQL (harus ditambahkan ke *classpath* proyek).
5.  **Konfigurasi `persistence.xml`** yang benar, mengarahkan ke database PostgreSQL yang sesuai.

---

## 📁 Struktur File Penting (Berdasarkan Laporan)

* `META-INF/persistence.xml`: File konfigurasi utama JPA (Persistence Unit). 🔑
* `EntityClass.java`: Kelas yang memetakan tabel database (misalnya, `Pasien` jika menggunakan kasus pasien) ke objek Java. 🧍
* `JDialogInsert.java`: Kode untuk operasi Penambahan Data.
* `JDialogUpdate.java`: Kode untuk operasi Pembaruan Data.
* `JDialogDelete.java`: Kode untuk operasi Penghapusan Data.
* `JFrameForm.java`: *Form* utama yang berisi tombol Cetak dan Upload.
