/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Andre
 */
public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
   
        @Override
    public float luas()
    {
        alas  = scan.nextInt();
        tinggi  = scan.nextInt();
        
        float luas = (alas*tinggi) / 2;
        System.out.println("LUAS SEGITIGA = "+luas);
        return luas;
    }
    
     @Override
    public float keliling()
    {
        float keliling = (3 * alas);
        System.out.println("KELILING SEGITIGA = "+keliling);
        return keliling;
    }
    
    
}
