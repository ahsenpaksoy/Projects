package coffeemachine;

import java.util.Scanner;

public class KahveSecimi {
    Kahve kahve  = new Kahve();
    Scanner scan = new Scanner(System.in);

    public void selectCoffee(){
        System.out.println();
        System.out.println(" ----- COFFEE MACHINE READY TO ORDER ----- ");
        System.out.println();

        do{

            System.out.println("Hangi kahveyi istersiniz?");
            System.out.println("1 - Turk Kahvesi");
            System.out.println("2 - Filtre Kahve");
            System.out.println("3 - Espresso");
            System.out.println("Seciminiz : ");
            kahve.hangiKahve = scan.nextLine().trim();

            if(kahve.hangiKahve.equalsIgnoreCase("turk kahvesi") ||
                    kahve.hangiKahve.equalsIgnoreCase("filtre kahve") ||
                    kahve.hangiKahve.equalsIgnoreCase("espresso")){
                System.out.println(kahve.hangiKahve + " hazirlaniyor...");
                isMilk(kahve);
                isSugar(kahve);
                selectBoyut(kahve);
                printInfo(kahve);
                break;
            }else{
                System.out.println("Hatali giris yaptiniz! Tekrar deneyiniz...");
            }
        }while(true);
    }

    public void printInfo(Kahve kahve){
        System.out.println();
        System.out.println("......");
        System.out.println("*****  " + kahve.hangiKahve + " " + kahve.boyut + " hazirdir. Afiyet olsun...");
    }

    public void isMilk(Kahve kahve){
        do{
            System.out.println("Sut eklememizi ister misiniz? (Evet veya Hayir olarak cevaplayiniz.) : ");
            kahve.sut = scan.next();
            if(kahve.sut.equalsIgnoreCase("Evet")){
                System.out.println("Sut ekleniyor...");
                break;
            }else if(kahve.sut.equalsIgnoreCase("Hayir")){
                System.out.println("Sut eklenmiyor...");
                break;
            }else{
                System.out.println("Hatali giris!");
            }
        }while(true);
    }

    public void isSugar(Kahve kahve){
        do{
            System.out.println("Seker eklememizi ister misiniz? (Evet veya Hayir olarak cevaplayiniz.) : ");
            kahve.seker = scan.next();
            if(kahve.seker.equalsIgnoreCase("Evet")){
                System.out.println("Kac seker olsun?");
                kahve.kacSeker = Math.abs(scan.nextInt());
                System.out.println(kahve.kacSeker + " seker ekleniyor...");
                break;
            }else if(kahve.seker.equalsIgnoreCase("Hayir")){
                System.out.println("Seker eklenmiyor...");
                break;
            }else{
                System.out.println("Hatali giris!");
            }
        }while(true);
    }

    public void selectBoyut(Kahve kahve){
        scan.nextLine();
        do{
            System.out.println("Kahveniz hangi boyutta olsun? (Buyuk boy, orta boy, kucuk boy olarak giriniz.) : ");
            kahve.boyut = scan.nextLine();
            if(kahve.boyut.equalsIgnoreCase("buyuk boy") ||
                    kahve.boyut.equalsIgnoreCase("orta boy") ||
                    kahve.boyut.equalsIgnoreCase("kucuk boy")){
                System.out.println("Kahveniz " + kahve.boyut + " hazirlaniyor");
                break;
            }else{
                System.out.println("Hatali secim...");
            }
        }while(true);

    }
}
