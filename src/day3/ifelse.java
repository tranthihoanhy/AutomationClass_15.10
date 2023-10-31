package day3;

import java.util.Scanner;

public class ifelse {

	public static void SoChanLe(int number)
	{
		String result;
		result = (number%2 == 0)? "Số chẵn" : "Số lẻ";
		System.out.println("Số vừa nhập vào là "+ result);
	}
	public static void TimSoLonHon(double number1, double number2)
	{
		double result;
		result =(number1 > number2)? number1 : number2;
		System.out.println("Số lớn hơn là "+result);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào số cần kiểm tra: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		SoChanLe(number);
		
		System.out.println("Nhập vào số thứ 2: ");
		double number2 = sc.nextDouble();
		TimSoLonHon(number, number2);
	}

}
