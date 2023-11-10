
import java.util.Scanner;


public class day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Angka :");
        int angka = input.nextInt();
        
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.println("Master Class");
        }else if(angka % 3 == 0){
            System.out.println("Pride of 3");
        }else if(angka % 5 == 0){
            System.out.println("Pride of 5");
        }else{
            System.out.println("Angka Tidak Habis dibagi 3 & 5");
        }
    }
}
