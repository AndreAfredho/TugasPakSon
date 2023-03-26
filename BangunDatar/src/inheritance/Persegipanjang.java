/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Andre
 */
public class Persegipanjang extends BangunDatar{
    float panjang;
    float lebar;
    
        @Override
    public float luas()
    {
        panjang  = scan.nextInt();
        lebar  = scan.nextInt();
        float luas = panjang * lebar;
        System.out.println("LUAS PERSEGI PANJANG = "+luas);
        return luas;
    }
    
        @Override
    public float keliling()
    {
        float keliling = 2*panjang + 2*lebar;
        System.out.println("KELILING PERSEGI PANJANG = "+keliling);
        return keliling;
    }
}
