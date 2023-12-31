package day10_switchCase_StringManipulations;

public class C05_eguals {
    public static void main(String[] args) {
        String str1="Mehmet";
        String str2 ="MEHMET";
        String str3 ="mehmet";
        String str4 ="MEHmet";

        System.out.println(str1 == str2);

        System.out.println(str3 == str4.toLowerCase());// mehmet == mehmet  false

        System.out.println(str2 == str3.toUpperCase());// MEHMET == MEHMET  false

        /*
             String lerde  == bekledigimiz sonuclari DONMEYEBILIR
             bunun sebebi String class ini olustururken yapılan bazi özelliklerdeir
             bu konu ileriide detayli bir sekilde anlatilacak


             Verilen iki String in metinsel olarak ayni olup olmadigini
             kontrol etmek ici.n == yerine eguals() kullanilir


             eguals() ' u bire bir ayni olan iki metin icin true,
             farkli metinler icin false sonucu uretir(döndürür)
             bu karsilastirmada metnin ayni olmasi yanin da
             buyuk kucuk harf durumunu da kontrol eder(case servitive)


             EGER case sensitive olmadan metinleri karsilamak istersensiz
             egualsIgnorCase()'u kullaninir
             
         */

        System.out.println(str1.equals(str2)); // Mehmet -- MEHMET  false
        System.out.println(str3.equals(str4.toLowerCase())); // mehmet == mehmet   true
        System.out.println(str2.equals(str3.toUpperCase())); // MEHMET == MEHMET  true

        System.out.println(str1.equalsIgnoreCase(str2)); // Mehmet--MEHMET true
        System.out.println(str1.equalsIgnoreCase(str3)); // Mehmet -- mehmet true
        System.out.println(str3.equalsIgnoreCase(str4)); //mehmet -- MEHmet true




    }
}
