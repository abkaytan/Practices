package palindrome;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("*****PALINDROME KELIME KONTROLU*****");

        while(true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("çıkış için 3 e basın");
            System.out.print("Kontrol Edilmesini İstediğiniz Cümleyi Giriniz: ");


            String cumle = scanner.nextLine();
            //stack ile character ataması yapılacak
            Stack<Character> stack = new Stack<Character>();

            //for döngüsü ile kelimenin ilk yarısını stackleyelim

            for(int i= 0; i<(cumle.length()/2) ; i++) {
                stack.push(cumle.charAt(i));
            }

            //if else yapısı ile kelimenin ilk yarısı ile ikinci yarısının kontrolünü yapabiliriz.
            //stackler LIFO (last in first out) olarak depolama yapar.


            if(cumle.equals("3")) {
                System.out.println("çıkış yapılıyor");
                break;
            }
            else if(isPalindrome(cumle, stack)){
                System.out.println("cümle palindromedur.");
            }

            else if(cumle.length() == 0){
                System.out.println("tek harf girdiniz");

            }
            else{
                System.out.println("cümle palindrome değildir.");
            }

            //if(true) else yapısı ve true şartını sağlayan farklı bir metod kurulumu

        }

    }

    public static boolean isPalindrome(String cumle, Stack<Character> stack){

        //for döngüsü ile characterleri karşılaştırıp return true işlemi
        for(int i = (cumle.length()/2) + 1 ; i < cumle.length(); i++){
            if(cumle.charAt(i) == stack.pop() ){
                return true;
            }

        }


        return false;
    }
}

