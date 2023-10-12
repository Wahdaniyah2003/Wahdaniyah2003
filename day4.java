package day4;
import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String petName, ownerName, breed;
        int age;

        System.out.print("Masukkan Nama Hewan Peliharaan: ");
        petName = scan.nextLine();

        System.out.print("Masukkan Nama Pemilik: ");
        ownerName = scan.nextLine();

        System.out.print("Masukkan Jenis Hewan (Misalnya, Kucing, Anjing, dsb.): ");
        breed = scan.nextLine();

        System.out.print("Masukkan Umur Hewan (dalam tahun): ");
        age = scan.nextInt();

    
        System.out.println("===============================================");
        System.out.println("Hewan peliharaan bernama " + petName + " milik " + ownerName);
        System.out.println("Jenis hewan ini adalah " + breed);
        System.out.println("Hewan ini berumur " + age + " tahun");
       
    }
}
