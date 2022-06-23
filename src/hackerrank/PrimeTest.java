package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PrimeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger b = new BigInteger(n);
        System.out.println(b.isProbablePrime(10)? "prime" : "not prime");

        /**
         * Params: certainty
         * – a measure of the uncertainty that the caller is willing to tolerate: if the call
         * returns true the probability that this BigInteger is prime exceeds (1 - 1/2certainty).
         * The execution time of this method is proportional to the value of this parameter.
         */
    }
}

