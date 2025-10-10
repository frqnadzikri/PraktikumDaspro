1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan operator relasional?
Karena variabel uktLunas sudah bertipe data boolean. Variabel boolean hanya memiliki dua nilai: true atau false. Ketika variabelnya sudah boolean, kita bisa langsung menggunakannya dalam kondisi IF tanpa perlu operator relasional seperti ==, !=, <, atau >. Operator relasional digunakan untuk membandingkan nilai angka atau membuat perbandingan, sedangkan boolean sudah merupakan hasil perbandingan.
2. Saat program dijalankan dengan input false, bagaimana hasilnya?
Saat pengguna memasukkan nilai false, program hanya menampilkan pertanyaan "Apakah UKT sudah lunas? (true/false):" kemudian tidak ada output atau pesan apapun setelah itu. Ini terjadi karena kondisi dalam blok IF adalah false, sehingga perintah di dalamnya tidak dijalankan.
3. Modifikasi program dengan menambahkan struktur ELSE
Program telah dimodifikasi dengan menambahkan blok else. Sekarang jika pengguna memasukkan false, program akan menampilkan pesan:
Registrasi ditolak. Silakan lunasi UKT terlebih dahulu
Struktur IF-ELSE yang digunakan:
if (uktLunas) {
    System.out.println("Pembayaran UKT terverifikasi");
    System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
} else {
    System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
}

