# Order Processing System

## Deskripsi Proyek
Order Processing System adalah aplikasi Java sederhana untuk memproses pesanan pelanggan dengan fitur perhitungan otomatis dan sistem diskon. Proyek ini dibuat untuk memenuhi tugas Modul 2 mata kuliah Praktek Pemrograman Lanjut.

## Fitur
- ✅ Pemrosesan data pesanan pelanggan
- ✅ Perhitungan subtotal otomatis
- ✅ Sistem diskon 10% untuk pembelian di atas Rp200.000
- ✅ Konfirmasi email otomatis
- ✅ Informasi pengiriman lengkap
- ✅ Menggunakan Java Record untuk data pelanggan

## Struktur Folder

```
TUGAS3_AFTER/
├── src/
│   └── com/
│       ├── Main.java            # Entry point aplikasi
│       ├── orderProcess.java    # Logika pemrosesan pesanan
│       └── customerInfo.java    # Record data pelanggan
└── README.md                    # Dokumentasi proyek
```

## Cara Menjalankan Program

### Prasyarat
- Java Development Kit (JDK) 14 atau lebih tinggi (untuk mendukung Record)
- Command Prompt / PowerShell / Terminal
- atau Integrated Development Environment (IDE) seperti Eclipse, IntelliJ IDEA, atau Visual Studio Code

### Langkah-langkah:

#### 1. Kompilasi Program
```powershell
cd "e:\gameplayUMM\S3\Pemrogram Lanjut\PRAKTEK\TUGAS\Modul2\TUGAS\TUGAS3_AFTER"
cd src
javac com\*.java
```

#### 2. Jalankan Program
```powershell
java com.Main
```

#### Atau menggunakan software IDE:
1. Buka folder proyek di IDE pilihan Anda
2. Buka file `src/com/Main.java`
3. Klik tombol "Run" atau tekan `Shift + F10` (IntelliJ) / `Ctrl + F11` (Eclipse)
4. Program akan berjalan di terminal terintegrasi

## Cara Menggunakan

Program ini berjalan otomatis dengan data yang sudah di-hardcode di `Main.java`. Untuk mengubah data pesanan:

1. **Edit file Main.java** - Ubah parameter di constructor `orderProcess`
2. **Tentukan produk** - Parameter 1: nama produk (String)
3. **Tentukan kuantitas** - Parameter 2: jumlah item (int)
4. **Tentukan harga** - Parameter 3: harga per item (double)
5. **Tentukan customer** - Parameter 4: object `customerInfo` dengan nama, alamat, email

### Contoh Penggunaan:
```
Nama: Laptop Gaming
Total biaya: Rp900000.0
Mengirim email konfirmasi ke asepkurniawan@email.com
Pesanan atas nama Asep akan dikirim ke Jl. Tlogomas No. 10
Pesanan berhasil diproses!
===================================================================
```

### Logika Diskon:
- **Subtotal ≤ Rp200.000** → Tidak ada diskon
- **Subtotal > Rp200.000** → Diskon 10%

**Contoh Perhitungan:**
```
Harga: Rp1.000.000 × Qty: 1 = Subtotal: Rp1.000.000
Subtotal > Rp200.000 → Diskon 10%
Total: Rp1.000.000 - Rp100.000 = Rp900.000
```

## Teknologi yang Digunakan
- **Java SE 14+** - Bahasa pemrograman utama
- **Java Record** - Untuk immutable data class customerInfo
- **OOP (Object-Oriented Programming)** - Enkapsulasi dan modularitas
- **Constants** - Untuk nilai tetap (MIN_PURCHASE_DISCOUNT, DISCOUNT_RATE)

## Penjelasan Kode

### Main.java
Entry point aplikasi yang membuat instance pesanan dan memprosesnya.

### orderProcess.java
Kelas utama yang menangani:
- Penyimpanan data produk dan pelanggan
- Perhitungan subtotal dan total dengan diskon
- Simulasi pengecekan stok
- Output konfirmasi pesanan

### customerInfo.java
Java Record yang menyimpan data pelanggan (nama, alamat, email) secara immutable.

## Informasi Developer
- **Nama**: Rayhan Amrullah
- **NIM**: 202410370110148
- **Mata Kuliah**: Pemrograman Lanjut
- **Modul**: 2 - Pemesanan Warteg

## Repository
GitHub: [URL Repository Anda]

## Saran Pengembangan
- [ ] Tambahkan input Scanner untuk data dinamis
- [ ] Implementasi database untuk menyimpan pesanan
- [ ] Validasi input (quantity > 0, price >= 0)
- [ ] Sistem stok real-time
- [ ] Integrasi email API untuk konfirmasi otomatis
- [ ] Unit testing dengan JUnit

## Lisensi
Proyek ini dibuat untuk keperluan tugas Modul 2 Pemrograman Lanjut 2025.

