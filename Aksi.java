public class Aksi { // class aksi dengan methd main
    public static void main(String[] args) {
        // 3 objek dari class buku
        Buku bukuSaya = new Buku("Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka", 2005, 529);
        Buku bukuKamu = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "Hasta Mitra", 1980, 535);
        Buku bukuDia = new Buku("Negeri 5 Menara", "Ahmad Fuadi", "Gramedia Pustaka Utama", 2009, 423);

        // atribut objek (bukuSaya)
        bukuSaya.setJudul("Laskar Pelangi");
        bukuSaya.setPenulis("Andrea Hirata");
        bukuSaya.setPenerbit("Bentang Pustaka");
        bukuSaya.setTahunTerbit(2005);
        bukuSaya.setJumlahHalaman(529);

        // menjalankan method yg ada pada file Buku.java untuk menampilkan (print)
        // informasi
        bukuSaya.tampilkanInformasi();
    }
}
