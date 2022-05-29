package breadqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Breadqueue {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("***Fırından Çıkan Ekmekleri Dağıtma İşlemi***\n");

        Random random = new Random();

        Queue<String> ekmek_kuyrugu = new LinkedList<String>();

        ekmek_kuyrugu.offer("Ali");
        ekmek_kuyrugu.offer("Ahmet");
        ekmek_kuyrugu.offer("Okan");
        ekmek_kuyrugu.offer("Ayşe");
        ekmek_kuyrugu.offer("Merve");
        ekmek_kuyrugu.offer("Ezgi");
        ekmek_kuyrugu.offer("Gizem");
        ekmek_kuyrugu.offer("Mehmet");
        ekmek_kuyrugu.offer("Oguz");
        ekmek_kuyrugu.offer("Asuman");

        int ekmek_sayisi = 1+ random.nextInt(10);

        System.out.println("........Ekmekler Çıkıyor.......\n");
        System.out.println("Çıkan ekmek sayısı ---------->    " + ekmek_sayisi);
        Thread.sleep(3000);

        while (ekmek_sayisi != 0) {
            System.out.println(ekmek_kuyrugu.poll()+ " -----> ekmek aldı.");
            ekmek_sayisi -- ;
            Thread.sleep(1000);

        }
        System.out.println("\n.......Maalesef ekmek kalmadı.....");

        System.out.println("\n*****************************");
        System.out.println("*****************************");

        while (!ekmek_kuyrugu.isEmpty()) {
            System.out.println(ekmek_kuyrugu.poll() + "   ekmek alamadı......");
            Thread.sleep(1000);
        }

        Thread.sleep(2000);

        System.out.println("\n\n **FIRIN KAPANDI** ");


    }



}


