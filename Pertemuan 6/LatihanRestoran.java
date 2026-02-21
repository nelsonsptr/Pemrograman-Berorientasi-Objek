package pertemuan6;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 21 Februari 2026
*/

public class LatihanRestoran {
    public static void main(String[] args) {
        //Inisialisasi nilai awal untuk menu dan banyaknya
        int menuCode = 1;
        int quantity = 2;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println("");
        System.out.println("Pesanan Anda:");
        
        //Operasi switch untuk menampilkan pesanan pelanggan
        switch(menuCode){
            case 1:
                System.out.println("Nama Menu: Nasi Goreng");
                System.out.println("Harga Satuan: Rp 15000");
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + (15000 * quantity));
                break;
            case 2:
                System.out.println("Nama Menu: Mie Ayam");
                System.out.println("Harga Satuan: Rp 12000");
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + (12000 * quantity));
                break;
            case 3:
                System.out.println("Nama Menu: Bakso");
                System.out.println("Harga Satuan: Rp 10000");
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + (10000 * quantity));
                break;
            case 4:
                System.out.println("Nama Menu: Soto Ayam");
                System.out.println("Harga Satuan: Rp 13000");
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + (13000 * quantity));
                break;
            case 5:
                System.out.println("Nama Menu: Es Teh");
                System.out.println("Harga Satuan: Rp 3000");
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + (3000 * quantity));
                break;
            default:
                System.out.println("Pesanan Invalid!");
        }
    }
}
