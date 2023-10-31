import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Pretest: ");
        double nilaiPretest = scanner.nextDouble();
        
        if (nilaiPretest > 50) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
        
        scanner.close();
    }
}
