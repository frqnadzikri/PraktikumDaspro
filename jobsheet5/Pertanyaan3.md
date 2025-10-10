JAWABAN PERCOBAAN 3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
Jawaban: Program akan menampilkan: "Gagal! Mahasiswa masih memiliki tanggungan kompen"
Alasannya: Jika jawab "No", berarti mahasiswa masih punya kompen. Maka program tidak perlu cek log bimbingan lagi, langsung output gagal.
________________________________________
2. Jelaskan maksud dari potongan kode berikut!
if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
Penjelasan:
bimbinganP1 >= 8 → Cek apakah log P1 lebih besar atau sama dengan 8
bimbinganP2 >= 4 → Cek apakah log P2 lebih besar atau sama dengan 4
&& → operator AND, artinya KEDUA kondisi harus benar
Jika KEDUA kondisi benar (P1 ≥ 8 DAN P2 ≥ 4), maka mahasiswa boleh daftar ujian
Jika salah satu tidak memenuhi, maka gagal
________________________________________
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir?
ALUR LENGKAP:
Tanya: Bebas kompen?
Input: "Ya" atau "Tidak"
Jika jawab "Ya" → Lanjut cek log bimbingan
Cek: P1 ≥ 8 DAN P2 ≥ 4?
2a. Jika YA (P1 ≥ 8 DAN P2 ≥ 4):
Output: "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi"
KESIMPULAN: LOLOS ✓
2b. Jika TIDAK (P1 < 8 DAN P2 < 4):
Output: "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali"
KESIMPULAN: GAGAL ✗
2c. Jika P1 < 8 saja:
Output: "Gagal! Log bimbingan P1 belum mencapai 8 kali"
KESIMPULAN: GAGAL ✗
2d. Jika P2 < 4 saja:
Output: "Gagal! Log bimbingan P2 belum mencapai 4 kali"
KESIMPULAN: GAGAL ✗
Jika jawab "Tidak" → Tidak perlu cek log bimbingan
Output: "Gagal! Mahasiswa masih memiliki tanggungan kompen"
KESIMPULAN: GAGAL ✗
SELESAI



