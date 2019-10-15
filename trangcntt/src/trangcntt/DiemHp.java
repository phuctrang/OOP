package trangcntt;

abstract class DiemHp {
		    protected String tenHp;
		    protected int soTc;
		     
		    		    
		    public DiemHp(){
		    }

		    public String getTenHp() {
		        return tenHp;
		    }

		    public void setTenHp(String tenHp) {
		        this.tenHp = tenHp;
		    }

		    public int getSoTc() {
		       
		        return soTc;
		       
		    }

		    public void setSoTc(int soTc) {
		        this.soTc = soTc;
		    }
		    
		    public DiemHp(String tenHp, int soTc){
		        this.tenHp=tenHp;
		        this.soTc = soTc;
		    }
		    
		    public void getInfo(){
		        System.out.println("ten hoc phan: " + tenHp + "\n" + "So tin chi: " + soTc);
		    }

		    abstract double tinhDiem();
		    
		    
		}


