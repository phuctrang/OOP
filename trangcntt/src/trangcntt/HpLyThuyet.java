package trangcntt;

public class HpLyThuyet extends DiemHp {
	private int cc;
	private int gk;
	private int ck;

	public HpLyThuyet(int cc, int gk, int ck, String tenHp, int soTc) {
		super(tenHp, soTc);
		this.cc = cc;
		this.gk = gk;
		this.ck = ck;
	}

	public double tinhDiem() {
		if ((cc >= 0 && cc <= 10) && (gk >= 0 && gk <= 10) && (ck >= 0 && ck <= 10))
			return (cc * 0.1 + gk * 0.2 + ck * 0.7);
		return 0;
	}
	
	public void getInfo(){
        super.getInfo();
        System.out.println("chuyen can: " + cc + "," + "giua ki: " + gk + "," + "cuoi ki" + ck);
    }
	
	public String ToString(){
        return ("cc: " + ck + "\n"+ "gk "
                + gk + "\n" + "ck " + ck + "\n" + "ten hp: " + tenHp + "\n" + "soTc");      
        
    }


}
