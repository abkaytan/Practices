package firstfactorialmethods;

import java.util.*;

class WaysToFindFirstFactorial {

    static int FirstFactorial(int num) {

        if(num == 0 || num == 1) return 1;
        //return num*FirstFactorial(num-1); //alttaki kod dizisi yerine bu tek satırda çalıştırılabilir.
        int fact;
        fact = FirstFactorial(num-1)*num;
        return fact;

        /*
        int fact = num;
        while (num>1) {
            num--;
            fact *= num;
        }
        return fact;

         */

        /*
        if(num>1) {
            return num*FirstFactorial(num-1);
        }else {
            return num;
        }

         */

        /*
        return (num == 1 ? 1 : num*FirstFactorial(num-1));

         */

        /*
        if (num ==1) {
            return 1;
        }
        return num*FirstFactorial(num-1);

         */

        /*
        int ff = 1;
        for (int i = 1; i <= num; i++) {
            ff *= i;
        }
        return ff;

         */

        /*
        if(num<=1){
            return 1;
        }
        return num*FirstFactorial(num-1);
         */


        /*
        if(num != 1) {
            return num*FirstFactorial(num-1);
        }
        return num;

         */
    }


    public static void main(String[] args) {

        //get data from user, send data to method under function class, print data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number to get firstfactorial : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("the FirstFactorial of " + number + " is " + FirstFactorial(number));
    }

}
