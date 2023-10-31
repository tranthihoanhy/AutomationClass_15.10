package day5_inherritance;

public class SinhVien extends Nguoi{
    public String maSinhVien;
	@Override
	public void diChoi() {
		System.out.println("Sinh viên: " +getHoTen() +"," +getSoDienThoai()+ "," +maSinhVien +" đi chơi sau khi học xong");
	}
	
	public void diHoc()
	{
		System.out.println("Sinh viên" + maSinhVien + "đi học 6 buổi sáng / tuần");
	}
	
}
