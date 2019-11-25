package HocPhi;

public class HPDH extends HP {
	public HPDH(String hoTen, String nganh, String doiTuong, int soTCHocLai) {

		super(hoTen, nganh, doiTuong, soTCHocLai);
	}

	public int hpHocKy() {
		double hp = 0;
		HP a = new HP(this.hoTen, this.nganh, this.doiTuong, this.soTCHocLai);
		// hp = a.hpHocKy();
		if (a.nganh == "101")
			// System.out.println("khong dong hoc phi.");
			hp = 0;
		else {
			if (a.nganh == "102")
				hp = 3000000;
			else
				hp = 2750000;
		}

		if (a.doiTuong == "01")
			hp = 0;
		if (a.doiTuong == "02")
			hp = hp - (0.7 * hp);
		if (a.doiTuong == "03")
			hp = hp - (0.5 * hp);

		return (int) hp;

	}

	public int hpHocLai() {
		double hp1 = 0;
		HP a = new HP(this.hoTen, this.nganh, this.doiTuong, this.soTCHocLai);
		int tc = a.getSoTCHocLai();

		if (a.nganh == "101" && a.nganh == "103")
			// System.out.println("khong dong hoc phi.");
			hp1 = 200000 * tc;
		else {
			if (a.nganh == "102")
				hp1 = 225000 * tc;
		}
		return (int)hp1;
	}

	public int hpTong() {
		return hpHocKy() + hpHocLai();
	}

	public void hienThi() {
		System.out.println("tên: " + hoTen + "       ngành: " + nganh + "    thuộc đối tượng: " + doiTuong
				+ "      số tín chỉ học lại: " + soTCHocLai + "\nhọc phí: " + hpHocKy() +
				"\ntiền học phí học lại: " + hpHocLai()
				+ "\ntổng tất cả học phí: " + hpTong());

	}

//	public static void main(String args[]) {
////		
//		HPDH a = new HPDH("ho phuc trang", "102", "03", 6);
//		a.hienThi();
//
//	}
}
