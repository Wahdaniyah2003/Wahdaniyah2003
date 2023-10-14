
public class day6 {
    public static void main(String[] args) {
       
        int c = 10;
        int d =  4;
        
        int a = c + d;//penjumlahan
        int b = c - d;//pengurangan
        int e = c * d;//perkalian
        int f = c / d;//pembagian
        int g = c % d ;//modulus
        
        System.out.println("Hasil Penjumlahan: "+ a);
        System.out.println("Hasil Pengurangan: "+ b);
        System.out.println("Hasil Perkalian: "+ e);
        System.out.println("Hasil Pembagian: "+ f);
        System.out.println("Hasil Modulus: "+ g);
        
        System.out.println("===================================================");
        
        //operator logika
        boolean n = true;
        boolean w = false;
        
        boolean result4 = n && w;
        boolean result5 = n || w;
        boolean result6 = !n;
        
        System.out.println("Hasil result4 && result4;");//operator AND
        System.out.println("Hasil n || w");//operator OR
        System.out.println("Hasil !n");//operator Not
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
