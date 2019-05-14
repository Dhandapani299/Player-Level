import java.io.*;
import java.util.*;
public class Fact02{  
 public static void main(String args[]){  

Scanner scan = new Scanner(System.in);
  int i,fact=1;  
  System.out.println("input :");  
  int number=scan.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("output "+number+" is: "+fact);    
 }  
}  