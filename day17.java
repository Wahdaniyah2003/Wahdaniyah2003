
import java.util.Scanner;


public class day17 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Umur Kamu :");
        int Bilangan = input.nextInt();
        
        if(Bilangan >= 22){
            System.out.println("Umur Kamu Sudah Cukup "+"Silahkan Olahraga Sesuka mu");
        }else {
            System.out.println("Umur Kamu Sudah Lebih Dari Cukup ");
        }
       
    }
}
