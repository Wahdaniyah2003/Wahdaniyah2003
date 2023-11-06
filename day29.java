
import java.util.Scanner;


public class day29 {
    public static void main(String[] args) {
        //Membuat inputan angka yang outputnya menampilkan jumlah angka yang habis dibagi tiga
        System.out.println("Masukkan angka : ");
        Scanner scn = new Scanner(System.in);   
        int angka  =  scn.nextInt();
        for (int i = 1; i <= angka; i++) {
        
            if(i % 3 == 0){
                System.out.println(i+ "");
            }
            
        } 
    }
}
     



    

