import java.util.Scanner;

public class day20{
    public static void main(String[] args) {
        //belajar penggunaan input
        //membuat objek scanner
        Scanner scan = new Scanner(System.in);
        
        //memasukkan sebuah kelas
        System.out.println("Masukkan Sebuah Kelas: ");
        String inputString = scan.nextLine();
        
        //memasukkan sebuah angka
        System.out.println("Masukkan Sebuah Angka : ");
        String angka = scan.nextLine();
        
        //menampilkan input yang dimasukkan pengguna
        System.out.println("Anda Memasukkan String : "+ inputString);
        System.out.println("Anda Memasukkan Angka : "+ angka );
        
        scan.close();
    }
    
}
