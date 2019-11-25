package HocPhi;

public class HP {
	protected String hoTen;
	protected String nganh;
	protected String doiTuong;
	protected int soTCHocLai;
	
	public HP(String ten, String n, String dt, int sotc) {
		

		hoTen = ten;
		this.nganh = n;
		doiTuong = dt;
		soTCHocLai = sotc;
		
	}
	
	public HP() {
		
	}
	
	
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public int getSoTCHocLai() {
		return soTCHocLai;
	}

	public void setSoTCHocLai(int soTCHocLai) {
		this.soTCHocLai = soTCHocLai;
	}

	public int hpHocKy() {return 0;}
	
	public int hpHocLai() {return 0;}
	
	public int hpTong() {return 0;}
	
	public void hienThi() {
		
	}
	public String toString() {
		return hoTen+" "+ nganh + " " + doiTuong + " " + soTCHocLai;
		
	}
	
//	public static void main(String args[]) {
//		
//		HP a = new HP("105", "f", "gf",5);
//		System.out.println(a.getHoTen());
//		System.out.println(a);
//		
//	}

}
