package day5_inherritance;

public class GiaoVien extends Nguoi {
    public String chuNhiemLop;
	@Override
	public void diChoi() {
		System.out.println("Sinh viên: " +getHoTen() +"," +getSoDienThoai()+ ", chủ nhiệm lớp" +chuNhiemLop +" đi chơi sau khi dạy xong");
	}
	
	public void diDay()
	{
		System.out.println("Giáo viên chủ nhiệm lớp "+ chuNhiemLop + "dạy 2 buổi / tuần");
	}
	
}
