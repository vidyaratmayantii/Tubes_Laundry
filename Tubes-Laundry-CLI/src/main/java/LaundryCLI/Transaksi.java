/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

/**
 *
 * @author Haikal
 */
public class Transaksi extends Pemesanan implements Printable{
    
    private int jumlah;
    
    public Transaksi(int jumlah,int pilihanLayanan , int pilihanWaktu,double cucian,String nama, String alamat, String noHP) {
        super(pilihanLayanan,pilihanWaktu, cucian, nama, alamat,noHP );
        this.jumlah = jumlah;
    }
    
    public void HitungBiaya(){
        if(super.getLayanan() == 1){
            jumlah = (int) (switch (super.getWaktu()) {
                case 1 -> super.getCucian()*12000;
                case 2 -> super.getCucian()*10000;
                default -> super.getCucian()*6000;
            });
        }else if(super.getLayanan() == 2){
            jumlah = (int) (switch (super.getWaktu()) {
                case 1 -> super.getCucian()*8000;
                case 2 -> super.getCucian()*7000;
                default -> super.getCucian()*6000;
            });
        }
    }
    
    @Override
    public void printDetails(){
        System.out.println("Nama Pelanggan\t: " + getNama());
        System.out.println("Alamat kirim\t: " + getAlamat());
        System.out.println("Nomor Handphone\t: " + getNoHP());
        System.out.println("Jumlah cucian/total cucian\t: " + getCucian());
        switch (super.getLayanan()) {
            case 1:
                if(super.getWaktu() == 1){
                    System.out.println("Jenis Layanan: Kilat Kiloan");
                }else if(super.getLayanan()== 2){
                    System.out.println("Jenis Layanan: Express Kiloan");
                }else{
                    System.out.println("Jenis Layanan: Regular Kiloan");
                }   break;
            case 2:
                if(super.getWaktu() == 1){
                    System.out.println("Jenis Layanan: Kilat Satuan");
                }else if(super.getLayanan()== 2){
                    System.out.println("Jenis Layanan: Express Satuan");
                }else{
                    System.out.println("Jenis Layanan: Regular Satuan");
                }   break;
            default:
                System.out.println("Piliahan jasa tidak ada");
                break;
        }
        System.out.println("Jumlah cucian/ Total berat cucian: "+ super.getCucian());
        System.out.println("Total biaya: "+ jumlah);
        
    }
    
}
