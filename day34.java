
import java.util.Scanner;


public class day34 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        int a, b, c;

        // Input sisi-sisi segitiga
        System.out.print("Masukkan sisi a: ");
        a = input.nextInt();
        System.out.print("Masukkan sisi b: ");
        b = input.nextInt();
        System.out.print("Masukkan sisi c: ");
        c = input.nextInt();

        // Hitung keliling
        int keliling = a + b + c;

        // Hitung luas
        double luas = 0.5 * a * c;

        // Cetak hasil
        System.out.println("Keliling segitiga adalah: " + keliling);
        System.out.println("Luas segitiga adalah: " + luas);
    }
}
