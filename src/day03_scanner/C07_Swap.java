package day03_scanner;

import java.util.Scanner;

public class C07_Swap {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayi giriniz");

        int ilkSayi= scanner.nextInt();

        System.out.println("Lutfen ikiçnci sayiyi giriniz");
         int ikinciSayi = scanner.nextInt();

         int temp = ilkSayi;

         ilkSayi = ikinciSayi;

         ikinciSayi = temp;
        System.out.println("ilk sayinin yeni dewgeri : " + ilkSayi);
        System.out.println("ikinci sayinin yeni degeri : " + ikinciSayi);






    }





}
