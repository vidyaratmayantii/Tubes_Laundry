/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

/**
 *
 * @author Asus
 */
public class Layanan_kiloan extends Layanan{
    
    public Layanan_kiloan(int pilihanLayanan, int pilihanWaktu) {
        super(pilihanLayanan, pilihanWaktu);
    }
    
    @Override
    public void printLayanan(){
        if(super.getLayanan() == 1){
             System.out.println("Layanan yang anda pilih adalah kiloan");
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
