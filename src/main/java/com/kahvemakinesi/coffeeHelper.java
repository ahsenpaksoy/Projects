package com.kahvemakinesi;

import java.util.Scanner;

public class coffeeHelper {
    public static String kahveSecimi() {
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("----SECIM MENUSU---");
            System.out.println("1- Turk Kahvesi");
            System.out.println("2- Filtre Kahvesi");
            System.out.println("3- Espresso");
            System.out.print("Seciminiz(1, 2 veya 3 giriniz):");
            String kahve = scan.nextLine().trim().toLowerCase();

            if (kahve.equalsIgnoreCase("1") || kahve.equalsIgnoreCase("2") || kahve.equalsIgnoreCase("3")) {
                System.out.println(".......................................");
                return kahve;
            } else {
                System.out.println("Hatali giris yaptiniz sadece 1, 2 veya 3 giriniz");
            }
        } while (true);
    }

    public static String secSeker() {

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Kac seker istersiniz? (0-1-2-3-4-5):");
            String seker = scan.next().trim();
            Integer sekerValue = Integer.valueOf(seker);

            if (sekerValue >= 0 && sekerValue <= 5) {
                System.out.println(".......................................");
                return seker;
            } else {
                System.out.println("Hatali giris yaptiniz. Tekrar deneyin");
            }
        } while (true);
    }

    public static String secSut() {


        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sut secimi yapiniz (0 veya 1 giriniz) " + "\n"+
                    "0 : Sut istemiyorum" + "\n" + "1 : Sut istiyorum");
            String sut = scan.next().trim();
            Integer sutValue = Integer.valueOf(sut);

            if (sutValue == 0 || sutValue == 1) {
                System.out.println(".......................................");
                return sut;
            } else {
                System.out.println("Hatali giris yaptiniz. Tekrar deneyin");
            }
        } while (true);

    }

    public static String secBoyut() {

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kahveniz hangi boyutta olsun?" + "\n" + "1. buyuk boy" + "\n" + "2. orta boy" + "\n" + "3. kucuk boy" + "\n" + "1, 2 veya 3 giriniz");
            String boyut = scan.next().trim();
            Integer boyutValue = Integer.valueOf(boyut);
            if (boyutValue == 1 || boyutValue == 2 || boyutValue == 3) {
                return boyut;
            } else {
                System.out.println("Hatali giris yaptiniz. Tekrar deneyin");
            }
        } while (true);
    }

    public static void sonuc(String kahveTuru, String kahveBoyutu) {
        String kahve = null;
        switch (kahveTuru) {
            case "1":
                kahve = "Turk Kahvesi";
                break;
            case "2":
                kahve = "Filtre Kahve";
                break;
            case "3":
                kahve = "Espresso";
                break;
            default:
                break;

        }
        String boy = null;
        switch (kahveBoyutu) {
            case "1":
                boy = "Büyük boy";
                break;
            case "2":
                boy = "Orta boy";
                break;
            case "3":
                boy = "Kücük boy";
                break;
            default:
                break;

        }
        System.out.println(boy +" " + kahve + " hazirdir. Afiyet olsun...");
    }


    public static void kahvemakinesi() throws InterruptedException {
        String kahveTuru = coffeeHelper.kahveSecimi();
        String sutIstermi = coffeeHelper.secSut();
        String sekerMik = coffeeHelper.secSeker();
        String kahveBoyutu = coffeeHelper.secBoyut();
        Thread.sleep(5);
        sonuc(kahveTuru,kahveBoyutu);

        Scanner scan = new Scanner(System.in);
        System.out.println("Devam etmek icin herhangi bir tusa basiniz");
        String s = scan.nextLine();
        System.out.println("\n\n \n\n\n\n\n \n\n\n\n\n \n\n\n\n\n \n\n\n\n\n\n\n\n \n\n\n\n\n \n\n\n");


    }
}
