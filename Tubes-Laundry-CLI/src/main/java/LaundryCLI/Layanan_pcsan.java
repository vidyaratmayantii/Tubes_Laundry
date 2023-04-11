/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

/**
 *
 * @author Asus
 */
public class Layanan_pcsan extends Layanan {
    
    public Layanan_pcsan(int pilihanLayanan, int pilihanWaktu,double cucian) {
        super(pilihanLayanan, pilihanWaktu, cucian);
    }
    
    @Override
    public void printLayanan(){
        if(super.getLayanan() == 2){
             System.out.println("Layanan yang anda pilih adalah pcs");
        }else{
            System.out.println("Opsi yang anda pilih tidak tersedia");
        }
        
        switch (super.getWaktu()) {
            case 1 -> System.out.println("Laundry anda akan selesai 3 jam lagi");
            case 2 -> System.out.println("Laundry anda akan selesai 6 jam lagi");
            case 3 -> System.out.println("Laundry anda akan selesai kurang lebih 1 hingga 2 hari lagi");
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }
    
}
