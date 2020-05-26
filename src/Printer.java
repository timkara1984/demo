public class Printer {


    public static void print(boolean numbers,int a){
        System.out.println(numbers?a:RomanNumeral.arabicToRoman(a));
    }
}
