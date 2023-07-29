package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {

    public static void main(String[] args) {

        int[] arrTek={3,7,1,9};
        //Bu array!in tum elementlerini toplayin

        int toplam=0;

        for (int i = 0; i < arrTek.length; i++) {

            //arrTek[i] index degistikce bize array'deki  tum elementleri sirasiyla getirir
            toplam+=arrTek[i];

        }
        System.out.println("arrTek'in elementleri toplami : "+ toplam);

        int[][] sayilar={{1,2,5},{7,4},{9},{3,0,1}};
        
        //arr[i] inner array'leri getirir.
        //arr[i][j] bize int elementleri verir
        //yani kat sayisi kadar index'e yani forloop'a ihtiyacimiz var

        toplam=0;

        for (int i = 0; i <sayilar.length ; i++) {// disardaki forloop outer Array'i kontrol eder

            for (int j = 0; j <sayilar[i].length ; j++) { // icerdeki forloop inner array'leri kontrol eder

                // sayilar[i][j] sirasiyla her bir int elementi getirir
                toplam+=sayilar[i][j];
            }
            
        }

        System.out.println("sayilar array'in elementleri toplami : "+ toplam);
    }
}
