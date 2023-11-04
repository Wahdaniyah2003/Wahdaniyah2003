import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        // Deklarasi
        double luas;
        int alas, tinggi;
        
        // Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // Input
        System.out.println("Program Hitung Luas Segitiga");
        System.out.println("Input alas :");
        alas = baca.nextInt(); // Menggunakan nextInt() untuk membaca integer
        System.out.println("Input tinggi :");
        tinggi = baca.nextInt(); // Menggunakan nextInt() untuk membaca integer
        
        // Prosesnya
        luas = Double.valueOf((alas * tinggi) / 2); 
        
        // Outputnya
        System.out.println("Luas : " + luas);
    }
}
