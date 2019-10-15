package trangcntt;

public class SinhVien {
	private String hoTen;
	private DiemHp hp1;
	private DiemHp hp2;

	public SinhVien(String ten, DiemHp hp1, DiemHp hp2) {
		hoTen = ten;
		this.hp1 = hp1;
		this.hp2 = hp2;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public DiemHp getHp1() {
		return hp1;
	}

	public void setHp1(DiemHp hp1) {
		this.hp1 = hp1;
	}

	public DiemHp getHp2() {
		return hp2;
	}

	public void setHp2(DiemHp hp2) {
		this.hp2 = hp2;
	}

	public SinhVien() {

	}

	public double tinhDiemTb() {
		return (double) (hp1.getSoTc() * hp1.tinhDiem() + hp2.getSoTc() * hp2.tinhDiem())
				/ (hp1.getSoTc() + hp2.getSoTc());
	}

	public String ToString() {
		return hoTen + " " + hp1 + " " + hp2 + " " + this.tinhDiemTb();
	}

	public void getinfo() {

		System.out.println("-ho va ten: " + hoTen);
		System.out.println("hoc phan 1: " + hp1.tinhDiem());
		System.out.println("hoc phan 2: " + hp2.tinhDiem());
		System.out.println("DTB: " + tinhDiemTb());

	}

	public static void main(String args[]) {

		SinhVien ds[] = new SinhVien[5];
		ds[0] = new SinhVien("trang", new HpLyThuyet(2, 3, 1, "sql", 4), new HpThucHanh(8, 3, 1, "dssh", 4));
		ds[1] = new SinhVien("tai", new HpThucHanh(2, 6, 1, "sql", 3), new HpLyThuyet(4, 3, 1, "dssh", 3));
		ds[2] = new SinhVien("tri", new HpThucHanh(2, 3, 9, "sql", 4), new HpLyThuyet(2, 5, 1, "dssh", 4));
		ds[3] = new SinhVien("trong", new HpLyThuyet(2, 3, 7, "sql", 2), new HpThucHanh(2, 3, 1, "dssh", 2));
		ds[4] = new SinhVien("trinh", new HpThucHanh(2, 8, 1, "sql", 1), new HpLyThuyet(2, 10, 1, "dssh", 1));
		for( int i=0; i<5 ;i++) {
			ds[i].getinfo();
		}
		

	}
}

