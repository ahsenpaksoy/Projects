package librarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Runner {


    public static void main(String[] args) {

        ArrayList<List> kutuphane = new ArrayList<>();

        List b1 = book("book","Ask","Elif Safak","2006",  "No");
        List b2 = book("book","Suc ve Ceza","Dostoyevski","1950",  "No");
        List b3 = book("book","Hayvan Ciftligi","Georg Orwill","1950",  "No");
        List b4 = book("book","Bitpalas","Elif Safak","2006",  "No");
        List b5 = book("book","Ustam","Elif Safak","2010",  "No");
        List b6 = book("book","Devlet","Plato","1950",  "No");
        List b7 = book("magazine","Das Auto","UNKNOWN","2023",  "No");

        kutuphane.add(b1);
        kutuphane.add(b2);
        kutuphane.add(b3);
        kutuphane.add(b4);
        kutuphane.add(b5);
        kutuphane.add(b6);

        //listItemsInKutuphane(kutuphane);
        //listItemsInKutuphaneWRTAuthor(kutuphane,"ELIF SAFAK");
        //listItemsInKutuphaneWRTPYear(kutuphane,"1950");
        menu(kutuphane);




    }

    public static List<String> book(String kind,String bName, String aName, String pYear, String onBorrow ){
        ArrayList<String> bList = new ArrayList<>();
        bList.add(kind);
        bList.add(bName);
        bList.add(aName);
        bList.add(pYear);
        bList.add(onBorrow);

        return bList;

    }

    public static void menu(ArrayList kutuphane){
do {
    System.out.println("KUTUPHANE BILGI SISTEMI");
    System.out.println("--------------------------");
    System.out.println("1- Kutuphaneye ekle: ");
    System.out.println("2- Kutuphanede ara: ");
    System.out.println("3- Kutuphaneden sil: ");
    System.out.println("Seciminiz: ");
    Scanner scan = new Scanner(System.in);
    String sec = scan.next();


        switch(sec) {
            case "1":
                kutuphaneyeEkle(kutuphane);
                break;
            case "2":
                findModul(kutuphane);
                break;
            case "3":
                System.out.println("Hazirlik asamasinda");
                break;
            default:
                    System.out.println("Hatali giris yaptiniz. 1,2 veya 3 giriniz");

        }
} while (true);

    }

    // Sor: Kutuphaneyi alip ekrana ciktisni yapan metodu yaz
    public static void listItemsInKutuphane(ArrayList<List> kutuphane){
        System.out.printf("%20s %20s %20s %20s %20s","GENRE","BOOK NAME","AUTHOR NAME","P.YEAR", "ON LOAN");
        System.out.println("\n-----------------------------------------------------------------------------------------------------------");
        for(List item:kutuphane){
            for(Object itemList: item){
                System.out.printf("%20s",itemList.toString().toUpperCase());

            }
            System.out.println("\n");
        }

    }

    // Sor: Kutuphaneyi alip ekrana ciktisni yapan metodu yaz
    public static void listItemsInKutuphaneWRTAuthor(ArrayList<List> kutuphane, String authorName){
        System.out.printf("%20s %20s %20s %20s %20s","GENRE","BOOK NAME","AUTHOR NAME","P.YEAR", "ON LOAN");
        System.out.println("\n-----------------------------------------------------------------------------------------------------------");
        for(List item:kutuphane){
            String temp="";
            if(item.get(2).toString().equalsIgnoreCase(authorName)){
                for(Object itemList: item){
                    System.out.printf("%20s",itemList.toString().toUpperCase());

                }
                System.out.println("\n");
            }

            }


        }

    public static void listItemsInKutuphaneWRTPYear(ArrayList<List> kutuphane, String pYear){
        System.out.printf("%20s %20s %20s %20s %20s","GENRE","BOOK NAME","AUTHOR NAME","P.YEAR", "ON LOAN");
        System.out.println("\n-----------------------------------------------------------------------------------------------------------");
        for(List item:kutuphane){
            String temp="";
            if(item.get(3).toString().equalsIgnoreCase(pYear)){
                for(Object itemList: item){
                    System.out.printf("%20s",itemList.toString().toUpperCase());

                }
                System.out.println("\n");
            }

        }
    }

    public static void kutuphaneyeEkle(ArrayList kutuphane){
        Scanner scan = new Scanner(System.in);

        System.out.print("Eklenecek tur? ");
        String kind = scan.nextLine();
        System.out.print("Name? ");
        String bName = scan.nextLine();
        System.out.print("Author name? ");
        String aName = scan.nextLine();
        System.out.print("Publish year? ");
        String pYear = scan.nextLine();
        String onLoan ="No";

        List item = book(kind,bName,aName,pYear,onLoan);
        kutuphane.add(item);
        System.out.println("Basari ile eklendi...");
        System.out.println("Baska ekleme yapmak istermisiniz..");
        if(scan.next().equalsIgnoreCase("E")) {
            kutuphaneyeEkle(kutuphane);
        }

    }

    public static void findModul(ArrayList kutuphane){
        System.out.println("Yazara gore arama yapmak icin 1");
        System.out.print("Yila gore gore arama yapmak icin 2 \n seciniz");
        Scanner scan = new Scanner(System.in);
        String sec = scan.next();
        if(sec.equalsIgnoreCase("1")){
            System.out.println("Yazar adi? ");
            scan.nextLine();
            String ad = scan.nextLine();
            listItemsInKutuphaneWRTAuthor(kutuphane,ad);
            return;
        }

        if(sec.equalsIgnoreCase("2")){
            System.out.println("Publishing year? ");
            String year = scan.next();
            listItemsInKutuphaneWRTPYear(kutuphane,year);
            return;
        }
        System.out.println("Hata olustu.Yeniden seciniz");
        findModul(kutuphane);



    }
    }




