
package inheritance;


public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
    public float luas()
    {
        sisi  = scan.nextInt();
        float luas = sisi*sisi;
        System.out.println("LUAS PERSEGI = "+luas);
        return luas;
    }
    @Override
    float keliling ()
    {
        float keliling = 4 * sisi;
        System.out.println("KELILING PERSEGI: "+ keliling);
        return keliling;
    }

}


