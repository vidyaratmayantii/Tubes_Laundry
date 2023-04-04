/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

import java.util.ArrayList;
/**
 *
 * @author Haikal
 */
public class Riwayat {
    ArrayList<Pemesanan> listPesanan = new ArrayList<>();
    
    public void printDetail(){
        System.out.println("Riwayat pemesanan");
        for (Pemesanan x : listPesanan){
            System.out.println("Nama: " + x.getNama());
            System.out.println("");
        }
    }
}
