package day32_stringBuilderOlusturma;

public class C02_SitringBuilderMethodlari {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da güzellesiyor");


        System.out.println(sb1.reverse()); // royisellezüg ad ahad avaJ

        System.out.println(sb1);//royisellezüg ad ahad avaJ
        sb1.reverse();

        System.out.println(sb1);//Java daha da güzellesiyor

        // sondaki harfi silelim
        sb1.deleteCharAt(sb1.length()-1);

        System.out.println(sb1);// Java daha da güzellesiyo

        sb1.delete(9,12);
        System.out.println(sb1);// Java daha güzellesiyo

        sb1.insert(sb1.length(),"r.");
        System.out.println(sb1); // Java daha güzellesiyor.

        String str = "Java da bundan memnun";
        sb1.insert(9,str,4,7);
        System.out.println(sb1); //
        System.out.println(sb1); // Java daha da güzellesiyor.
    }
}
