package ATM;

//import java.util.Scanner;

public class ATM {
	private String soTK;
	private double sodu;
	

	public ATM() {
		super();
	}

	public ATM(String TK, double sd) {
		soTK = TK;
		sodu = sd;
	}

	public String getSoTK() {
		return soTK;
	}

	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}

	public double getSodu() {
		return sodu;
	}

	public void setSodu(double sodu) {
		this.sodu = sodu;
	}

	@Override
	public String toString() {
		return "mã số tài khoản: " + soTK + "số dư của bạn: " + sodu;
	}

	public void napTien(double sotien) {
		sodu = this.sodu + sotien;

	}

	public boolean rutTien(double sotien) {
		sodu = this.sodu - sotien;

		return false;
	}

	public boolean chuyenTien(ATM tk, double sotienchuyen){
        
        //2 tai khoan tk vs atm.
    	ATM atm = new ATM(this.soTK, this.sodu);
        double tg;
        tg = tk.getSodu();
        
        if(tg >= sotienchuyen) { 
         
        	atm.sodu = atm.getSodu() - sotienchuyen;
        	tk.setSodu(tk.getSodu() + sotienchuyen);
        	        
        }
        return false;
	}

	public static void main(String[] args) {

		ATM ds[];
		ds = new ATM[5];
		ds[0] = new ATM("111100   ", 100);
		ds[1] = new ATM("111101   ", 200);
		ds[2] = new ATM("111110   ", 300);
		ds[3] = new ATM("111111   ", 510);
		ds[4] = new ATM("111100   ", 600);

		for (int i = 0; i < ds.length; i++)
			System.out.println(ds[i]);
		System.out.println("=============================");
		ds[0].napTien(1000);
		System.out.println("tài khoản sau khi nạp 1000 là:");
		System.out.println(ds[0]);

		ds[0].rutTien(500);
		System.out.println("tài khoản sau khi bạn rút 500 là:");
		System.out.println(ds[0]);

		//
		System.out.println("=============================");
		for (int i = 0; i < ds.length; i++)
			System.out.println(ds[i]);
		// sum sotien
		double st = 0;
		for (int i = 0; i < ds.length; i++) {
			st = st + ds[i].getSodu();
		}

		System.out.println("=>>");
		System.out.println("tổng tiền là: " + st);
		System.out.println("=============================");

		ds[0].chuyenTien(ds[1], 50);
		System.out.println("tài khoản sau khi bạn chuyển 50 nghìn là:");
		System.out.println(ds[0]+ "\n" + ds[1]);
		

		

	}

}
