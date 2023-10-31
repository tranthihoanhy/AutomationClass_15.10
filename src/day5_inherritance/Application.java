package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.maSinhVien = "SVMS01";
		sv.diChoi();
		sv.diHoc();

		GiaoVien gv = new GiaoVien();
		gv.chuNhiemLop = "Auto test";
		gv.diChoi();
		gv.diDay();
	}
}
