package hackerRankDesignPatterns;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class SingletonPatternStudy {
}



class Singleton{
    private Singleton (){}
    public String str;
    //private static Singleton SingleSingleton = null;
    public static Singleton getSingleInstance(){
        /*if(SingleSingleton==null){
            SingleSingleton = new Singleton();
        }*/
        //return SingleSingleton;
        return new Singleton();
    }

}