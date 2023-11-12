
import java.util.Scanner;


public class day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Masukkan angka :");
        int angka = input.nextInt();
        for (i = 1; i <= angka; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
            
        }
    }
}
