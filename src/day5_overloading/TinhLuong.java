package day5_overloading;

public class TinhLuong {
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	
	//lương cơ bản x hệ số lương x số năm kinh nghiệm x loại
	public double tinhLuong(int luongCoBan, float heSoLuong, int soNameKinhNghiem, int loaiBacSi)
	{
		if(loaiBacSi == 1)
			return luongCoBan + luongCoBan*heSoLuong*soNameKinhNghiem*0.2;
		if(loaiBacSi == 2)
			return luongCoBan + luongCoBan*heSoLuong*soNameKinhNghiem*0.45;
		else return luongCoBan;
	}
}
