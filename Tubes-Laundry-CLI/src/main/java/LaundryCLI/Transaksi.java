/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

/**
 *
 * @author Haikal
 */
public class Transaksi extends Pemesanan {
    
    private int jumlah;
    
    public Transaksi(int jumlah,int pilihanLayanan, int pilihanWaktu, String nama, String alamat, String noHP, double cucian) {
        super(pilihanLayanan, pilihanWaktu, nama, alamat, noHP, cucian);
        this.jumlah = jumlah;
    }
    
    public void HitungBiaya(){
        if(super.getLayanan() == 1){
            if(super.getWaktu() == 1){
            jumlah = (int) (super.getCucian()*12000);
            }else if(super.getWaktu() == 2){
            jumlah = (int) (super.getCucian()*10000);
            }else{
            jumlah = (int) (super.getCucian()*6000);
            }
        }else if(super.getLayanan() == 2){
            if(super.getWaktu() == 1){
            jumlah = (int) (super.getCucian()*8000);
            }else if(super.getWaktu() == 2){
            jumlah = (int) (super.getCucian()*7000);
            }else{
            jumlah = (int) (super.getCucian()*6000);
            }
        }
    }
    
    public void printBiaya(){
        System.out.println("Nama Pelanggan : "+ super.getNama());
        System.out.println("Alamat Pelanggan: "+ super.getAlamat());
        System.out.println("No HP Pelanggan: "+ super.getNoHP());
        System.out.println("Jumlah cucian/ Total berat cucian: "+super.getCucian());
        System.out.println("Total biaya: "+ jumlah);
        
    }
    
}
