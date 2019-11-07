
import java.awt.*;



public class Casio {
	public static void main(String args[]) {
		Frame fr;
		fr = new Frame("CASIO   FX-570VN PLus");
		fr.setSize(300, 500);
		Label l = new Label("NATURAL-V.P.A.M.");
		TextArea b = new TextArea(3,35);
		Font fo = new Font("Arial", Font.ITALIC, 20);
		Font f1 = new Font("Arial", Font.BOLD, 20);
//		b.setText("");
		
		l.setFont(f1);
		l.setFont(fo);
		fr.add(l);
		fr.add(b);
		Button bt1 = new Button("Shift");
		Button bt2 = new Button("ALPHA");
		Button bt3 = new Button("REPLAY");
//		bt3.setSize(200, 150);
		Button bt4 = new Button("MODE");
		Button bt5 = new Button("ON");
		Button bt6 = new Button("CALC");
		Button bt7 = new Button("D/DX");
		Button bt8 = new Button("X!");
		Button bt9 = new Button("LOG");
		Button bt0 = new Button("a/b");
		Button bta = new Button("SQRT()");
		Button btb = new Button("DEC");
		Button btc = new Button("HEX");
		Button btd = new Button("BIN");
		Button bte = new Button("OCT");
		Button btf = new Button("(-)");
		Button btg = new Button(".,,,");
		Button bth = new Button("HYP");
		Button bti = new Button("Sin");
		Button btk = new Button("COS");
		Button btl = new Button("TAN");
		Button btm = new Button("RCL");
		Button btn = new Button("ENG");
		
		Button btu = new Button("(");
		Button btw = new Button(")");
		Button btv = new Button("S-D");
		Button btq = new Button("M+");
		Button btz = new Button("7");
		Button btx = new Button("8");
		Button bty = new Button("9");
		Button btp = new Button("DEL");
		Button btDS = new Button("AC");
		Button btBF = new Button("4");
		Button btSD = new Button("5");
		Button btM = new Button("6");
		Button btMH = new Button("X");
		Button btS = new Button("/");
		Button btA = new Button("1");
		Button btB = new Button("2");
		Button btC = new Button("3");
		Button btD = new Button("+");
		Button btE = new Button("-");
		Button btF = new Button("0");
		Button btG = new Button(".");
		Button btH = new Button("X10");
		Button btI = new Button("ANS");
		Button btK = new Button("=");
		Button btex = new Button("EXIT.");
		
		//
		fr.setLayout(new FlowLayout());
		
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		fr.add(bt7);
		fr.add(bt8);
		fr.add(bt9);
		fr.add(bt0);
		fr.add(bta);
		fr.add(btb);
		fr.add(btc);
		fr.add(btd);
		fr.add(bte);
		fr.add(btf);
		fr.add(btg);
		fr.add(bth);
		fr.add(bti);
		fr.add(btk);
		fr.add(btl);
		fr.add(btm);
		fr.add(btn);      
		
		fr.add(btu);
		fr.add(btw);
		fr.add(btv);
		fr.add(btq);
		fr.add(btz);
		fr.add(btx);
		fr.add(bty);
		fr.add(btp);
		fr.add(btDS);
		fr.add(btBF);
		fr.add(btSD);
		fr.add(btM);
		fr.add(btMH);
		fr.add(btS);
		fr.add(btA);
		fr.add(btB);
		fr.add(btC);
		fr.add(btD);
		fr.add(btE);
		fr.add(btF);
		fr.add(btG);
		fr.add(btH);
		fr.add(btI);
		fr.add(btK);
		fr.add(btex);
		fr.setLayout(new FlowLayout());
//		fr.setLayout(new GridLayout(6,7));
//		Button bt[][] = new Button[6][7];
		Font ft = new Font("Times New Roman",Font.BOLD, 15);
		Font ft1 = new Font("Times New Roman",Font.BOLD, 22);
		btDS.setFont(ft);
		bt3.setFont(ft1);
		XLSK x;
		x = new XLSK();
		btDS.addActionListener(x);
		btex.addActionListener(x);
		btDS.setForeground(Color.red);
		bt5.setForeground(Color.red);
		btk.setForeground(Color.green);
		bti.setForeground(Color.green);
		btl.setForeground(Color.green);
		fr.setForeground(Color.BLUE);
		btex.setForeground(Color.GRAY);
		btex.setFont(ft1);
//		fr.add(btDS, BorderLayout.AFTER_LINE_ENDS);
		fr.setVisible(true);
	}

}
