public class LatihanCounter {
    /*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 18 Februari 2026
    */
   public static void main(String[] args) {
    //Inisialiasi Nilai Awal dan Cetakan Awal
    int awal = 10;
    System.out.println("=== COUNTER ===");
    System.out.println("Nilai awal: " + awal);

    //Menggunakan Post-Increment dan Post-Decrement
    awal++;
    awal++;
    System.out.println("Setelah ++ (2x): " + awal);
    awal--;
    System.out.println("Setelah --: " + awal);

    //Operasi Perhitungan Matematika
   System.out.println("Setelah += 5: " +(awal += 5));
   System.out.println("Setelah -= 3: " +(awal -= 3));
   System.out.println("Setelah *= 2: " +(awal *= 2));
   }
}
