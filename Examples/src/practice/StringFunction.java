package practice;
import java.util.Scanner;
public class StringFunction {

	public static void main(String[] args) 
	{
     String a;
     String b="Raghul";
     System.out.print("\nEnter The String:");
     Scanner A = new Scanner(System.in);
     a=A.nextLine();
     System.out.print("\nOriginal String   :"+a);
     System.out.print("\nLower Case        :"+a.toLowerCase());
     System.out.print("\nUpper Case        :"+a.toUpperCase());
     System.out.print("\nReplace           :"+a.replace('a','u'));
     System.out.print("\nTrim              :"+b.trim());
     System.out.print("\nEquals            :"+a.equals(b));
     System.out.print("\nNo Case Equals    :"+a.equalsIgnoreCase(b));
     System.out.print("\nLength            :"+a.length());
     System.out.print("\nCharAt            :"+a.charAt(2));
     System.out.print("\nCompare           :"+a.compareTo(b));
     System.out.print("\nConcat            :"+a.concat(b));
     System.out.print("\nSubstring         :"+a.substring(2));
     System.out.print("\nSubstring         :"+a.substring(0,2));
	}

}
