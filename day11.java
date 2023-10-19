import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalharga = 0;

        System.out.println("Menu yang tersedia");
        System.out.println("1. Nasi Goreng = 13.000");
        System.out.println("2. Mie Ayam = 15.000");
        System.out.println("3. Ayam Geprek = 10.000");
        System.out.println("4. Gado-Gado = 15.000");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Masukkan Nomor Menu Yang Sudah Dipesan:");
        int nomorMenu = scanner.nextInt();

        System.out.println("Jumlah Pesanan");
        int jumlahPesanan = scanner.nextInt();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (nomorMenu == 4) {
            totalharga = 15000 * jumlahPesanan;
        } else if (nomorMenu == 3) {
            totalharga = 10000 * jumlahPesanan;
        } else if (nomorMenu == 2) {
            totalharga = 15000 * jumlahPesanan;
        } else if (nomorMenu == 1) {
            totalharga = 13000 * jumlahPesanan;
        }

        System.out.println("Menu yang diPesan: " + nomorMenu);
        System.out.println("Jumlah Pesanan: " + jumlahPesanan);
        System.out.println("Total Harga: " + totalharga);
    }
}
