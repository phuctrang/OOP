package lab07bai2;
class SuDungSV {
    public static void main(String args[]) {
        SinhVien sv;
        sv = new SinhVien("ho phuc trang", 2000, 7.2);
        sv.ghiTep("sv.txt");
        
        SinhVien sv2;        
        sv2 = new SinhVien();       
        sv2.docTep("sv.txt");
        sv2.hienThi();
    }
}
