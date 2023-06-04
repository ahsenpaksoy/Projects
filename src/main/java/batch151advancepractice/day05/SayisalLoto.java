package batch151advancepractice.day05;

import java.util.Random;
import java.util.Scanner;

public class SayisalLoto {

    /*
      Proje: Sayısal Loto Uygulaması

       1) Kullanici Bileti icin sistem tarafindan rastgele n tane sayı üretilsin.
       2) Loto sonucu icin de rastgele n tane sayı ile üretilsin.
       3) Sayısal lotoda tekrarlı sayılar olmasin.
       4) n(hane sayısı), sayılar için kullanicidan min ve max degerler alınsın.
       5) loto sonucu ile bilet ile karsılastırılsın,
       6) kac eslesme oldugu kullanıcıya bildirilsin.
       7)  Eger eslesme varsa;
           Max deger>50 ise ==>buyuk ikramiye
           Max deger>100 ise ==>super ikramiye
           Max deger>0 ise ==>amorti kazandiniz yazdirsin

*/
    public static void main(String[] args) {
        startLoto();

    }

    public static void startLoto() {

        Scanner input = new Scanner(System.in);
        System.out.println("Loto icin lutfen hane sayisi giriniz");
        int slots = input.nextInt(); //slots kac haneli olacagini verir
        System.out.println("Lutfen sayilar icin min deger giriniz...");
        int min = input.nextInt();
        System.out.println("\"Lutfen sayilar icin max deger giriniz...");
        int max = input.nextInt();

        int ticketArr[] = new int[slots]; //kullanicinin biletinin sonuclari
        int lotoArr[] = new int[slots]; //loto sonucu

        Random rnd = new Random();
        int rnd1 = 0;
        int rnd2 = 0;
        boolean isRepeat; //ayni sayiyi bir daha uretmesin diye

        for(int i=0; i<slots; i++){
            do{
                isRepeat = false; //isRepeat tekrarlaniyor mu hayir tekrarlanmiyor o zaman loop calissin. uretilen sayilar
                                   // tekrarlanmiyorsa do while loop calisir.
                rnd1 = rnd.nextInt(max+1-min)+min;

                for (int j = 0; j < i; j++) {
                    if(lotoArr[j]==rnd1){
                        isRepeat=true;
                        break; //dizide varsa array'e ekleme
                    }
                }
            }while(isRepeat); //tekrarlanan bir sayi uretirse tekrar do while loop'un basina don.

            lotoArr[i] = rnd1;

            //ticketArr[]

                do{
                    isRepeat = false; //isRepeat tekrarlaniyor mu hayir tekrarlanmiyor o zaman loop calissin. uretilen sayilar
                    // tekrarlanmiyorsa do while loop calisir.
                    rnd2 = rnd.nextInt(max+1-min)+min;

                    for (int j = 0; j < i; j++) {
                        if(ticketArr[j]==rnd2){
                            isRepeat=true;
                            break; //dizide varsa array'e ekleme
                        }
                    }
                }while(isRepeat); //tekrarlanan bir sayi uretirse tekrar do while loop'un basina don.

               ticketArr[i] = rnd2;

        }
        System.out.print("Benim biletim : ");
        for (int i = 0; i < slots; i++) {
            System.out.print(ticketArr[i] + " ");
        }

        System.out.println();

        System.out.print("Loto sonucu : ");

        for (int i = 0; i < slots; i++) {
            System.out.print(lotoArr[i] + " ");
        }

        System.out.println();

        int result = compare(ticketArr,lotoArr);
        if(result>0){
            if(max>50){
                System.out.println("Tebrikler " + result + " eslesme var. Buyuk ikramiye kazandiniz...");
            }else if(max>100){
                System.out.println("Tebrikler " + result + " eslesme var. Super ikramiye kazandiniz...");
            }else{
                System.out.println("Tebrikler " + result + " eslesme var. Amorti kazandiniz...");
            }

        }else{
            System.out.println("Malesef hic eslesme yok bir dahaki sefere...");
        }


    }

    public static int compare(int[] ticketArr, int[] lotoArr) {
        int sayac = 0;
        for (int i = 0; i < ticketArr.length; i++) {
            for (int j = 0; j < lotoArr.length; j++) {
                if(ticketArr[i]==lotoArr[j]){
                    sayac++;
                }
            }
        }
        return sayac;

    }


}
