package userpasswordcontrol;

//while döngüsü yardımı ile kullanıcı girişi programı

import java.util.Scanner;

public class UserPasswordApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı Belirleyin :");
        String sis_kullanici_adi = scanner.nextLine();
        System.out.print("Parola Belirleyin :");
        String sis_kullanici_parola = scanner.nextLine();
        int giris_hak_sayisi = 3;

        System.out.println("\n*********************************\n");

        System.out.println("****İsim & ID Kontrol Uygulaması****");

        while(true) {

            System.out.println("\n*********************************\n");

            System.out.print("Kullanıcı Adı Giriniz: ");
            String girilen_ad = scanner.nextLine();
            System.out.print("Parola Giriniz: ");
            String girilen_parola = scanner.nextLine();

            if(sis_kullanici_adi.equals(girilen_ad) && sis_kullanici_parola.equals(girilen_parola)) {

                System.out.println("Doğru Giriş");
                System.out.println("\n*********************************\n");
                break;

            }
            else if(sis_kullanici_adi.equals(girilen_ad) && !sis_kullanici_parola.equals(girilen_parola)) {

                System.out.println("Yanlış Parola");

                giris_hak_sayisi --;

            }
            else if(!sis_kullanici_adi.equals(girilen_ad) && sis_kullanici_parola.equals(girilen_parola)) {

                System.out.println("Yanlış Kullanıcı Adı");

                giris_hak_sayisi --;

            }
            else {

                System.out.println("Kullanıcı Adı ve Şifre Hatalı");

                giris_hak_sayisi --;
            }

            if(giris_hak_sayisi==0) {

                System.out.println("\n*********************************\n");

                System.out.println("Giriş Hakkınız Kalmamıştır.......");

                System.out.println("\n*********************************\n");

                break;
            }


        }


    }
}
