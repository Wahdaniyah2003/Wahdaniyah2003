
public class day22 {
    public static void main(String[] args) {
        //mendeklarasikan array dgn 5 elemen
        int[] angka = new int[5];
        
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;
        
        System.out.println("Isi Array angka :");
        for(int i = 0; i < angka.length; i++){
            System.out.println("Angka ke-" + i + ": " + angka[i]);
        }
    }
}
