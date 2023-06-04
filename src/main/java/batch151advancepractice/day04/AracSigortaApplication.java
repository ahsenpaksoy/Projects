package batch151advancepractice.day04;

import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {

        start();

    }//main

    public static void start() {
        Scanner input = new Scanner(System.in);
        boolean isFail;
        do {
            isFail = false;
            System.out.println("Lutfen tarife donemini giriniz" +
                    "\n1==>Haziran 2023\n2==>Aralik 2023");
            int term = input.nextInt();
            if (term == 1 || term == 2) {
                Arac arac = new Arac();// arac olusturduk
                System.out.println("Lutfen arac tipini giriniz");
                System.out.println("otomobil,kamyon,otobus,motosiklet");
                arac.type = input.next().toLowerCase();
                arac.prim = arac.countPrim(term);
                int select;//tamamMi variable
                String termName = term == 1 ? "Haziran 2023" : "Aralik 2023";
                if (arac.prim > 0) {
                    System.out.println("Hesaplama Basariyla Tamamlandi");
                    System.out.println("Arac Tip : " + arac.type);
                    System.out.println("Tarife Donemi : " + termName);
                    System.out.println("Aracinizin sigorta primi odemesi : " + arac.prim);
                    System.out.println("Yeni islem icin ==> 1\n Cikmak icin ==> 0 basiniz");
                    select = input.nextInt();//tamamMi Devam Mi?
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;
                    }//else

                } else {
                    System.out.println("Hesaplama basarisiz ");
                    System.out.println("Yeni islem icin ==>1\nCikis icin ==>0 giriniz");
                    select = input.nextInt();
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;//uygulamadan cikisi saglanir
                    }
                }

            } else {
                System.out.println("Hatali Giris");
                isFail = true;
            }
        } while (isFail);
        System.out.println("Yine Bekleriz");

    }//start()
}
