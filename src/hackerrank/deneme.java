package hackerrank;

import java.util.Scanner;

public class deneme {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int k = 0 ;
            int c ;
            int s ;
            int d ;

            for(int l=0; l<n; l++){

                c = 0;
                d = 0;
                c = (int)Math.pow(2, l);
                d= c*b;
                k += d;
                s = a + k;

                System.out.print(s + " ");

            }

            System.out.println();

        }
        in.close();

    }
}
