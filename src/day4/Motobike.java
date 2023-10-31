package day4;

public class Motobike {
	// Thuộc tính thuộc lớp, variable thuộc hàm
     // attribute
	public String hangSanXuat;
	public String mauXe;
	public String bienSo;
	public String ngayDangky;
	
	public void LayThongTinXe()
	{
		System.out.println("Hang San Xuat: " + hangSanXuat + "\n Mau Xe: "+mauXe+ "\n Bien so: "+bienSo+ "\n Ngay Dang Ky: "+ngayDangky);
	}

	public static void main(String[] args) {
		Motobike xeSH = new Motobike();
		xeSH.hangSanXuat = "Honda";
		xeSH.mauXe = "Black";
		xeSH.bienSo = "89M1.05711";
		xeSH.ngayDangky="01-11-2023";
		xeSH.LayThongTinXe();
	}
}
