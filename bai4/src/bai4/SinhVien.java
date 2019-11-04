package bai4;

import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {

	private String hoTen;
	private Date ngaySinh;
	private double dtb;

	public SinhVien(String ht, Date ns, double dtb) {
		hoTen = ht;
		ngaySinh = ns;
		this.dtb = dtb;
	}

	public SinhVien() {

	}

	public String layHoTen() {
		return hoTen;
	}

	public void ganHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date layNgaySinh() {
		return ngaySinh;
	}

	public void ganNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double layDTB() {
		return dtb;
	}

	public void ganDTB(double d) {
		this.dtb = d;
	}

	public String layXepLoai() {
		String xl = "";
		if (dtb < 5) {
			xl = "yếu";
		}
		if (dtb < 7) {
			xl = "Trung bình";
		} else {
			if (dtb < 8) {
				xl = "khá";
			} else {
				xl = "giỏi";
			}
		}
		return xl;
	}

	public String layHo() {
		String a = this.layHoTen();
		return a.split(" ")[0];
	}

	public String layTen() {
		StringTokenizer a = new StringTokenizer(this.layHoTen());
		return this.layHoTen().split(" ")[a.countTokens() -1];
	}

	public String layDem() {
		StringTokenizer a = new StringTokenizer(this.layHoTen());
		int dem = a.countTokens() - 1;
		String s = " ";
		for (int i = 1; i < dem; i++) {
			s = s.concat(this.layHoTen().split(" ")[i]);
			if (i != dem - 1) {
				s = s.concat(" ");
			}
		}
		return s;
	}

	public int layTuoi() {
		Date ngayht = new Date();
		return (ngayht.getYear() + 1900) - this.ngaySinh.getYear();
	}

	public void hienthi() {
		System.out.println("\n Em tên là:" + hoTen + "\n Ngày sinh:" + ngaySinh + "\n Điểm trung bình đạt được:" + dtb
				+ "\n Họ của tôi là:" + this.layHo() + "\n Tên của tôi là:" + this.layTen() + "\n Đệm của tôi là:"
				+ this.layDem() + "\n Tuổi của tôi là:" + layTuoi() + "\n Xếp loại:" + this.layXepLoai());
	}
	
	public String toString() {
		SinhVien s = new SinhVien();
		return  " Thông tin sinh viên: " + s.layHoTen() + s.layDTB() + 
				s.layXepLoai()+s.layNgaySinh();
	}
	
	public static void main(String args[]) {
		
		SinhVien sv = new SinhVien("Ho Phuc Trang", new Date(05,03,2000), 8);
		sv.layTen();
		sv.layHo();
		sv.layDem();
	}

	
}
