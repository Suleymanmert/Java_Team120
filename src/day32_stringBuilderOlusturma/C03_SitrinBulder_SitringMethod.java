package day32_stringBuilderOlusturma;

public class C03_SitrinBulder_SitringMethod {

    public static void main(String[] args) {

        String str ="Java candir";

        StringBuilder sb1 = new StringBuilder();
        // sb1 = str;
        // Non-primitive data türlerine farklı dat turleri arasinda atama yapabilmek iciçn
        // bu iki non-prımıtıve dat turu arasında Parent-Child iliskisi olmalidir

        sb1=new StringBuilder(str);
        System.out.println(sb1); // Java candir

        System.out.println(sb1.substring(0, 4));// Java

        System.out.println(sb1); // Java candir

        // sb1 J harfi iceriyor mu?

        System.out.println(sb1.toString().contains("J")); // true

        // StringBuilder da olmayip, String de methodlari kullanmak istersek
        // StringBuilder.toString() ile String e gecis yapabiliriz
        // bu durumda calisan methodların sb i kalici olarak degistirmeyeceklerini UNUTMAMALIYIZ
    }
}
