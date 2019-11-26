package ktgk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiaoDien extends Frame implements ActionListener{
	
	String a , b ;
	double c;
	Label l1, l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	
	
	public GiaoDien() {
		Windows();
		dangKi();
		
	}
	


	private void Windows() {
		setTitle("Form nhập/ sửa thông tin");
		l1 = new Label("mời bạn nhập các thông tin dưới đây: ");
		add(l1, BorderLayout.NORTH);
		
		l2 = new Label("Mã SV: " );
		l2.setBounds(20, 70, 70, 20);
		t1 = new TextField();
	    t1.setBounds(100, 70, 120, 20);
		
		l3 = new Label("Họ Tên: ");
		l3.setBounds(20, 120, 70, 20);
		t2 = new TextField();
	    t2.setBounds(100, 120, 120, 20);
		
		l4 = new Label("Điểm TB: ");
		l4.setBounds(20, 170, 70, 20);
		t3 = new TextField();
	    t3.setBounds(100, 170, 120, 20);
	    
	    b1 = new Button("TÌM");
	    b1.setBounds(20, 220, 70, 20);

	    b2 = new Button("Sửa");
	    b2.setBounds(50, 220, 70, 20);

	    b3 = new Button("Thêm");
	    b3.setBounds(80, 220, 70, 20);
	    
	    b4 = new Button("CANCEL");
	    
	    add(l2);
	    add(t1);
	    add(l3);
	    add(t2);
	    add(l4);
	    add(t3);
	    add(b4, BorderLayout.PAGE_END);
	    
	    setSize(500,600);
		setVisible(true);
		
}
	    
		private void dangKi() {
			// TODO Auto-generated method stub
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
		}

	    
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b4)
			System.exit(0);
		GetValue();
		t2.setText(tim());
		t3.setText(tim());
		
		
	}
	
	private void  GetValue() {
		a = t1.getText();
		b = t2.getText();
		c = Double.parseDouble(t3.getText());
		
		
	}
	
	private String tim() {
		double d;
		SinhVien sv = new SinhVien();
		d = sv.getDTB();
		if(a == sv.getMaSV()) {
			
		t2.setText(sv.getHoTen());
	//	Double.parseDouble(t3.setText(d));
		
		}
		
		return null;
	}
	
	
	private String sua() {
		
		
		return null;
	}
	
//	private String them() {
//		int vt = 0;
//		SinhVien sv ;
//        while( sv[ vt ]!=null ){
//            vt = vt + 1;
//        }
//        sv[ vt ] = sv;
//		return "";
//	}
	public static void main(String args[]){
		GiaoDien();
		
	}
	

}
