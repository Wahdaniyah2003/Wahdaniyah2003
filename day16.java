
import java.util.Scanner;


public class day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukka gaji Pokok :");
        
        double gaji = input.nextDouble();
        double gajiLembur = 43000;
        System.out.println("Lama Lembur :");
        
        int lama =input.nextInt();
        double Gaji = 400;
        int GajiLembur = 0;
        double GajiBersih = Gaji+(lama*GajiLembur);
        
        System.out.println("Gaji Bersih: "+ GajiBersih);
    }
}
