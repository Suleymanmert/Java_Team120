package day02_dataTurleri_variable;

public class C04_StringDataTurleri {
    public static void main(String[] args) {

        int sayi = 20;

        System.out.println(sayi); // 20

        String isim = "Berk Yilmaz";

        System.out.println(isim.toUpperCase());// BERK YILMAZ
        System.out.println(isim.toLowerCase());// berk yilmaz

        System.out.println(isim);// Berk Yilmaz

        String str1= "Java";
        String str2="Candir";

        System.out.println(str1+str2);
        // iki tane string + isareti ile toplamaya calisilirsa
        // java o iki string i BIRLESTIRIR
        // JavaCandir


        String str3 = "30";
        String str4 = "40";

        System.out.println(str3 + str4); // 3040

        // verilen isim ve soyısımse
        // girilen ali uzunkavak databas e kaydedildi
        // seklinde yazdirin

        String adi = "Ramazan";
        String soyadi = "Tatar";

        System.out.println("Girilen " + adi + " " + soyadi + " databas e kaydedildi");

        // "" arasındakı bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasında birakılan bosluklar metne yansımaz
        //  System.out.println("Girilen " + adi + " " + soyadi + " databas e kaydedildi");




    }






}
