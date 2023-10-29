import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka % 3 == 0) {
            System.out.println("Angka ini adalah Ganjil.");
        } else {
            System.out.println("Angka ini adalah Genap.");
        }

        input.close();
    }
}
