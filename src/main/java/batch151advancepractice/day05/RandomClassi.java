package batch151advancepractice.day05;

import java.util.Random;

public class RandomClassi {
    public static void main(String[] args) {

        Random rnd = new Random();
        int sayi;
        sayi = rnd.nextInt();
        System.out.println("sayi : " + sayi);// -2 milyar ile +2 milyar arasindaki sayilardan birini bize dondurur.

        //int sayi1 = rnd.nextInt(n); 0,1,2,3,4...(n-1)
        int sayi1 = rnd.nextInt(5); // 0,1,2,3,4 ==>[0,5) arasindaki degerlerden birini dondurur.
        System.out.println("sayi1 = " + sayi1);

        //int sayi2 = rnd.nextInt(n)+m;   0+m,1+m,2+m,3+m,4+m...(n-1+m) m==>kaydirma degeri (her sayi m kadar kayacak)
        int sayi2 = rnd.nextInt(5)+2;
                                                // 0,1,2,3,4  (+2 yazmasaydik bunlari verecekti)
        System.out.println("sayi2 = " + sayi2); //2,3,4,5,6 degerlerini verebilir

        //int sayi3 = k * rnd.nextInt(5)+2;  k aralarindaki mesafeyi gosterir
        int sayi3 = 3*rnd.nextInt(5)+2;  // 2,3,4,5,6  verecekti 3* olmasaydi
        System.out.println("sayi3 = " + sayi3); //2,5,8,11,14 sayi uretirken aralarindaki mesafe 3 olacak yani 3 er artacak.
                                               //3* ==> sayilar arasindaki mesafeyi gosterir

        int max = 10;
        int min = 5;
        //5,6,7,8,9,10
        int sayi4 = rnd.nextInt(max); //0,1,2,3,4,5,6,7,8,9 verir. 10 dahil degil [0,max)
        System.out.println("sayi4 = " + sayi4);

        int sayi5 = rnd.nextInt(max+1); //0,1,2,3,4,5,6,7,8,9,10 verir. [0,max]
        System.out.println("sayi5 = " + sayi5);

        int sayi6 = rnd.nextInt(max+1)+min; //5,6,7,8,9,10,11,12,13,14,15
        System.out.println("sayi6 = " + sayi6);

        int sayi7 = rnd.nextInt(max+1-min)+min; //5,6,7,8,9,10
        System.out.println("sayi7 = " + sayi7);  //-min ile ne kadarsa o kadar sola kaydiriyor



    }
}
