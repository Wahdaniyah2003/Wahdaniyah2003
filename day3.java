
public class day3 {
    public static void main(String[] args) {
        //konversi String ke tipe data primitif
        
        // Mengkonversi String ke int
        String strInt = "42";
        int intValue = Integer.parseInt(strInt);
        System.out.println("konversi String ke tipe data primitif");
        System.out.println("String \"" + strInt + "\" dikonversi ke int: " + intValue);

        // Mengkonversi String ke double
        String strDouble = "3.14159";
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("konversi String ke tipe data primitif");
        System.out.println("String \"" + strDouble + "\" dikonversi ke double: " + doubleValue);
        
        //konversi tipe data primitif ke String
        
        // Mengkonversi int ke String
        int myInt = 20;
        String intAsString = Integer.toString(intValue);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("konversi tipe data primitif ke String");
        System.out.println("int " + intValue + " dikonversi ke String: " + intAsString);
     
        // Mengkonversi String ke double
        String strDoubleValue = "2.29";
        double parsedDouble = Double.parseDouble(strDoubleValue);
        System.out.println("String \"" + strDoubleValue + "\" dikonversi ke double: " + parsedDouble);

    }
}
