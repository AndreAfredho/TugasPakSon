/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Andre
 */
public class Manager extends Employee
{
    float nip;
    String namaM;
    String jabatanm;
    float gajim;
    float potongangajim;
    float jamkerjam;
    
    
    @Override
    public float nip()
    {
        float nip = 199911;
        System.out.println("Nip Manager = "+nip);
        return nip;
    }
    
    int s(){
        return 0;
    }
    
    void b(){
    }
    
    public String namaM()
    {
        String nama = ("Akmal");
        System.out.println("Nama Manager = "+nama);
        return nama;
    }
    
    
    public String jabatanM()
    {
        String jabatan = ("Manager");
        System.out.println("Jabatan = "+jabatan);
        return jabatan;
    }
    
        @Override
    public float gaji()
    {
        int gaji = 8000000;
        System.out.println("GAJI = "+gaji);
        return gaji;
    }
        @Override
    public float potongangaji()
    {
        float potongangaji = 10000;
        System.out.println("Potongan gaji = "+potongangaji);
        return potongangaji;
    }
        @Override
    public float jamkerja()
    {
        int jamkerja = 12;
        System.out.println("Jam kerja = "+jamkerja + "jam");
        return jamkerja;
    }
}
