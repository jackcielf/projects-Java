package code.calculator;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    
    int op, loop = 0;
    float n1, n2, result;
    
    Scanner input = new Scanner(System.in);
    while(loop == 0) {
    System.out.print("\n\t1 - SUM\n\t2 - SUBTRACT\n\t3 - MULTIPLY\n\t4 - DIVISION\n\t5 - GO OUT\n\t> ");
    op = input.nextInt();
 
    switch(op){
      case 1:
        System.out.print("\n\tWrite a first value: ");
        n1 = input.nextFloat();
        System.out.print("\n\tWrite a second value: ");
        n2 = input.nextFloat();
        result = n1 + n2;
        System.out.print("\n\tRESULT: " + result);
        break;

      case 2:
        System.out.print("\n\tWrite a first value: ");
        n1 = input.nextFloat();
        System.out.print("\n\tWrite a second value: ");
        n2 = input.nextFloat();
        result = n1 - n2;
        System.out.print("\n\tRESULT: " + result);
        break;

      case 3:
        System.out.print("\n\tWrite a first value: ");
        n1 = input.nextFloat();
        System.out.print("\n\tWrite a second value: ");
        n2 = input.nextFloat();
        result = n1 * n2;
        System.out.print("\n\tRESULT: " + result);
        break;

      case 4:
        System.out.print("\n\tWrite a first value: ");
        n1 = input.nextFloat();
        System.out.print("\n\tWrite a second value: ");
        n2 = input.nextFloat();
        result = n1 / n2;
        System.out.print("\n\tRESULT: " + result);
        break;

      case 5:
        System.out.print("\n\tSee you... 👋");
        loop = 1;
        break;

      default:
        System.out.println("\n\tPLEASE! ENTER A VALID VALUE!");
        break;
    }
  }
  }
}
