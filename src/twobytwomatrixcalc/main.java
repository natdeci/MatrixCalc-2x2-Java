package twobytwomatrixcalc;
import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static double[][] matrix1 = new double[2][2];
	static double[][] matrix2 = new double[2][2];
	static double[][] matrixres = new double[2][2];
	static double resultvar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menunum =  0;
		while(menunum != 5) {
			printmenu();
			menunum =  input.nextInt();
			if(menunum == 5) {
				break;
			}
			matrixInput();
			switch(menunum) {
			case 1:
				addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				division();
				break;
			case 5:
				break;
			}
//			System.out.println(matrix1[0][0] + " " + matrix1[0][1]);
//			System.out.println(matrix1[1][0] + " " + matrix1[1][1]);
//			System.out.println(matrix2[0][0] + " " + matrix2[0][1]);
//			System.out.println(matrix2[1][0] + " " + matrix2[1][1]);
		}
		System.out.println("         BYE-BYE       ");
	}
	
	static void printmenu() {
		System.out.println("         WELCOME       ");
		System.out.println("///////////////////////");
		System.out.println("2 x 2 Matrix Calculator");
		System.out.println("  I. Addition (+)");
		System.out.println(" II. Subtraction (-)");
		System.out.println("III. Multiplication (*)");
		System.out.println(" IV. Division (/)");
		System.out.println("  V. Exit");
		System.out.println("-----------------------");
		System.out.print("Input menu >> ");
	}
	
	static void matrixInput() {
		System.out.println("");
		System.out.println("Matrix 1:");
		System.out.print("First row: ");
		matrix1[0][0] = input.nextInt();
		matrix1[0][1] = input.nextInt();
		System.out.print("Second row: ");
		matrix1[1][0] = input.nextInt();
		matrix1[1][1] = input.nextInt();
		
		System.out.println("");
		System.out.println("Matrix 2:");
		System.out.print("First row: ");
		matrix2[0][0] = input.nextInt();
		matrix2[0][1] = input.nextInt();
		System.out.print("Second row: ");
		matrix2[1][0] = input.nextInt();
		matrix2[1][1] = input.nextInt();
		
		System.out.println("");
		System.out.println("Result: ");
	}
	
	static void addition() {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrixres[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(matrixres[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	static void subtraction() {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrixres[i][j] = matrix1[i][j] - matrix2[i][j];
				System.out.print(matrixres[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	static void multiplication() {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrixres[i][j] = (matrix1[i][0] * matrix2[0][j]) + (matrix1[i][1] * matrix2[1][j]);
				System.out.print(matrixres[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	static void division() {
		double det = (matrix2[0][0]*matrix2[1][1]) - (matrix2[0][1]*matrix2[1][0]);
		double acont = matrix2[0][0];
		matrix2[0][0] = matrix2[1][1];
		matrix2[1][1] = acont;
		matrix2[0][1] = -1 * matrix2[0][1];
		matrix2[1][0] = -1 * matrix2[1][0];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrix2[i][j] = matrix2[i][j] / det;
			}
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrixres[i][j] = (matrix1[i][0] * matrix2[0][j]) + (matrix1[i][1] * matrix2[1][j]);
				System.out.print(matrixres[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
