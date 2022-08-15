package code.media;

import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    
    float n1, n2, result;
    Scanner input = new Scanner(System.in);
    System.out.print("Write first note: ");
    n1 = input.nextFloat();
    System.out.print("Write second note: ");
    n2 = input.nextFloat();
    result = (n1 + n2) / 2;
    System.out.print("Your average is: " + result);
  }
}