/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

/**
 *
 * @author Asus
 */
public class Layanan {
    private String pilihanLayanan;
    private String pilihanWaktu;
    
    public Layanan(String pilihanLayanan, String pilihanWaktu){
        this.pilihanLayanan = pilihanLayanan;
        this.pilihanWaktu = pilihanWaktu;
    }
    
    public void setLayanan(String pilihanLayanan){
        this.pilihanLayanan = pilihanLayanan;
    }
    
    public String getLayanan(){
        return this.pilihanLayanan;
    }
    
    public void setWaktu(String pilihanWaktu){
       this.pilihanWaktu = pilihanWaktu;
    }
    
    public String getWaktu(){
        return this.pilihanWaktu;
    }
    
    public void printLayanan(){
        if(null == this.pilihanLayanan){
            System.out.println("Layanan tidak tersedia");
        }else switch (this.pilihanLayanan) {
            case "Kiloan" -> System.out.println("Layanan yang anda pilih adalah kiloan");
            case "Satuan" -> System.out.println("Layanan yang anda pilih adalah satuan");
            default -> System.out.println("Layanan tidak tersedia");
        }
    }
    
    public void printWaktu(){
        if(null == this.pilihanWaktu){
            System.out.println("Anda belum memilih waktu ");
        }else switch (this.pilihanWaktu) {
            case "Kilat" -> System.out.println("Laundry anda akan selesai 3 jam lagi");
            case "Expres" -> System.out.println("Laundry anda akan selesai 6 jam lagi");
            case "Regular" -> System.out.println("Laundry anda akan selesai kurang lebih 1 hingga 2 hari lagi");
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }
}
