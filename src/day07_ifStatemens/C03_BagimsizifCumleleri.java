package day07_ifStatemens;

import java.util.Scanner;

public class C03_BagimsizifCumleleri {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir pozitif tamsayi isteyin,
        //sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen opzitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 5 == 0 ) System.out.println(" sayi 5' in tam kati");
    }
}
