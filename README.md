# Belajar TestNG: Perbandingan Test Sekuensial vs Paralel

Proyek ini adalah contoh implementasi pengujian otomatis menggunakan TestNG di Java, dengan fokus pada perbandingan antara eksekusi test secara **sekuensial** dan **paralel**.

## Struktur Proyek

- `src/main/java/com/juaracoding/btestng/`  
  Berisi kode utama aplikasi (misal: `Calculator`, `Computer`, `SignIn`).
- `src/test/java/com/juaracoding/btestng/`  
  Berisi kelas-kelas test (misal: `CalculatorTest`, `ComputerTest1`, `TestSatu`, `TestDua`).
- `src/test/resources/testng.xml`  
  Konfigurasi suite TestNG untuk menjalankan test secara paralel.

## Test Sekuensial

Pada mode sekuensial, semua test dijalankan satu per satu dalam satu thread.  
Contoh konfigurasi (di-comment pada `testng.xml`):

```xml

<suite name="Sequential_Test_Suite">
    <test name="Sequential_Tests">
        <classes>
            <class name="com.juaracoding.btestng.TestSatu"/>
            <class name="com.juaracoding.btestng.TestDua"/>
        </classes>
    </test>
</suite>

```

**Kelebihan:**
- Eksekusi lebih mudah diprediksi.
- Cocok untuk test yang saling bergantung.

**Kekurangan:**
- Waktu eksekusi lebih lama jika jumlah test banyak.

## Test Paralel

Pada mode paralel, test dijalankan secara bersamaan di beberapa thread.  
Konfigurasi aktif di `testng.xml`:

```xml
<suite name="Parallel-Test" parallel="classes">
    <test name="Parallel-Tests">
        <classes>
            <class name="com.juaracoding.btestng.TestSatu"/>
            <class name="com.juaracoding.btestng.TestDua"/>
        </classes>
    </test>
</suite>
```

**Kelebihan:**
- Waktu eksekusi lebih singkat.
- Memanfaatkan multi-core CPU.

**Kekurangan:**
- Test harus independen (tidak saling bergantung).
- Potensi masalah sinkronisasi jika ada shared resource.

## Hasil Eksekusi

Laporan hasil test dapat dilihat di folder `target/surefire-reports/`  
Contoh hasil paralel:
- Semua test (`testMethodA`, `testMethodB`, `testMethodC`, `testMethodD`) dijalankan di thread berbeda dan selesai lebih cepat.

## Cara Menjalankan

1. Build project dengan Maven:
   ```sh
   mvn clean test
   ```
2. Ubah konfigurasi di `src/test/resources/testng.xml` untuk mencoba mode sekuensial atau paralel.
3. Lihat hasil di `target/surefire-reports/index.html`.

## Referensi

- [TestNG Documentation](https://testng.org/doc/)

## hasil perbadingan waktu 

