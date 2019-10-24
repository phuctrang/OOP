
public class Main {

    public static void main(String[] args) {
        ElectricalDevice dv1 = new Fan();
        dv1.setNameDevice("quat may toshiba.");
        dv1.setId("123abc");
        dv1.setManuFacture("ho phuc trang");
        dv1.setPrice(100);
        dv1.setSwitcher("cong tac bat");
        System.out.println(dv1);
        //
        ElectricalDevice dv2 = new Cooker();
        dv1.setNameDevice("noi com diem sony.");
        dv1.setId("123defd");
        dv1.setManuFacture("ho chi minh");
        dv1.setPrice(100);
        dv1.setSwitcher("cong tac off.");
        System.out.println(dv2);
        
    }
    
}
