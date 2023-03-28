/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Andre
 */
public class Internship extends Employee
{
    float nipInternship;
    String namaInternship;
    String jabatanInternship;
    float gajiInternship;
    float potongangajiInternship;
    float jamkerjaInternship;
    
    
    @Override
    public float nip()
    {
        float nip = 121212;
        System.out.println("NIP Internship = "+nip);
        return nip;
    }
    
    
    public String namaI()
    {
        String nama = ("Afwan");
        System.out.println("Nama = "+nama);
        return nama;
    }
    
    
    public String jabatanI()
    {
        String jabatan = ("Intership");
        System.out.println("Jabatan = "+jabatan);
        return jabatan;
    }
    
        @Override
    public float gaji()
    {
        int gaji = 0;
        System.out.println("Gaji = "+gaji +" tidak di gaji");
        return gaji;
    }
        @Override
    public float potongangaji()
    {
        float potongangaji = 0;
        System.out.println("POTONGAN KAMU = "+potongangaji);
        return potongangaji;
    }
        @Override
    public float jamkerja()
    {
        int jamkerja = 8;
        System.out.println("Jam Kerja = "+jamkerja + " jam ");
        return jamkerja;
    }
}
