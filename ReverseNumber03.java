import java.io.*;
import java.util.*;
public class ReverseNumber03 {


    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Input: " );
        int num = scan.nextInt(); 
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Output:" + reversed);
    }
}