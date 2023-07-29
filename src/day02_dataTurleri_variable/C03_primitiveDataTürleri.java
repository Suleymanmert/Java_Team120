package day02_dataTurleri_variable;

public class C03_primitiveDataTürleri {

    public static void main(String[] args) {
        // 1- booleon : matiksal degerler olan true ve folse kabul eder
        boolean bl1= true;
        boolean bl2= false;

        // char '' içiçnde yazilir ve sadece 1 karakter kabul eder
        char ch1 = 'a';
        char ch2 = '2';
        char ch3 = '/';

        // tam sayi kabul eden variable türleri
        // 3- byte, 4- short,5- int, 6-long

        // turkiyede sehir nüfüslarini tutmak istiyoruz
        // data türü ayni olan variable olan aynidir
        int nufus = 2834250 ;
        int nufusBilecik = 30000;

        // bir sehirdeki noter sayisini tutacagiz
        short noterSayisiIstanbul = 456;


        float fl1 = 20f;
        float fl2 = 6f;

        float fl3= fl1/ fl2 ;

        System.out.println(fl3); // 3,33333

        // double bolme ıslemlerınde 0,0000000001 gibi bir hata yapabilir
        // 20/ 5=3,9999999999

        String str ="Hello World";


        System.out.println(str);//Hello World

        System.out.println("true veya false");

        System.out.println("str"); // str

        int sayi1=10;
        int sayi2=20;
        System.out.println(sayi1*sayi2);

        System.out.println("Verilen iki  sayinin carpimi :" + sayi1* sayi2);


    }






}
