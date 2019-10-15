package trangcntt;

public class HpThucHanh extends DiemHp {
	private double db1, db2, db3;

	public HpThucHanh(double db1, double db2, double db3, String tenHp, int soTc) {
		super(tenHp, soTc);
		this.db1 = db1;
		this.db2 = db2;
		this.db3 = db3;
			}

	@Override
	public double tinhDiem() {
		return (db1 + db2 + db3) / 3;
	}

	
	public void getInfo() {
		super.getInfo();
		System.out.println("diem mon 1: " + db1 + "," + "diem mon 2: " + db2 + "," + "diem mon 3: " + db3+ "dtb" +tinhDiem());
	}
	public String ToString() {
		return ("diem mon 1: " + db1 + "\n" + "diem mon 2: " + db2 + "\n" + "diem mon 3: " + db3 + "\n" + "ten hoc phan: "
				+ tenHp + "\n" + "so tin chi: " + soTc );
	}
	public static void main(String args[]) {
		HpThucHanh a = new HpThucHanh(2,5,4,"ff",5);
		System.out.println(a);
		
		
	}
	


}