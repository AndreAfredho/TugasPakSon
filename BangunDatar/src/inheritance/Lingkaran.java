/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Andre
 */
public class Lingkaran extends BangunDatar {
    //jarijari lingkaran
    float r;

    @Override
    float luas ()
    {
        r  = scan.nextInt();
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran: "+ luas);
        
        return luas;
       
    }
    @Override
    float keliling ()
    {
        float keliling =(float) (2 * Math.PI * r);
        System.out.println("KELILING LINGKARAN:" + keliling);
        return keliling; 
    }
}
