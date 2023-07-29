package day07_ifStatemens;

import java.util.Scanner;

public class C06_BagimsizifCumleleri {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tam sayi isteyin
        // sayi 3 veya 5 ile bölunebiliyorsa
        //" Güzel sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen poaitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0) System.out.println("Guzel sayi");
    }
}
