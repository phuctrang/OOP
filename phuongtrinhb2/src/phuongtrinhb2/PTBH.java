package phuongtrinhb2;

import java.awt.*;
import java.awt.event.*;

public class PTBH extends Frame implements ActionListener{

	//private float  b, c;
	double a,b,c;
	Label lb0,lb1, lb2, lb3, lb4;
	TextField tf1, tf2, tf3, tf4;
	Button exit , result;
	
	public PTBH() {
		windows();
		register();
		
	}
	
	private void windows() {
			
			setTitle("Phuong trinh bac 2");
			
			lb0 = new Label("Mời bạn nhập vào các hệ số a,b,c: ");
			//add(lb0);
			lb0.setForeground(Color.red);
			add(lb0 , BorderLayout.BEFORE_FIRST_LINE);
			
			lb1 = new Label("he so a:");
			lb1.setBounds(20, 70, 70, 20);
			tf1 = new TextField();
		    tf1.setBounds(100, 70, 120, 20);
		    add(lb1);
		    add(tf1);
		    lb1.setForeground(Color.BLUE);
		    	    
		    lb2 = new Label("he so b:");
		    lb2.setBounds(20, 120, 70, 20);
		    tf2 = new TextField();
		    tf2.setBounds(100, 120, 120, 20);
		    add(lb2);
		    add(tf2);
		    lb2.setForeground(Color.BLUE);
		    
		 	lb3 = new Label("he so c:");
		    lb3.setBounds(20, 170, 70, 20);
		    tf3 = new TextField();
		    tf3.setBounds(100, 170, 120, 20);
		    add(lb3);
		    add(tf3);
		    lb3.setForeground(Color.BLUE);
		    
		    result = new Button("tínhkq: ");
		   // add(result);
		    add(result , BorderLayout.EAST);
		    		    
		    lb4 = new Label("kết quả:");
		    lb4.setBounds(20, 220, 70, 20);
	        tf4 = new TextField();
	        tf4.setBounds(100, 220, 220, 200);
	        add(tf4);
	        add(lb4);
	        
		    exit = new Button("thoát: ");
		   // add(exit);
		    add(exit, BorderLayout.PAGE_END);
		    
		    
		    
//		    setLayout(new FlowLayout());
		    setSize(400, 500);
	        setVisible(true);
		
	}
	
	private void register() {
		exit.addActionListener(this);
		result.addActionListener(this);
		
	}
	
	 @Override
	 public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == exit) {
	            System.exit(0);
	        }
	        
	        if (ae.getSource() == result) {
	        	a = Double.parseDouble(tf1.getText());
	        	b = Double.parseDouble(tf2.getText());
	        	c = Double.parseDouble(tf3.getText());
	            tf4.setText(giaiPT());
	        }
	    }
   
 
//	private void getABC() {
//		a = Float.parseFloat(lb1.getText());
//		b = Float.parseFloat(lb2.getText());
//		c = Float.parseFloat(lb3.getText());
//    }
	
	private String giaiPT() {
	        String kq = "";
	        if (a == 0) {
	            if (b == 0) {
	                if (c == 0) {
	                    kq = "phuong trinh vô số nghiệm";
	                } else {
	                    kq = "phuong trinh vô nghiệm";
	                }
	            } else {
	                kq = "phuong trinh có 1 nghiêm x=" + (-c / b);
	            }
	        } else {
	            double d = (b * b) - 4 * a * c;
	            if (d < 0)
	                kq = "phuong trình vo nghiệm";
	            if (d == 0)
	                kq = "phuong trình có nghiệm kép x1,x2= " + (-b / (2 * a));
	            if (d > 0) {
	                double x1 = ((-b - (float) Math.sqrt(d)) / (2 * a)),
	                        x2 = ((-b + (float) Math.sqrt(d)) / (2 * a));
	                kq = "x1= " + x1 + "; x2= " + x2;
	            }
	        }
	        return kq;
	    }

	
	
	public static void main(String args[]) {
       new PTBH();
	
	}

	
}
