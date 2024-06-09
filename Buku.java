public class Buku {
    // 5 atribut untuk class Buku
    public String judul;
    public String penulis;
    public String penerbit;
    public int tahunTerbit;
    public int jumlahHalaman;

    public Buku(String judul, String penulis, String penerbit, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Method
    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
}
