package day2;

import java.util.Scanner;

public class PrintNumber {

	public static void printLargerNumber(double number1, double number2) {
		if(number1 > number2)
		{
			System.out.println("Số lơn hơn là: " +number1);
		}
		else {
			System.out.println("Số lơn hơn là: " +number2);
		}
	}
	
	public static void main(String[] args) {
		double number1, number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		number1 = scanner.nextDouble();
		System.out.println("Nhập số thứ hai: ");
		number2 = scanner.nextDouble();
		printLargerNumber(number1, number2);
	}

}
