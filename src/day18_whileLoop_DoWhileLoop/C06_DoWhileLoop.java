package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplamak uzere pozitif sayılar isteyin
        // kullanici islemi bitirmek icin 0 a basmalıdir
        // sayidan 0'a kadar olan tum pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin

        /* önce while loop ile yapalım

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilensayi =9;


        while (girilensayi !=0){

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplamak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();

            if (girilensayi !=0){
                toplam += girilensayi;
                sayac++;
            }

        }
        System.out.println("Girilen " + sayac + "adet sayinin toplami : " + toplam);
        */
        // do while ile yapalim

        Scanner scanner;
        int sayac = 0 ;
        int toplam = 0 ;
        int girilensayi;
        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();
            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }
        }while (girilensayi != 0);
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);

    }
}
