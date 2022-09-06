package calculatorpro;

import java.util.*;

public class Calc {

    public String makeSimpleOpr(char[] arrays) {

        String simple = "";

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arrays.length; i++) {
            char o = arrays[i];
            int a;
            switch (o) {
                case '*':
                    a = Integer.parseInt(arrays[i + 1] + "") * Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(a));
                    i++;
                    break;
                case '/':
                    a = Integer.parseInt(arrays[i + 1] + "") / (Integer.parseInt(stack.pop()));
                    stack.push(String.valueOf(a));
                    i++;
                    break;
                default:
                    stack.push(String.valueOf(arrays[i]));
                    break;
            }
        }

        //System.out.println(stack.size());

        int c = stack.size();
        Stack<String> stack1 = new Stack();

        for (int l = c; l >0 ; l--) {
            stack1.push(stack.pop());
        }

        for(int j = 0 ; j<c ; j ++){
            simple+=stack1.pop();
        }

        return simple;
    }

    public String calculate (String s){

        StringTokenizer numb = new StringTokenizer(s,"+-");
        Queue<Integer> numbers = new LinkedList<>();
        while (numb.hasMoreTokens()){
            numbers.add(Integer.valueOf(numb.nextToken()));
        }
        Stack<Integer> stack = new Stack<>();
        //System.out.println(numbers);
        stack.push(numbers.poll());
        //System.out.println(numbers);
        int temp = 0;
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i)=='+'){
               temp = stack.pop()+numbers.poll();
               stack.push(temp);
               i++;
            }
            if(s.charAt(i)=='-'){
                temp = stack.pop()-numbers.poll();
                stack.push(temp);
                i++;
            }
        }
        String result = String.valueOf(stack.pop());

        return result;
    }

    public static void main(String[] args) {

        System.out.println("give input :");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(str);

        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == ' ')) {
                input += str.charAt(i);
            }
        }
        //System.out.println(input);

        char[] inputArray = input.toCharArray();
        //System.out.println(inputArray);

        Calc calc = new Calc();
        String simplified = calc.makeSimpleOpr(inputArray);
        System.out.println(simplified);
        String solved = calc.calculate(simplified);
        System.out.println(solved);



        /*Stack stackSimpleOperation = new Stack();
        Stack operators = new Stack();*/


    }
}
