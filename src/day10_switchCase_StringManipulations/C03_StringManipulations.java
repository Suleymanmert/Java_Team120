package day10_switchCase_StringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {

        /*
        String manipulation,
        verilen bir String uzerinde hazir method lar akullanarak
        -degişiklik yapmak
        - veya verilen String üzerindeki bir bilgiyi
        almak icin yaptigimiz tum işlemler
         */

        String str = "Java Candir";

        // str in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // str i tum harfleri buyuk olacak sekilde yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        // str i tamamen kucuk harflerden olusan  bir metne  cevirin

        str = str.toLowerCase();

        System.out.println(str);// java candir

    }
}
