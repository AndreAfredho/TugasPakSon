/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Andre
 */
public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        
        Boss nip = new Boss();
        nip.nip();
        
        Boss boss1 = new Boss();
        boss1.namaB();
        
        Boss Jabatanboss1 = new Boss();
        Jabatanboss1.jabatanB();
        
        Boss gaji = new Boss();
        
        float total;
        total = gaji.gaji() - gaji.potongangaji();
//        System.out.println(gaji.gaji());
//        System.out.println(gaji.potongangaji());
        System.out.println("total = "+total);
        
        
        Boss jamkerja = new Boss();
        jamkerja.jamkerja();
        
        System.out.println("\n*********************");
        
        Manager Nip = new Manager();
        Nip.nip();
        
        Manager nama = new Manager();
        nama.namaM();
        
        Manager JabatanManager = new Manager();
        JabatanManager.jabatanM();
        
        Manager gajiM = new Manager();
        
        float total1;
        total1 = gajiM.gaji() - gajiM.potongangaji();
//        System.out.println(gajiM.gaji());
//        System.out.println(gajiM.potongangaji());
        System.out.println("total = "+total1);
        
        Manager jamkerjaM = new Manager();
        jamkerjaM.jamkerja();
        
        System.out.println("\n***************");
        
        CleaningService NipC = new CleaningService();
        NipC.nip();
        
        CleaningService namaC = new CleaningService();
        namaC.namaC();
        
        CleaningService JabatanCleaningService = new CleaningService();
        JabatanCleaningService.jabatanC();
        
        CleaningService gajiC = new CleaningService();
        
        float total2;
        total2 = gajiC.gaji() - gajiC.potongangaji();
//        System.out.println(gajiC.gaji());
//        System.out.println(gajiC.potongangaji());
        System.out.println("total = "+total2);
        
        CleaningService jamkerjaC = new CleaningService();
        jamkerjaC.jamkerja();
        
        System.out.println("\n*************");
        
        Internship NipI = new Internship();
        NipI.nip();
        
        Internship namaI = new Internship();
        namaI.namaI();
        
        Internship JabatanInternship= new Internship();
        JabatanInternship.jabatanI();
        
        Internship gajiI = new Internship();
        gajiI.gaji();
        
        Internship Jamkerja = new Internship();
        Jamkerja.jamkerja();
        
        
    }
    
}
