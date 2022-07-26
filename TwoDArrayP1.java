package com.bridgeLabz.functProg;
import java.io.PrintWriter; 

import java.util.Scanner;
public class TwoDArrayP1 {

		Scanner scanner;
		
		public TwoDArrayP1() {
			scanner = new Scanner(System.in);
		}
		
		public int getIntValue() {
			return scanner.nextInt();
		}
		// method to get 2d integer array from user
		public Integer[][] getInt2DArray(int m, int n) {
			Integer[][] array = new Integer[m][n];
			System.out.println("Enter "+(m*n)+"integer values in intArray");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					
					array[i][j]=getIntValue();
				}
			}
			return array;
		}
		// method to get 2d double array from user
		public Double[][] getDouble2DArray(int m, int n) {
			Double[][] array = new Double[m][n];
			System.out.println("Enter "+(m*n)+" double values in Doublearray");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					
					array[i][j]=scanner.nextDouble();
				}
			}
			return array;
		}
		// method to get 2d boolean array from user
		public Boolean[][] getBoolean2DArray(int m, int n) {
			Boolean[][] array = new Boolean[m][n];
			System.out.println("Enter "+(m*n)+" boolean values in Boolean array");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					
					array[i][j]=scanner.nextBoolean();
				}
			}
			return array;
		}
		// method to print all types of arrays
		public <t>void printArray(t[][] Array, int m, int n) {
			PrintWriter writer = new PrintWriter(System.out);
			for (int i=0; i<m; i++){
				for (int j=0; j<n; j++) {
					writer.write(" arr[" + i + "][" + j + "] = "+Array[i][j]); 
					writer.flush(); 
				}
				System.out.println();
			}  
		}
		// method to get array from user
		public int[] getArray(int n) {
			int[] array = new int[n];
			System.out.println("Enter "+n+" elements in intArray");
			for(int i=0;i<n;i++) {
				array[i]=getIntValue();
			}
			return array;	
		}

		public static void main(String[] args) {
			TwoDArrayP1 array = new TwoDArrayP1();
			
			int select = 0, m = 0, n=0;
			System.out.println("1. Integer 2D Array");
			System.out.println("2. Double 2D Array");
			System.out.println("3. Boolean 2D Array");
			System.out.print("Select the type of array from above : ");
			select = array.getIntValue();
			if( select > 0 && select <=3) {
					System.out.print("Enter the number of columns in array: " );
					m = array.getIntValue();
					System.out.print("Enter the number of row in array: " );
					n = array.getIntValue();
		
				switch(select) {
					case 1:
						Integer[][] Array = array.getInt2DArray(m, n);
						array.printArray(Array, m, n);
						break;
					case 2:
						Double[][] Array1 = array.getDouble2DArray(m, n);
						array.printArray(Array1, m, n);
						break;
					case 3:
						Boolean[][] Array3 = array.getBoolean2DArray(m, n);
						array.printArray(Array3, m, n);
						break;
						
				}
			}
			else
				System.out.println("Invalid Selection");
		
		}
		
}
