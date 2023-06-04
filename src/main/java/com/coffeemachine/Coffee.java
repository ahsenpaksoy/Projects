package com.coffeemachine;

import java.util.Scanner;

public class Coffee {

    public static void main(String[] args) {
        anaMenu();
    }

    static Scanner input = new Scanner(System.in);
    static String hangiKahve = "";
    static String sut;
    static String seker;
    static int kacSeker;
    static String boyut;

    public static void anaMenu(){
        System.out.println("***** Hangi kahveyi istersiniz? *****");
        System.out.println("1. Turk Kahvesi");
        System.out.println("2. Filtre Kahvesi");
        System.out.println("3. Espresso");
        System.out.println("Seciminiz : ");
        hangiKahve = input.nextLine().toLowerCase();

        if(hangiKahve.equalsIgnoreCase("Turk Kahvesi") ||
                hangiKahve.equalsIgnoreCase("Filtre Kahve") ||
                hangiKahve.equalsIgnoreCase("Espresso")){
            System.out.println(hangiKahve + " hazirlaniyor...");
            sut();
        }else{
            System.out.println("Hatali islem yaptiniz...");
            anaMenu();
        }
    }

    public static void sut(){
        System.out.println("Sut eklememizi ister misiniz? (Evet veya Hayir olarak cevaplayiniz");
        sut = input.next().toLowerCase();

        if(sut.equalsIgnoreCase("evet")){
            System.out.println("Sut ekleniyor...");
            seker();
        }else if(sut.equalsIgnoreCase("hayir")){
            System.out.println("Sut eklenmiyor...");
            seker();
        }else{
            System.out.println("Gecersiz islem yapildi");
            sut();
        }
    }

    public static void seker(){
        System.out.println("Seker istermisiniz ? (Evet veya Hayir cevabini veriniz.)");
        seker = input.next().toLowerCase();

        if(seker.equalsIgnoreCase("evet")){
            System.out.println("Kac seker istersiniz?");
            kacSeker = input.nextInt();
            input.nextLine(); //dummy kod
            System.out.println(kacSeker + " seker ekleniyor...");
            boyut();
        }else if (seker.equals("hayir")) {
            System.out.println("Seker eklenmiyor...");

            boyut();
        } else {
            System.out.println("Gecersiz islem yaptiniz.");
            seker();
        }
    }

    public static void boyut() {
        System.out.println("Hangi boyutta olsun (buyuk boy - orta boy - kucuk boy olarak giriniz.)");
        boyut = input.nextLine().toLowerCase();
        if (boyut.equals("buyuk boy") || boyut.equals("orta boy") || boyut.equals("kucuk boy")) {
            System.out.println("Kahveniz " + boyut + " hazirlaniyor.");
            sonuc();
        } else {
            System.out.println("Gecersiz boyut secimi...");
            boyut();
        }

    }

    public static void sonuc() {
        System.out.println(hangiKahve + " " + boyut + " hazirdir. Afiyet olsun !!!");
        // anaMenu(); // istege bagli
    }
}

