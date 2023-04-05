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
public class Riwayat extends Pemesanan{
    ArrayList<Pemesanan> listPesanan = new ArrayList<>();
    
    //Pemesanan x : listPesanan
    public void Detail(){
        listPesanan.add(this);
        System.out.println("Riwayat pemesanan");
        for (Pemesanan order : listPesanan) {
            System.out.println(order.getTanggalPemesanan());
            System.out.println("Nama\t: " + order.getNama());
            System.out.println("Alamat\t: " + order.getAlamat());
            System.out.println("No HP\t: " + order.getNoHP());
            System.out.println();
        }
    }
}
