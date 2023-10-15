
import java.util.Scanner;


public class day7_percabangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai = 40;
        
        if(nilai >=1000){
            System.out.println("A");
        }else if(nilai >=90){
            System.out.println("B");
        }else if(nilai >=80){
            System.out.println("C");
        }else {
            System.out.println("P");
        }
        
    }
}
