package HocPhi;

public class HPCH extends HP{
	public HPCH(String hoTen, String nganh, String doiTuong, int soTCHocLai) {

		super(hoTen, nganh, doiTuong, soTCHocLai);
	}

	public int hpHocKy() {
		double hp = 0;
		HP b = new HP(this.hoTen, this.nganh, this.doiTuong, this.soTCHocLai);
		//hp = a.hpHocKy();
		if (b.nganh == "101" )
			//System.out.println("khong dong hoc phi.");
			hp =0;
		else {
			if (b.nganh == "102")
				hp = 3000000*1.5;
			else
				hp = 2750000*1.5;
		}
		
		if(b.doiTuong == "01")
			hp =0;
		if(b.doiTuong == "02")
			hp = hp - (0.7*hp);
		if(b.doiTuong == "03")
			hp = hp - (0.5 * hp);
		
			
		return  (int) hp;
			
			
	}

	public int hpHocLai() {
		double hp1 = 0;
		HP b = new HP(this.hoTen, this.nganh, this.doiTuong, this.soTCHocLai);
		int tc = b.getSoTCHocLai();

		if (b.nganh == "101" && b.nganh == "103")
			// System.out.println("khong dong hoc phi.");
			hp1 = 200000*1.5 * tc;
		else {
			if (b.nganh == "102")
				hp1 = 225000*1.5 * tc;
		}
		return (int)hp1;
	}

	public int hpTong() {
		return hpHocKy() + hpHocLai();
	}

	public void hienThi0() {

	}
	public void hienThi() {
		System.out.println("tên: " + hoTen + "       ngành: " + nganh + "    thuộc đối tượng: " + doiTuong
				+ "      số tín chỉ học lại: " + soTCHocLai + "\nhoc phi: " + hpHocKy() +
				"\ntiền học phí học lại: " + hpHocLai()+ "\ntổng tất cả học phí: " + hpTong());

	}
		

}
