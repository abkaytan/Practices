package hackerrank;
import java.util.Scanner;
public class SmallestAndLargestComp {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            String smal = s.substring(0, k);
            String larg = s.substring(0, k);

            for(int i=0 ; i<=s.length()-k ; i++){
                String cr = s.substring(i, i+k);
                if(cr.compareTo(larg)>0){
                    larg = cr;
                }

                if(cr.compareTo(smal)<0){
                    smal = cr;
                }

            }
            smallest = smal;
            largest = larg;

            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}
