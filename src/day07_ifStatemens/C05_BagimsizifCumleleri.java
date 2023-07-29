package day07_ifStatemens;

import java.util.Scanner;

public class C05_BagimsizifCumleleri {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*

         */

        if (kenar1 == kenar2 && kenar1== kenar3){

            System.out.println("Eskenar ucgen");
        }


    }
}
