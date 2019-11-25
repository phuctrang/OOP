package HocPhi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class giaoDien extends Frame implements ActionListener{
	
	String a, b; 
	double c;
	//a: nganh b:doi tuong, c:sotinchi
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4,t5,t6,t7;
	Button b1,b2;
	public giaoDien() {
		windows();
		dangki();
		
	}
	private void windows() {
		// TODO Auto-generated method stub
		setTitle("giao diện học phí");
		l1 = new Label("mời bạn nhập các thông tin dưới đây: ");
		add(l1, BorderLayout.NORTH);
		
		l2 = new Label("Họ Tên: ");
		l2.setBounds(20, 70, 70, 20);
		t1 = new TextField();
	    t1.setBounds(100, 70, 120, 20);
		
		l3 = new Label("ngành: ");
		l3.setBounds(20, 120, 70, 20);
		t2 = new TextField();
	    t2.setBounds(100, 120, 120, 20);
		
		l4 = new Label("đối tượng: ");
		l4.setBounds(20, 170, 70, 20);
		t3 = new TextField();
	    t3.setBounds(100, 170, 120, 20);
		
		l5 = new Label("số tín chỉ: ");
		l5.setBounds(20, 220, 70, 20);
		t4 = new TextField();
	    t4.setBounds(100, 220, 120, 20);
		
		l6 = new Label("học phí HK: ");
		l6.setBounds(20, 270, 70, 20);
		t5 = new TextField();
	    t5.setBounds(100, 270, 120, 20);
		
		l7 = new Label("học phí H.lại: ");
		l7.setBounds(20, 320, 70, 20);
		t6 = new TextField();
	    t6.setBounds(100, 320, 120, 20);
		
		l8 = new Label("tổng HP: ");
		l8.setBounds(20, 370, 70, 20);
		t7 = new TextField();
	    t7.setBounds(100, 370, 120, 20);
		
//	    l9 = new Label("kết quả:");
//	    l9.setBounds(20, 420, 70, 20);
//	    t8 = new TextField();
//	    t8.setBounds(100, 420, 140, 30);
	    
	    b1 = new Button("tính");
		
		//add(b1);
		b2 = new Button("CANCEL");
		
		//add(b2);
		
		//add(l1); đã có add bên trên!!!
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(l6);
		add(t5);
		add(l7);
		add(t6);
		add(l8);
		add(t7);
//		add(l9);
//		add(t8);
		add(b1, BorderLayout.EAST);
		add(b2, BorderLayout.PAGE_END);
		//add(b1);
		//add(b2);
//
		setSize(500,600);
		setVisible(true);
		
		//setLayout(new FlowLayout());
	}

//note
	private void dangki() {
		// TODO Auto-generated method stub
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b2)
			System.exit(0);
		getValue();
//		a = (String)(t2.getText());
//		b = (String)(t3.getText());
//		c = Double.parseDouble(t4.getText());
		t5.setText(tinhHPHK());
		t6.setText(hpHocLai());
		t7.setText(hpTong());
		
		
	}
	
	private void getValue() {
		a = t2.getText();
		b = t3.getText();
		c = Double.parseDouble(t4.getText());
		
	}
	
	
	private String tinhHPHK() {
		String hp = "";
		double tg=0, tg1=0 ;
//		HP a = new HP(this.hoTen, this.nganh, this.doiTuong, this.soTCHocLai);
//		// hp = a.hpHocKy();
		if ((String)a == "101")
			// System.out.println("khong dong hoc phi.");
			hp = "300000";
		else {
			if ((String)a == "102")
				hp = "3000000";
			else {
				hp = "2750000";
			}
				
		}

		if ((String)b == "01")
			hp = "0";
		if ((String)b == "02")
			tg = Double.parseDouble(hp);
			tg1 = tg - (0.7 * tg);
			hp =  "" + (tg1);
			
		if ((String)b == "03")
			tg = Double.parseDouble(hp);
			tg1 = tg - (0.5 * tg);
			hp =  "" + (tg1);
		return  hp; 

	}
	
	private String hpHocLai() {
		String hp1 = " ";
		double tg=0 ;
//		HP a = new HP(this.hoTen, this.nganh, this.doiTuong, this.soTCHocLai);
//		int tc = a.getSoTCHocLai();

		if ((String)a == "101" && (String)a == "103"){
			tg = 200000 * (double)c;
			hp1= " " + (tg);
			}
		else {
			if ((String)a == "102")
				tg = 225000 * (double)c;
				hp1= " " + (tg);
		}
		return hp1;
	}
	
	public String hpTong() {
		String hpt = "";
		double tg, tg1,tg2;
		tg = Double.parseDouble(t5.getText());
		tg1 = Double.parseDouble(t6.getText());
		tg2 = tg+tg1;
		hpt = "" + (tg2);
		return hpt;
	}
	
	public static void main(String args[]) {
		new giaoDien();
	}

	
	
	

}
