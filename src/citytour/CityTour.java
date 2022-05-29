package citytour;

import java.util.LinkedList;
        import java.util.ListIterator;
        import java.util.Scanner;

public class CityTour {

    public static void islemleri_bastir(){
        System.out.println("0 - İşlemleri görüntüle");
        System.out.println("1 - Bir sonraki şehre git");
        System.out.println("2 - Bir önceki şehre git");
        System.out.println("3 - uygulamadan çık");
    }


    public static void sehirleri_turla(LinkedList<String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemleri_bastir();
        System.out.println(sehirler);
        Scanner scanner = new Scanner(System.in);
        if(!iterator.hasNext()) {
            System.out.println("herhangi bir şehir bulunmuyor");
        }
        boolean cikis = false;
        boolean ileri = true;

        while (!cikis) {
            System.out.println("bir işlem seçin");
            islem = scanner.nextInt();
            switch(islem){
                case 0:
                    islemleri_bastir();
                    System.out.println(sehirler);
                    break;
                case 1:
                    if(!ileri) {
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("şehre gidiliyor: " + iterator.next());
                    }
                    else{
                        System.out.println("gidilecek şehir kalmadı");
                        ileri = true;

                    }
                    System.out.println(sehirler);
                    break;

                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("şehre gidiliyor: " + iterator.previous());
                    } else {
                        System.out.println("şehir turu başladı");
                    }
                    System.out.println(sehirler);
                    break;

                case 3:
                    cikis = true;
                    System.out.println("uygulamadan çıkılıyor");
                    break;

            }
        }
    }


    public static void main(String[] args) {

        LinkedList<String > sehirler = new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);



    }

}
