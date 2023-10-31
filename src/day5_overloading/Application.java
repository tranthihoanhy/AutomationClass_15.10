package day5_overloading;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int loaiBacSi;
		TinhLuong luong = new TinhLuong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập loại bác sĩ, loại 1 là chuyên khoa, loại 2 là đa khoa:");
		loaiBacSi = sc.nextInt();
		System.out.println("Lương là: " +luong.tinhLuong(5000000, 1, 2, loaiBacSi));
	}
}
