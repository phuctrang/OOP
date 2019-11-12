package lab07bai1;

import java.util.Scanner;
import java.io.*;

public class TepVanBan {

    public TepVanBan() {
    }

    public static void taotep() {
        try {
            FileOutputStream fot = new FileOutputStream("songuyen.txt");
            PrintWriter pw = new PrintWriter(fot);
            for (int i = 1; i < 101; i++) {
                int k = (int) (Math.random() * 1000);
                pw.print(k + "");
                if (i % 10 == 0) {
                    pw.println();
                }

            }
            pw.close();
        } catch (IOException io) {
            System.out.println("error." + io.toString());
        }

    }

    public static void docTep̣̣̣() throws FileNotFoundException, IOException {
        try {
            FileInputStream fip = new FileInputStream("songuyen.txt");
            FileOutputStream fop = new FileOutputStream("sochan.txt");
            PrintWriter pw = new PrintWriter(fop);
            Scanner sc = new Scanner(fip);
            int d = 0;
            for (int i = 0; i <= 100; i++) {
                int k;
                k = sc.nextInt();
                if (k % 2 == 0) {
                    pw.print(k + "");
                    d++;
                }
                if (d % 10 == 0) {
                    pw.println();
                }
            }
            pw.close();
            
            fip.close();
          
        } catch (IOException ex) {
            System.out.println("error." + ex);
        }
    }

    public static void main(String args[]) {
        	taotep();

        

    }
}

//    private final String tenVB;
//    private final String loaiVB;
//    private final String noiSX;
//    
//    public TepVanBan(String ten, String loai, String khuvuc){
//        tenVB = ten;
//        loaiVB = loai;
//        noiSX = khuvuc;
//    }


