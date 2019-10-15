package bai3;

public class diem {
	private String tenHocPhan;
	private int soTinChi;
	private int chuyenCan, giuaKy, cuoiKy;

	public diem(String THP, int STC, int CC, int GK, int CK) {
	        tenHocPhan = THP;
	        soTinChi = STC;
	        chuyenCan = CC;
	        giuaKy = GK;
	        cuoiKy = CK;
	    }

	public String getTenHocPhan() {
		return tenHocPhan;
	}

	public void setTenHocPhan(String tenHocPhan) {
		this.tenHocPhan = tenHocPhan;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public int getChuyenCan() {
		return chuyenCan;
	}

	public void setChuyenCan(int chuyenCan) {
		this.chuyenCan = chuyenCan;
	}

	public int getGiuaKy() {
		return giuaKy;
	}

	public void setGiuaKy(int giuaKy) {
		this.giuaKy = giuaKy;
	}

	public int getCuoiKy() {
		return cuoiKy;
	}

	public void setCuoiKy(int cuoiKy) {
		this.cuoiKy = cuoiKy;
	}

	public int laysoTinChi() {
		return soTinChi;
	}

	public double tinhDiem() {
		return (chuyenCan * 0.1) + (giuaKy * 0.2) + (cuoiKy * 0.7);
	}

}
