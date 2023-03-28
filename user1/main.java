/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user1;
public class main {
    public static void main(String[] args) {
        
        Transaksi t = new Transaksi();
        Member1 m = new Member1();
        Laporan l = new Laporan();
        Barang b = new Barang();
        Karyawan K = new Karyawan();
        
        
        l.laporan(b);
        l.laporan(m);
        l.laporan(K);
        t.prosesTransaksi(m, t, b);
        
        
        l.laporan(b);
    }
}