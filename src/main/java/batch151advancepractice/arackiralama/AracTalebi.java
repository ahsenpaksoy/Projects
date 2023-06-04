package batch151advancepractice.arackiralama;

import java.time.LocalDate;
import java.util.Scanner;


public class AracTalebi {

    private String alSehir;
    private String tesSehir;

    private LocalDate alTarih;
    private LocalDate tesTarih;

    public AracTalebi(String alSehir, String tesSehir, LocalDate alTarih, LocalDate tesTarih) {
        this.alSehir = alSehir;
        this.tesSehir = tesSehir;
        this.alTarih = alTarih;
        this.tesTarih = tesTarih;
    }

    public AracTalebi() {
        Scanner scan = new Scanner(System.in);
        do {
            aracTalebi();
            System.out.println(toString());

            System.out.println("\nBilgileri Onayliyor musunuz(1:Evet)?");

            String cevap = scan.next();
            if (cevap.equals("1")) break;

        }while(true);


    }

    private void aracTalebi() {
        Integer ay = null;
        Integer yil = null;
        Integer gun = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Alinacak sehir?");
        this.alSehir = scan.next().trim();
        System.out.println("Teslim edilcek sehir?");
        this.tesSehir = scan.next().trim();
        System.out.println("Alis Gunu");
        gun = takeGun();
        System.out.println("Alis Ayi");
        ay = takeAy();
        System.out.println("Alis Yili");
        yil = takeYil();
        this.alTarih = LocalDate.of(yil, ay, gun);
        System.out.println("Teslim Gunu");
        gun = takeGun();
        System.out.println("Teslim Ayi");
        ay = takeAy();
        System.out.println("Teslim Yili");
        yil = takeYil();
        this.tesTarih = LocalDate.of(yil, ay, gun);
    }

    public String getAlSehir() {
        return alSehir;
    }

    public void setAlSehir(String alSehir) {
        this.alSehir = alSehir;
    }

    public String getTesSehir() {
        return tesSehir;
    }

    public void setTesSehir(String tesSehir) {
        this.tesSehir = tesSehir;
    }

    public LocalDate getAlTarih() {
        return alTarih;
    }

    public void setAlTarih(LocalDate alTarih) {
        this.alTarih = alTarih;
    }

    public LocalDate getTesTarih() {
        return tesTarih;
    }

    public void setTesTarih(LocalDate tesTarih) {
        this.tesTarih = tesTarih;
    }

    @Override
    public  String toString() {
        return "Talep edilene arac: " + '\n' +
                "Aracin alinacagi sehir: " + alSehir + '\n' +
                ", Aracin teslim edilecegi sehir: '" + tesSehir + '\n' +
                ", Alis tarihi: " + alTarih + '\n' +
                ", Teslim Tarihi:" + tesTarih ;
    }

    public static Integer takeGun() {

        Scanner scan = new Scanner(System.in);
        Integer gun = null;
        do {
            System.out.println("gün (1,2...31)?");
            String d = scan.next();

            try {
                gun = Integer.parseInt(d);
                //System.out.println(gun);
                if (gun > 0 && gun < 32) return gun;
                else System.out.println("1 ile 31 arasinda sayisal ifade giriniz.");
            } catch (Exception e) {
                System.out.println("1 ile 31 arasinda sayisal ifade giriniz.");
            }
        } while (true);


    }

    public static Integer takeAy() {

        Scanner scan = new Scanner(System.in);
        Integer ay = null;
        do {
            System.out.println("Ay (1,2...12)?");
            String d = scan.next();

            try {
                ay = Integer.parseInt(d);
                //System.out.println(gun);
                if (ay > 0 && ay < 13) return ay;
                else System.out.println("1 ile 12 arasinda sayisal ifade giriniz.");
            } catch (Exception e) {
                System.out.println("1 ile 12 arasinda sayisal ifade giriniz.");
            }
        } while (true);


    }

    public static Integer takeYil() {

        Scanner scan = new Scanner(System.in);
        Integer y = null;
        do {
            System.out.println("Yil (2023..2053)?");
            String d = scan.next();

            try {
                y = Integer.parseInt(d);
                //System.out.println(gun);
                if (y > 2022 && y < 2054) return y;
                else System.out.println("2023 ile 2053 arasinda sayisal ifade giriniz.");
            } catch (Exception e) {
                System.out.println("2023 ile 2053 arasinda sayisal ifade giriniz.");
            }
        } while (true);


    }
}
