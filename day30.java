import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nama;
        int umur;

        System.out.println("Masukkan Nama    :");
        nama = scn.nextLine(); // Membaca nama sebagai string
        System.out.println("Masukkan umur    :");
        umur = scn.nextInt(); // Membaca umur sebagai integer
        System.out.println("===============");

        System.out.println("Umur  :" + umur);
        System.out.println("Nama :" + nama);
    }
}
