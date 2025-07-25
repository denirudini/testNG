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

<suite name="Sequential-Test">
    <test name="Sequential-Tests">
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
1. Test Sequensial
   ![WhatsApp Image 2025-07-25 at 14 46 15_59c7af7a](https://github.com/user-attachments/assets/db425eef-5537-48d6-9b34-f4c196641c90)
   
   ![WhatsApp Image 2025-07-25 at 14 50 18_d051e03c](https://github.com/user-attachments/assets/ae29716e-fba6-4978-a99d-b58b9f374b55)
   
   ![WhatsApp Image 2025-07-25 at 14 29 32_ee0486cd](https://github.com/user-attachments/assets/3307c91d-231d-4ba4-b14d-d6b20fc2519c)

3. Test Pararel
  ![WhatsApp Image 2025-07-25 at 14 45 19_b7cf6b7b](https://github.com/user-attachments/assets/9a797790-c398-4245-b12e-91c318642656)

  ![11cbece3ce704f2b9c059e2c0b0aefbf](https://github.com/user-attachments/assets/dcaf4f70-664b-4b29-b6b7-9f93fa20f2a6)
   
   ![WhatsApp Image 2025-07-25 at 14 28 58_ffcd0d0e](https://github.com/user-attachments/assets/5b3c0bb7-e113-4861-8e83-20e206fbcf39)

ada Perbandingan waktu yang cukup signifikan yaitu 4 detik.

   

   


   

