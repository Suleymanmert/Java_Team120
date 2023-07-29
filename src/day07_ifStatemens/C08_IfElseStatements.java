package day07_ifStatemens;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar2>0){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");

        }

    }
}

     /*
         Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
                 yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

         Soru 4- Kullanicidan bir karakter girmesini isteyin,
                 girilen karakterin buyuk harf olup olmadigini yazdirin.

         Soru 5- Kullanicidan bir harf isteyin,
                 girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
                 yoksa girilen harfi yazdirin
      */
