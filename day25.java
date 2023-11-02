import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan Umur Anda :");
        
        String umur = scn.nextLine();
        System.out.println("Umur, " + umur + "!");
        scn.close();
    }
}
