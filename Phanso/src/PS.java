public class PS {

    private int tu, mau;

    public PS() {
        tu = 1;
        mau = 1;
    }

    public PS(int n) {
        tu = n;
        mau = 1;
    }

    public PS(int t, int m) {
        tu = t;
        mau = m;
    }

    public void ganTu(int t) {
        tu = t;
    }

    public int layTu() {
        return tu;
    }

    public void ganMau(int g) {
        mau = g;
    }

    public int layMau() {
        return mau;
    }

    public void hienThi() {
        System.out.println(""+tu+"/"+mau);
    }
//
    private static int UCLN(int t, int m) {
        if (t % m == 0) {
            return m;
        } else {
            return UCLN(m, t % m);
        }
    }

    private void rutGon() {
        int x = UCLN(this.mau, this.tu);
        this.tu /= x;
        this.mau /= x;
    }

    public PS cong(int n) {
        PS p = new PS(this.tu, this.mau);
        p.ganTu( n*p.layMau()+p.layTu());
        p.rutGon();
        return p;
    }
    
    public PS tru(int n){
        PS p=new PS(this.tu,this.mau);
        p.ganTu(n*p.layMau()-p.layTu());
        p.rutGon();
        return p;
    }
    
    public String toString() {
    	return ""+tu+"/"+mau;
    }
    
    public PS nhansonguyen(int n){
    	PS p=new PS(this.tu,this.mau);
    	p.ganTu(n*p.layTu());
//    	p.rutGon();
		return p;  
    }
    
    public PS nhanps(PS n ){
    	PS p=new PS(this.tu,this.mau);
    	p.ganTu(n.layTu()*p.layTu());
    	p.ganMau(n.layMau()*p.layMau());
//    	p.rutGon();
		return p;  
    }
    
    public PS chiasonguyen(int n) {
    	PS p=new PS(this.tu,this.mau);
    	p.ganMau(n*p.layMau());
    	return p;  
    }
    
    public PS chiaps(PS n ){
    	PS p=new PS(this.tu,this.mau);
    	p.ganMau(n.layTu()*p.layMau());
    	p.ganTu(n.layMau()*p.layTu());
//    	p.rutGon();
		return p;  
    }
    
    public String sosanh(PS n ) {
    	PS p=new PS(this.tu,this.mau);
    	double x=0, y=0 ;
    	//quy dong mau so:
    	p.ganTu(n.layMau()*p.layTu());
    	p.ganMau(n.layMau()*p.layMau());
    	
    	n.ganTu(p.layMau()*n.layTu());
    	n.ganMau(n.layMau()*p.layMau());
//    	p.rutGon();
//    	n.rutGon();
    	x = n.layTu() / n.layMau();
    	y = p.layTu() / p.layMau();
    	
    	if(x==y)
    		return "hai phân số bằng nhau.";
    	else {if(x>y)
    		return "phân số " + x +"lớn hơn" + y;
    	}
    	return "phân số " + x +"nhỏ hơn" + y;	
    			
    	
    }
  
    public static void main(String args[]) {
        PS p1 = new PS(7,2);
        p1.rutGon();
        p1.hienThi();
        
        PS q = p1.tru(4);
        System.out.println("trừ: 7/2 - 4 = "+  q);
       
        PS q1 = p1.cong(5);
        System.out.println("Cộng: 7/2 + 5 = "+  q1);
        
        PS q2 = p1.nhansonguyen(3);
        System.out.println("Nhân 1 số: 7/2 x 3 = "+  q2);
        
        PS q3 = p1.nhanps(new PS(3,5));
        System.out.println("nhân 1 ps: 7/2 x 3/5 = "+  q3);
        
        PS q4 = p1.chiasonguyen(3);
        System.out.println("chia 1 số : (7/2) / 3 = "+  q4);
        
        PS q5 = p1.chiaps(new PS(3,7));
        System.out.println("chia 1 ps: (7/2) / (3/7) = "+  q5);
        
        String q6 = p1.sosanh(new PS(7,2));
        System.out.println("so sánh 7/2 và 7/2 : "+  q6);
        
        
        
        
        
        
        
    }
}