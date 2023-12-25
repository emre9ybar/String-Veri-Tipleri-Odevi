import java.util.Scanner;

public class ödevler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ödev-1
   /*     Scanner scan = new Scanner(System.in);
       String kelime;
        System.out.print("kelimeyi giriniz :");
        kelime=scan.nextLine();

        int bosluk = 0;
        for (int i = 0; i < kelime.length();i++ ){
            if (kelime.charAt(i)==' ') {
                bosluk++;
            }}
        System.out.println("bosluk sayısı :"+bosluk);
////////////////////////////////////
        //ödev 2
        String polindrom;
        System.out.print("Kelimeyi giriniz:");
        polindrom = scan.nextLine();

        boolean isPolindrom = true;

        for (int i = 0, j = polindrom.length() - 1; i < j; i++, j--) {
            if (polindrom.charAt(i) != polindrom.charAt(j)) {
                isPolindrom = false;
                break;}
        }
        if (isPolindrom) {
            System.out.println(polindrom + " kelimesi bir polindrom kelime");
        } else {
            System.out.println(polindrom + " kelimesi bir polindrom kelime değil");
                }*/

   /*     String kelime1;
        System.out.print("kelimeyi gir :");
        kelime1=scan.nextLine();

        int i =0;
        int j =kelime1.length()-1;
            boolean iskelime =true;
            while ( i < j  ) {
                if (kelime1.charAt(i++)!=(kelime1.charAt(j--))) {
                iskelime = false;
                break;
            }
            }
        if ( iskelime){
            System.out.println("eşittir :"+kelime1);
        }else {
            System.out.println("eşit değildir :"+kelime1);
        }

       /////////////////// //////////////////////////*/
        // ÖDEV 3  -

       /* String tumsatir, aranilankelime;
        System.out.print("Metini giriniz:");
        tumsatir = scan.nextLine();

        System.out.print("Aranan kelimeyi giriniz:");
        aranilankelime = scan.nextLine();

        int sayac = 0;
        int index = 0;

        while ((index = tumsatir.indexOf (aranilankelime, index)) != -1) {
            sayac++;
            index += aranilankelime.length();
        }
        System.out.println("'" +aranilankelime +"' kelimesi metinde "+ sayac+" kez geçiyor.");*/

          /*  //ÖDEV 4-

        String[] kelimeler ={" EMRE , MEHMET , ENES ,İLKER ,MELİH"} ;
        for (int i = kelimeler.length-1; i >= 0;i--){
            System.out.print(kelimeler[i]+" ");

//ödev 5 -
        String sozcuk="merhaba dünya ";
        String newsozcuk =sozcuk.replace('m','h');
        System.out.println(newsozcuk);




    //ÖDEV 6-ANAGRAM

        String anagram1,anagram2;

        System.out.print("1.kelime :");
        anagram1=scan.nextLine();
        System.out.print("2.kelime :");
        anagram2=scan.nextLine();
        //büyük ve küçük harf duyarlılığını ortadan kaldırıyoruz daha güvenli olsun diye.
        anagram1 = anagram1.replaceAll("\\s", "").toLowerCase();
        anagram2 = anagram2.replaceAll("\\s", "").toLowerCase();


            boolean isanagram=false;

        for (int i=0;i<anagram1.length();i++) {
            for (int j =0;j<anagram2.length();j++) {
                if (anagram1.charAt(i)==anagram2.charAt(j)){
                    isanagram=true;
                    break;}
            }
          if (isanagram){
            break;}
        }
            if (isanagram){
                System.out.println("anagramdır");
            }else {
                System.out.println("anagram değildir .");
            }
        // ÖDEV 7 -


        String[] kelimeler = {"emre", "mehmet", "ahmet", "ali"};

        for (int i = 0; i < kelimeler.length; i++) {
            kelimeler[i] = kelimeler[i].substring(0, 1).toUpperCase() + kelimeler[i].substring(1);
        }
        String yeniCumle = String.join(",  ", kelimeler);
        System.out.println(yeniCumle);


    //ödev 8-

        String longg;
        System.out.print("kelimeyi giriniz:");
        longg=scan.nextLine();

        String[] kelimeler = longg.split(" ");
        int  enUzunKelimeUzunlugu =0;
        int enUzunIndex =-1;

        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length() > enUzunKelimeUzunlugu) {
                enUzunKelimeUzunlugu = kelimeler[i].length();
                enUzunIndex = i;
            }

        }if (enUzunIndex != -1) {
            System.out.println("En uzun sözcük: " + kelimeler[enUzunIndex]);
        } else {
            System.out.println("Girilen metin boş veya hiç kelime içermiyor.");
        }

        //ödev 9 -
        String kelimehesabi;
        System.out.print("kelimeyi giriniz:");
        kelimehesabi=scan.nextLine();

        String[] kelimeler = kelimehesabi.split(" ");
        int total=0;
        for (int i = 0;i<kelimeler.length;i++){
            if (kelimeler[i].length() > total) {
                total+=kelimeler[i].length();
            }
        }
        System.out.println("toplam :"+total);
*/

        //ödev 10-

       int sayac=0;

     /*   String sesli="e,a,ı,i,ö,ü,o,u";
        System.out.print("Cümleyi giriniz :");
        String cumle=scan.nextLine();

       cumle=cumle.replaceAll("\\s", "").toLowerCase();
        for (int i = 0; i < cumle.length(); i++) {
            char harf = cumle.charAt(i);
            if (sesli.contains(String.valueOf(harf))) {
                sayac++;
            }
        }
        System.out.println("kelimede "+ sayac +" tane sesli harf geçiyor");*/


        }






    }









































