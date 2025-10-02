Pertanyaan
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?

2. Jelaskan maksud dari potongan kode berikut!

      if (bimbinganP1 >= 8 && bimbinganP2 >= 4) 

3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!


Jawab:
1. Ketika menjawab No program tetap berjalan, karena dari sisi logika program tidak ada yang error.
2. jika salah satu kondisi tidak terpenuhi maka program akan menganggap false
3. Program pertama-tama mengecek apakah mahasiswa sudah bebas kompen. Jika belum bebas kompen, maka langsung gagal dengan pesan “Mahasiswa masih memiliki tanggungan kompen”. Jika sudah bebas kompen, maka lanjut ke tahap pengecekan bimbingan. Setelah itu program mengecek jumlah log bimbingan P1 dan P2:
Jika P1 sudah 8 kali atau lebih dan P2 sudah 4 kali atau lebih, maka semua syarat dianggap terpenuhi, sehingga mahasiswa boleh mendaftar ujian skripsi. Jika P1 kurang dari 8 kali dan P2 kurang dari 4 kali, maka mahasiswa gagal dengan pesan bahwa kedua syarat bimbingan belum terpenuhi. Jika hanya P1 yang kurang dari 8 kali, maka mahasiswa gagal dengan pesan bahwa bimbingan P1 belum memenuhi syarat. Jika hanya P2 yang kurang dari 4 kali, maka mahasiswa gagal dengan pesan bahwa bimbingan P2 belum memenuhi syarat. Jadi alurnya: cek status kompen → jika sudah bebas, cek bimbingan P1 & P2 → tentukan pesan sesuai kondisi.