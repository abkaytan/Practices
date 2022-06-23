package hackerrank;

import java.io.*;
import java.util.*;

public class Subarraysummation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        scan.close();

        //int k=n;

        int [] array = new int[n];
        String[] strsplitted = str.split(" ");

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(strsplitted[i]);
            //System.out.println(array[i]);
        }

        int total = 0;
        for(int i= 0; i<n; i++){
            int count = 0;
            for(int k=i; k<n; k++){
                count += array[k];
                if(count<0){
                    total++;
                }
            }
            //count += array[i];

        }

        System.out.println(total);




        /*
        int [] array = new int[n];
        String[] strsplitted = str.split(" ");
        int c=0;
        for(String s: strsplitted){
            array[c] = Integer.parseInt(s);
            c++;
        } */
        /*
        for(int i: array){
            System.out.println(i);
        }*/

        /*
        int count=0;
        for(int i=0; i<n; i++){
            if(array[i]<0){
                count++;
            }
        }
        for(int i=0;i<n-1;i++){
            if(array[i]+array[i+1]<0){
                count++;
            }
        }
        for(int i=0;i<n-2;i++){
            if(array[i]+array[i+1]+array[i+2]<0){
                count++;
            }
        }
        for(int i=0;i<n-3;i++){
            if(array[i]+array[i+1]+array[i+2]+array[i+3]<0){
                count++;
            }
        }
        for(int i=0;i<n-4;i++){
            if(array[i]+array[i+1]+array[i+2]+array[i+3]+array[i+3]<0){
                count++;
            }
        }
        System.out.println(count);
        */
    }
}
