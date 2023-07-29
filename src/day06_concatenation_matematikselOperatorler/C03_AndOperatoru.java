package day06_concatenation_matematikselOperatorler;

public class C03_AndOperatoru {
    public static void main(String[] args) {

        System.out.println( 5 > 3 && 6 > 4); // true and true ==> true

        System.out.println( 5 < 3 && 6 > 4);// false and true ==> false

        System.out.println( 5 > 3 && 6 <= 4);// true and false ==> false

        System.out.println( 5 <= 3 && 6 <= 4);// false and false ==> false


        /* && oparatoru mukemmıllıyetcidir


         && operatoru ile baglanan booleon ifadeler kac tane olursa olsun
             hepsi true ise sonuc true,
             bunun disindakı tum durumlarda false
             bu yonuyle matametikteki carpmaya benzer

             1*1*1*1*1*1=1
             1*0*1*1*1*1=0
             1*0*0*0*0*0=0

         */

        // bir sayinin hem 2, hem de 3, hemde de 5 ile bölunebilmesi lazim

        int sayi = 24;

        System.out.println( sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0);

        //                  true         &&  true          &&   false ==> false


        // ssyı 0 veya buyuk ve 100 veya daha kucuk olmalıdır
        // sayi 0 ile 100 arasında olmalıdır (0 ve 100 dahil)


        System.out.println( sayi >= 0 && sayi <= 100);
        //                  true     &&   true  ==> true





    }
}
