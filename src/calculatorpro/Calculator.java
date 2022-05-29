package calculatorpro;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Calculator {

    public static void main(String[] args) {

        String input;
        Scanner s = new Scanner(System.in);
        showMenu();
        boolean exit = false;
        int number;

        while (!exit) {
            System.out.println("Select number to start : ");
            number = s.nextInt();
            s.nextLine();
            switch (number) {
                case 1:
                    System.out.println("Give number and operators, precedence is supporting +,-,/,*,),( .. ");
                    System.out.print("Operation :");
                    input = s.nextLine();
                    input = operation(input);
                    System.out.println(input);
                    System.out.println(calculation(input));
                    showMenu();
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    exit = true;
                    System.out.println("see u later....");
                    break;
            }
        }

    }

    private static void showMenu() {
        System.out.println("1. Calculation");
        System.out.println("2. View calculation history ");
        System.out.println("3. Exit");
    }

    private static String operation(String input) {

        StringBuilder stack = new StringBuilder();
        StringBuilder output = new StringBuilder();

        char inC, tempC;

        for (int i = 0; i < input.length(); i++) {

            inC = input.charAt(i);

            if (isOp(inC)) {

                while (stack.length() > 0) {
                    tempC = stack.substring(stack.length() - 1).charAt(0);
                    if (isOp(tempC) && (prc(tempC) >= prc(inC))) {
                        output.append(" ");
                        output.append(tempC);
                        stack.setLength(stack.length() - 1);
                    } else {
                        break;
                    }
                }

                stack.append(inC);
                output.append(" ");
            } else if (inC == '(') {
                stack.append(inC);
            } else if (inC == ')') {
                tempC = stack.substring(stack.length() - 1).charAt(0);
                while (tempC != '(') {
                    output.append(" ").append(tempC);
                    stack.setLength(stack.length() - 1);
                    tempC = stack.substring(stack.length() - 1).charAt(0);
                }
                stack.setLength(stack.length() - 1);
            } else {
                output.append(inC);
            }
        }

        while (stack.length() > 0) {
            tempC = stack.substring(stack.length() - 1).charAt(0);
            output.append(" ").append(tempC);
            stack.setLength(stack.length() - 1);
        }

        return output.toString();
    }

    private static int prc(char c) {
        switch (c) {
            case '*':
            case '/':
                return 2;
        }
        return 1;
    }

    private static boolean isOp(char c) {

        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    private static double calculation(String input) {
        Deque<Double> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(input);
        double dA, dB;
        String inToken;

        while (st.hasMoreTokens()) {
            inToken = st.nextToken().trim();
            if (isOp(inToken.charAt(0))) {
                dB = stack.pop();
                dA = stack.pop();

                switch (inToken.charAt(0)) {
                    case '+':
                        dA += dB;
                        break;
                    case '-':
                        dA -= dB;
                        break;
                    case '*':
                        dA *= dB;
                        break;
                    case '/':
                        dA /= dB;
                        break;
                }
            } else {
                dA = Double.parseDouble(inToken);
            }
            stack.push(dA);
        }
        return stack.pop();
    }
}