public class LatihanProduk {
    /*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 18 Februari 2026
    */
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        //Inisialisasi Tipe Variable
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean statusTersedia = true;

        //Menghitung totalNilaiStok dan pajak
        int totalNilaiStok = hargaSatuan * jumlahStok;
        double pajak = totalNilaiStok * PAJAK;

        //Menampilkan Hasil
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + statusTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok: Rp " + totalNilaiStok);
        System.out.println("Pajak (11%): Rp " + (int) pajak);
    }
}
