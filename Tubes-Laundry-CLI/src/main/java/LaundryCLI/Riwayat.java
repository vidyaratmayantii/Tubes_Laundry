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
public class Riwayat extends Pemesanan implements Printable{
    public Riwayat(int pilihanWaktu, int pilihanLayanan,double cucian,String nama, String alamat, String noHP){
        super(pilihanLayanan,pilihanWaktu,cucian,nama, alamat, noHP);
    }

    ArrayList<Pemesanan> listPesanan = new ArrayList<>();
     ArrayList<Layanan> listLayanan = new ArrayList<>();
    
    @Override
    public void printDetails(){
        //listPesanan.add(this);
        System.out.println("\n===============================================");
        System.out.println("Riwayat pemesanan");
        for (int i = listPesanan.size() - 1; i >= 0; i--) {
            System.out.println(listPesanan.get(i).getTime().get(0));
            System.out.println("Nama Pelanggan\t: " + listPesanan.get(i).getNama());
            System.out.println("Alamat kirim\t: " + listPesanan.get(i).getAlamat());
            System.out.println("Nomor Handphone\t: " + listPesanan.get(i).getNoHP());
            System.out.println("Jumlah cucian/total cucian\t: " + listPesanan.get(i).getCucian());
            System.out.println("Jenis Layanan\t: " + listLayanan.get(i).waktu + " " + listLayanan.get(i).layanan);
            System.out.println("Jadwal Pengiriman\t: " + listPesanan.get(i).jadwalPengiriman(this));
            System.out.println();
        }
        System.out.println("===============================================\n");
    }
}
