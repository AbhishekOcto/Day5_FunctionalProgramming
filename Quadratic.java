package com.bridgeLabz.functProg;
import java.util.Scanner;
public class Quadratic {
/*program Quadratic.java to find the roots of the equation a*x*x + b*x + c
 * 
 * */
	double a;
	double b;
	double c; 
	double x;
	
	
	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a= ");
	double a = sc.nextDouble();
	System.out.println("Enter b= ");
	double b = sc.nextDouble();
	System.out.println("Enter c= ");
	double c = sc.nextDouble();
	sc.close();
	double delta = b*b-4*a*c;
	double root1 = (-b + Math.sqrt(delta)) / (2 * a);
    double root2 = (-b - Math.sqrt(delta)) / (2 * a);
//    System.out.println("root1= "+root1);
//    System.out.println("root2= "+root2);
//    
    
 // check if determinant is greater than 0
    if (delta > 0) {

      // two real and distinct roots
      root1 = (-b + Math.sqrt(delta)) / (2 * a);
      root2 = (-b - Math.sqrt(delta)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

    // check if determinant is equal to 0
    else if (delta == 0) {

      // two real and equal roots
      // determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

    // if determinant is less than zero
    else {

      // roots are complex number and distinct
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-delta) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  
	}

}
