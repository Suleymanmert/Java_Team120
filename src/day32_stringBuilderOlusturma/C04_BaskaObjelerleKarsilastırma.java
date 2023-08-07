package day32_stringBuilderOlusturma;

public class C04_BaskaObjelerleKarsilastırma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str ="Java";

        System.out.println(sb1== sb2); // false
        System.out.println(sb1.equals(sb2));//false

        // SB da equalse methodu yerine compareTO() kullanilir

        System.out.println(sb1.compareTo(sb2));// 0

        // System.out.println(sb1 == str);

        System.out.println(sb1.equals(str));// itiraz etmez ama false doner

        // equalse sadece objenin kendisi ile karsilastirildigi durumda true doner

        System.out.println(sb1.equals(sb1)); //
    }
}
