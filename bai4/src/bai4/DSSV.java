package bai4;

import java.util.Date;

public class DSSV {

	private SinhVien sv[];
	private int soSV;

	public DSSV(SinhVien sv[], int soSV) {
		this.sv = sv;
		this.soSV = soSV;
	}

	public DSSV() {

	}

	public void them(SinhVien s) {
		if (soSV < sv.length)
			sv[soSV = soSV + 1] = s;
	}

	public int laySV(int sosv) {
		this.soSV = sosv;
		return sosv;
	}

	public void hienthi() {
		System.out.println("Sinh Viên:" + sv + "\n Số sinh viên:" + soSV);
	}
	// sap xap sinh vien theo dtb

	public void sapXepTenTheoDTB() {
		int n = sv.length;
		SinhVien tg = new SinhVien();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; i < n; i++) {
//				SinhVien sv[]= new SinhVien[n];
				if (sv[i].layDTB() < sv[j].layDTB())
					tg = sv[i];
				sv[i] = sv[j];
				sv[j] = tg;
			}

		}
//sx sinh vien theo ho ten,: tu A>Z.
	}

	public void sapXepSvTheoTuoi() {
		int n = sv.length;
		SinhVien tg = new SinhVien();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; i < n; i++) {
//				SinhVien sv[]= new SinhVien[n];
				if (sv[i].layTuoi() < sv[i].layTuoi())
					tg = sv[i];
				sv[i] = sv[j];
				sv[j] = tg;
			}

		}

	}

	public void lietKeTheoXepLoai(String layXepLoai) {
		int i = 0;
		for (i = 0; i < sv.length; i++) {
			layXepLoai = sv[i].layXepLoai();
			System.out.println(sv[i]);

		}
	}

	public void timTen(String hoTen) {
		for (int i = 0; i <= sv.length; i++) {
			if (sv[i].layHoTen().equals(hoTen) == true)
				System.out.println(sv[i]);

		}

	}

	public SinhVien[] getSv() {
		return sv;
	}

	public void setSv(SinhVien[] sv) {
		this.sv = sv;
	}

	public int getSoSV() {
		return soSV;
	}

	public void setSoSV(int soSV) {
		this.soSV = soSV;
	}

	public String toString() {
		SinhVien s = new SinhVien();
		return "số sinh viên: " + this.soSV + "\n Thông tin sinh viên: " + s.layHoTen() + s.layDTB() + s.layXepLoai()
				+ s.layNgaySinh();
	}

//	public void xoasv(String hoTen) {
//		int n = sv.length;
//		for (int i = 0; i < n; i++)
//			if (sv[i].layHoTen().equals(hoTen) == true)
//				sv.remove(i);
//	}

	public static void main(String args[]) {

		DSSV ds = new DSSV();
		ds = new DSSV(new SinhVien[5], 5);
		System.out.println("số sinh viên có trong danh sach là: " + ds.getSoSV());
		SinhVien thu1 = new SinhVien("ho phuc trang", new Date(2000, 03, 05), 7);
		SinhVien thu2 = new SinhVien("nguyen van A", new Date(2000, 03, 05), 6);
		SinhVien thu3 = new SinhVien("nguyen van B", new Date(2000, 03, 05), 8);
		SinhVien thu4 = new SinhVien("le van C", new Date(2000, 03, 05), 7);
		SinhVien thu5 = new SinhVien("Duong Hong Loan", new Date(2000, 03, 05), 7.5);
		ds.hienthi();
		ds.them(thu2);
		ds.sapXepTenTheoDTB();
		ds.sapXepSvTheoTuoi();

//		System.out.println("thông tin sinh vien: "+ds.getSv());

//				("ho phuc trang", new Date(03,05,2000),9), ))----new SinhVien("ho phuc trang", new Date(2000,03,05),9)

	}
}
