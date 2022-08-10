/* Make a program that adds two values ​​entered by the user */

package programm.code.somando;

import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Write a value: ");
    float n1 = input.nextFloat();
    System.out.print("Write a value: ");
    float n2 = input.nextFloat();
    
    float output = n1 + n2;
    
    System.out.print("RESULT: " + output);
    
  }
}
