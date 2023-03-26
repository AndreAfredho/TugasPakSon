/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
//        persegi.sisi = 2;

        //membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
//        lingkaran.r = 22;

        //membuat objek persegi panjang dan mengisi nilai properti
        Persegipanjang persegiPanjang = new Persegipanjang();
//        persegiPanjang.panjang = 8;
//        persegiPanjang.lebar = 4;

        //membuat objek segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
//        mSegitiga.alas = 12;
//        mSegitiga.tinggi = 8;

        //memanggil method dan luas keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();

    }
}
