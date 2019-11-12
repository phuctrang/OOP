package lab07bai2;

import java.io.*;
import java.util.*;


public class SinhVien {
    private String hoTen;
    private int namSinh;
    private double DTB;
    
    public SinhVien(){
    }
    
    public SinhVien(String ten, int ns, double dtb){
        hoTen = ten;
        namSinh = ns;
        DTB = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }
    
    
    public void hienThi(){
        System.out.println("ho ten:" + hoTen);
        System.out.println("nam sinh:" + namSinh);
        System.out.println("diem:" + DTB);
    }
    
    @Override
    public String toString(){
        return hoTen + "*" + namSinh + "*" + DTB;
        
    }
    
  
    public void ghiTep(String tenTep){
        try{
            FileOutputStream op = new FileOutputStream(tenTep);
            PrintWriter pw = new PrintWriter(op);
            pw.println(this);
            pw.close();
            
        }catch(IOException ex){   
        }
    }
    
    public void docTep(String tenTep) {
        try{
            FileInputStream ip = new FileInputStream(tenTep);
            DataInputStream dt = new DataInputStream(ip);
            String s;
            s = dt.readLine();
            StringTokenizer st = new StringTokenizer(s,"*");
            hoTen = st.nextToken();
            namSinh = Integer.parseInt(st.nextToken());
            DTB = Double.parseDouble(st.nextToken());
            
            dt.close();
            ip.close();
        
        }catch(IOException ec){
            System.out.println("co loi doc file!!!");
        }
    }
    
}
