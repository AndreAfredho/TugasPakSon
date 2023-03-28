/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Andre
 */
public class Boss extends Employee
{
    float nipB;
    String namaB;
    String jabatanboss;
    float gajiB;
    float potongangajiboss;
    float jamkerjaboss;
    
    
    @Override
    public float nip()
    {
        float nip = 1112231;
        System.out.println("Nip Bos = "+nip);
        return nip;
    }
    
    public String namaB()
    {
        String nama = ("andre");
        System.out.println("Nama Boss = "+nama);
        return nama;
    }
    
    
    public String jabatanB()
    {
        String jabatan = ("boss");
        System.out.println("Jabatan = "+jabatan);
        return jabatan;
    }
    
        @Override
    public float gaji()
    {
        float gaji = 9000000;
        System.out.println("Gaji = "+gaji);
        return gaji;
    }
        @Override
    public float potongangaji()
    {
        float potongangaji = 100000;
        System.out.println("Potongan gaji = "+potongangaji);
        return potongangaji;
    }
        @Override
    public float jamkerja()
    {
        int jamkerja = 10;
        System.out.println("Jam kerja = "+jamkerja +"jam");
        return jamkerja;
    }
}
