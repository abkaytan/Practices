package PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How long password do u want : ");
        int length = scanner.nextInt(); // password length
        System.out.println(generatePasssword(length));
    }
    static char[] generatePasssword(int len)
    {
        System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String allSymbols = charsCaps + chars + nums + symbols;
        Random random = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            password[i] = allSymbols.charAt(random.nextInt(allSymbols.length()));

        }
        return password;
    }
}

