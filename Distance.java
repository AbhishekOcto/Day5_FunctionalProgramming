package com.bridgeLabz.functProg;
import java.util.Scanner;
public class Distance {
/*program that takes two integer inputs x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
*/
	public static void main(String[] args) {
		int x1 = 0;//origin
		int y1 = 0;//origin
		int x2;
		int y2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x2: ");
		x2 = sc.nextInt();
		System.out.print("Enter y2: ");
		y2 = sc.nextInt();
		
		//logic to find euclidean distance
		double Distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

		System.out.println("Euclidean distance= " + Distance);
		sc.close();

	}

}
