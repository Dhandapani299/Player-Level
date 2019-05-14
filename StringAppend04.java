import java.io.*;
import java.util.*;
public class StringAppend04 {


    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Input: " );
        String str1= scan.nextLine();
 StringBuilder str = new StringBuilder(str1); 

        str.append(".");

        
        System.out.println("Output:" +  str);
    }
}