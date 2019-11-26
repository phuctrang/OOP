package ktgk;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private double DTB;
	
	public SinhVien(String masv, String ten, double dtb) {
		
		maSV =masv;
		hoTen = ten;
		DTB =dtb;
		
	}
	
	public SinhVien() {
		
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDTB() {
		return DTB;
	}

	public void setDTB(double dTB) {
		DTB = dTB;
	}
	
	public void suaTensv(String ten) {
		SinhVien sv = new SinhVien(this.maSV, this.hoTen, this.DTB);
		sv.hoTen =ten;
	}
	
	public void suaDTBsv(double diem) {
		SinhVien sv = new SinhVien(this.maSV, this.hoTen, this.DTB);
		sv.DTB =diem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(DTB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hoTen == null) ? 0 : hoTen.hashCode());
		result = prime * result + ((maSV == null) ? 0 : maSV.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		if (Double.doubleToLongBits(DTB) != Double.doubleToLongBits(other.DTB))
			return false;
		if (hoTen == null) {
			if (other.hoTen != null)
				return false;
		} else if (!hoTen.equals(other.hoTen))
			return false;
		if (maSV == null) {
			if (other.maSV != null)
				return false;
		} else if (!maSV.equals(other.maSV))
			return false;
		return true;
	}
	
	public static void main(String args[]) {
		SinhVien sv[] = new SinhVien[5];
		sv[0] = new SinhVien("4151050224", "ho phuc trang", 7.0);
		sv[1] = new SinhVien("4151050221", "ho phuc a", 7.0);
		sv[2] = new SinhVien("4151050222", "ho phuc b", 9.0);
		sv[3] = new SinhVien("4151050223", "ho phuc c", 7.0);
		sv[4] = new SinhVien("4151050225", "ho phuc d", 1.0);
	}
	
	
}
