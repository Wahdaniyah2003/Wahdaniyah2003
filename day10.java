
import java.util.HashMap;
import java.util.Scanner;


public class day10 {
    public static void main(String[] args) {
        // Definisikan golongan dan gaji
        HashMap<String, Integer> golongan = new HashMap<>();
        golongan.put("I", 4000000);
        golongan.put("II", 7000000);
        golongan.put("III", 10000000);

        // Input golongan dan lama kerja karyawan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan golongan karyawan: ");
        String golonganKaryawan = input.next();
        System.out.print("Masukkan lama kerja karyawan (tahun): ");
        int lamaKerjaKaryawan = input.nextInt();

        // Hitung gaji karyawan
        int gajiKaryawan = golongan.get(golonganKaryawan);

        // Hitung bonus karyawan
        int bonus = 0;
        if (lamaKerjaKaryawan > 5) {
            bonus = 100000 * lamaKerjaKaryawan;
        }

        // Cetak gaji karyawan
        System.out.println("Gaji karyawan adalah Rp" + (gajiKaryawan + bonus));
    }
}


