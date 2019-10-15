package bai3;

public class SinhVien {
	private String hoTen;
	private diem dm1, dm2;

	public SinhVien(String ten, diem dm1, diem dm2) {

		hoTen = ten;
		this.dm1 = dm1;
		this.dm2 = dm2;
	}

	public double tinhDtb() {
		return (dm1.tinhDiem() + dm2.tinhDiem()) / 2;

	}

	public void getInfo() {
		System.out.println(
				"ho ten: " + hoTen + "\n"+ "diem hoc phan 1: " + dm1.tinhDiem() + "\n"+ "diem hoc phan 2: " + dm2.tinhDiem()
				+ "\n"+ "diem trung binh: " + this.tinhDtb());
	}

	public static void main(String args[]) {
		SinhVien ds[] = new SinhVien[3];
		ds[0] = new SinhVien("trang", new diem("SQL", 3, 5, 7, 4), new diem("Java", 3, 6, 8, 9));
		ds[1] = new SinhVien("quoc", new diem("lthdt", 3, 5, 7, 4), new diem("big data", 3, 6, 8, 9));
		ds[2] = new SinhVien("thien", new diem("AI", 3, 5, 7, 4), new diem("toan tuyen tinh", 3, 6, 8, 9));
		for(int i=0;i<3;i++) {
			ds[i].getInfo();
		}
	}

}
