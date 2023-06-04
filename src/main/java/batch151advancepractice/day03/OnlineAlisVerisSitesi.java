package batch151advancepractice.day03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisVerisSitesi {

    static Scanner input = new Scanner(System.in);
    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double odenecekMiktar;

    public static void main(String[] args) {
        urunListesi.add("Saat Urun Kodu 0");
        urunListesi.add("Monitor Urun Kodu 1");
        urunListesi.add("Canta Urun Kodu 2");
        urunListesi.add("TV Urun Kodu 3");
        urunListesi.add("Kitap Urun Kodu 4");

        urunFiyatlari.add(150.0);
        urunFiyatlari.add(3000.0);
        urunFiyatlari.add(5000.0);
        urunFiyatlari.add(6000.0);
        urunFiyatlari.add(100.0);

        //List elemanlari sirasiyla alip fiytlarla eslestirir.

        List<String> yeniUrunler = new ArrayList<>();
        yeniUrunler.add("Taki Urun Kodu 5");
        yeniUrunler.add("Tencere Urun Kodu 6");
        yeniUrunler.add("Kiyafet Urun Kodu 7");
        urunListesi.addAll(yeniUrunler);

        List<Double> yeniUrunFiyatlari = new ArrayList<>();
        yeniUrunFiyatlari.add(9000.0);
        yeniUrunFiyatlari.add(200.0);
        yeniUrunFiyatlari.add(400.0);
        urunFiyatlari.addAll(yeniUrunFiyatlari);

        musteriSecim();


    }

    public static void musteriSecim() {

        urunListesiniGoster();
        System.out.println("Lutfen urun kodunu giriniz");
        int urunKodu = input.nextInt();
        if(urunKodu>=0 && urunKodu<=urunListesi.size()){
            System.out.println("Kac adet istediginizi giriniz");
            int adet = input.nextInt();
            double toplamUrunFiyati = urunFiyatlari.get(urunKodu)*adet;
           odenecekMiktar += toplamUrunFiyati;
           devamMi();
        }else{
            System.out.println("Lutfen gecerli bir urun kodu giriniz");
            musteriSecim(); //Recursive method
        }

    }

    private static void devamMi() {
        System.out.println("Alisverise devam etmek istiyor musunuz?" +
                "\n Evet ise ==> 1 \nHayir ise ==> 2'ye basiniz");
        int devamMi = input.nextInt();

        if(devamMi == 1){
            musteriSecim();
        }else if(devamMi == 2){
            odemeYap();
        }else{
            System.out.println("Lutfen gecerli bir secenek giriniz");
            devamMi(); //Recursive Method
        }
    }

    private static void odemeYap() {
        LocalDate kurulusGunu = LocalDate.of(2023,04,9);
        LocalDate date = LocalDate.now();
        if(date.isEqual(kurulusGunu)){
            slowPrint("TechPro Alisveris Sitesine Hosgeldiniz. " +
                    "\n Bugun Bizim Yil Donumumuz.\n Borcunuz Yoktur.",80);
        }else{
            slowPrint("TechPro Alisveris Sitesini Tercih Ettiginiz Icin Tesekkur Ederiz.",80);
            System.out.println("  Odenecek miktar : " + odenecekMiktar + " TL");
        }
    }

    private static void slowPrint(String metin, int gecikme) {
        for(char ch : metin.toCharArray()){
            System.out.print(ch);
            try {
                Thread.sleep(gecikme);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void urunListesiniGoster() {

        System.out.println("********************* Urun Listesi ************************");
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(i + " - " + urunListesi.get(i) + " Fiyat " + urunFiyatlari.get(i) + " TL ");

        }


    }
}
