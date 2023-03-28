/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Andre
 */
public class CleaningService extends Employee{
    float nipC;
    String namaC;
    String jabatanC;
    float gajiCleaningService;
    float potongangajiCleaningService;
    float jamkerjaCleaningService;
    
    
    @Override
    public float nip()
    {
        float nip = 12133131;
        System.out.println("NIP CleaningService = "+nip);
        return nip;
    }
    
    public String namaC()
    {
        String nama = ("Sugeng");
        System.out.println("NAMA CleaningService = "+nama);
        return nama;
    }
    
    public String jabatanC()
    {
        String jabatan =("CleaningService") ;
        System.out.println("jabatan = "+jabatan);
        return jabatan;
    }
    
        @Override
    public float gaji()
    {
        int gaji = 6000000;
        System.out.println("Gaji = "+gaji);
        return gaji;
    }
        @Override
    public float potongangaji()
    {
        float potongangaji = 1000000;
        System.out.println("Potongan gaji = "+potongangaji);
        return potongangaji;
    }
        @Override
    public float jamkerja()
    {
        int jamkerja = 9;
        System.out.println("Jam Kerja = "+jamkerja + "jam");
        return jamkerja;
    }
}
