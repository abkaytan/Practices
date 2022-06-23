package hackerrank;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Hourglass {

    public static int maxResult(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int r=0; r<4; r++){
            for(int c=0; c<4 ; c++){
                int total = summation(arr, r, c);
                max = Math.max(max, total);
            }
        }

        return max;
    }

    public static int summation(int[][] arr, int r, int c){
        return arr[r][c] + arr[r][c+1] + arr[r][c+2]
                + arr[r+1][c+1]
                + arr[r+2][c]+ arr[r+2][c+1]+ arr[r+2][c+2];
    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String s[] = scan.nextLine().split(" ");
            //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int jitem = Integer.parseInt(s[j]);
                arr[i][j] = jitem;
            }
        }
        scan.close();

        System.out.println(maxResult(arr));
    }


    /*public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        String listString="";
        for (List<Integer> s : arr)
        {
            listString += s + "\t";
        }

        System.out.println(listString);


        String regex = "[0-9]{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matches = pattern.matcher(listString);

        while(matches.find()){
            System.out.println(listString.substring(matches.start(),matches.end()));
        }

    }*/


}
