package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {


        // Kullanıcıdan bir tamsayı alıp, karesini yazdirin
        // Scanner ile kullanıcıdan bır bılgıyı 3 adimda alabiliriz

        // 1.adim : scanner objesi oluşturmak
        Scanner scanner = new Scanner(System.in);

        //2.adım : kullanıcıya ne ıstediginizi soyleyın

        System.out.println("Lutfen bir tamsayi giriniz");

        // 3. adim istediginiz datanin turune uygun bir variable olusturun
        //      ve scanner



        int girilenSayi = scanner.nextInt();

        // artik kullanıcının girdigi sayi kod ortamımıza kaydeddildi
        // bu variable i istedigimiz sekilde girebiliriz


        System.out.println("girilen sayinin karesi : " + girilenSayi*girilenSayi);






    }




}
