

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static int opt = 0;
	
	public static void main(String[] args) {
		
		System.out.println("***************************************************************");
		System.out.println("Welcome to the Matrix Calculator!");
		
		
		while(opt != 9) {
			
			System.out.println("***************************************************************");
			System.out.println("---------------------------------------------------------------");
			System.out.println("1) Input a new Matrix ( Format: x x x;x x x;x x x = 3x3 matrix");
			System.out.println("2) Remove Matrix from memory");
			System.out.println("3) Add 2 Matrices");
			System.out.println("4) Subtract 2 Matrices");
			System.out.println("---------------------------------------------------------------");
			System.out.println("9) Exit Program");
			System.out.println("***************************************************************");
			opt = input.nextInt();
			input.nextLine();

			switch (opt) {
				case 1: createMatrix(); break;
			}
			
		}
		input.close();
	}

	private static void createMatrix() {
		System.out.print("Enter your matrix: ");
		String userInput = input.nextLine();
		String[] sArr = userInput.split("=");
		Matrix A = new Matrix(sArr[0].strip());
		A.populateMatrix(sArr[1].stripLeading());
		System.out.println(A);
	}
}
