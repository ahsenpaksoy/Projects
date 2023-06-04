package batch151advancepractice.day01;

public class C01_StringBuilderBufferKiyas {

    /*
       2023 Nisan QA Tester
        * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
        * kontrol edip StringBuilder ,String Buffer ve String class'larinin performanslarini
        * karsilastiralim.
        * Ipucu: long TimeSb = System.nanoTime(); kullanalim
       */
    public static void main(String[] args) {

        String str = "Merhaba";
        System.out.println("****************************** String *********************************");

        long time1 = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            str += " ";
        }

        long time2 = System.nanoTime();
        long stringSure = time2 - time1;
        System.out.println("stringSure = " + stringSure/1000 + " nano saniye"); //stringSure = 24717 nano saniye

        System.out.println(" ***************************** StringBuffer ***************************");
        StringBuffer buffer = new StringBuffer("Merhaba");
        long time3 = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            buffer = buffer.append(" ");
        }
        long time4 = System.nanoTime();
        long bufferSure = time4 - time3;
        System.out.println("Buffer Sure = " + bufferSure/1000 + " nano saniye"); //135

        System.out.println(" *************************** String Builder *****************************");
        StringBuilder builder = new StringBuilder();
        long time5= System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            builder = builder.append(" ");
        }
        long time6= System.nanoTime();
        long builderSure =time6-time5;
        System.out.println("Builder Sure = "+builderSure/1000+" nano saniye"); //Builder Sure = 105 nano saniye

        System.out.println("******************************** Uclu Kiyas ***************************");
        if(stringSure>bufferSure && stringSure>builderSure){
            System.out.println("En yavas String Class'i");
            if(bufferSure>builderSure){
                System.out.println("Ikinci yavas Buffer Class'idir");
                System.out.println("En hizlisi Builder Class'idir");
            }else{
                System.out.println("Ikinci yavas Builder Class'idir");
                System.out.println("En hizlisi Buffer Class'idir");
            }
        }else if(bufferSure>stringSure && bufferSure>builderSure){
            System.out.println("En yavas Buffer Class'idir");
            if(stringSure>builderSure){
                System.out.println("Ikinci yavas String Class'idir");
                System.out.println("En hizlisi Builder Class'idir");
            }else{
                System.out.println("Ikinci yavas Builder Class'idir");
                System.out.println("En hizlisi String Class'idir");
            }
        }else{
            System.out.println("En yavas Builder Class'idir");
            if(bufferSure>stringSure){
                System.out.println("Ikinci yavas Buffer Class'idir");
                System.out.println("En hizlisi String Class'idir");
            }else{
                System.out.println("Ikinci yavas String Class'idir");
                System.out.println("En hizlisi Buffer Class'idir");
            }
        }



    }

}
