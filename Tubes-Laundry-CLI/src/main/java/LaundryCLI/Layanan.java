/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Layanan {
    private int pilihanLayanan;
    private int pilihanWaktu;
    
    public Layanan(int pilihanLayanan, int pilihanWaktu){
        this.pilihanLayanan = pilihanLayanan;
        this.pilihanWaktu = pilihanWaktu;
    }
    
    
    public int getLayanan(){
        return this.pilihanLayanan;
    }
    
    
    public int getWaktu(){
        return this.pilihanWaktu;
    }
    
    
    
    public void printLayanan(){
       
        switch (this.pilihanLayanan) {
            case 1:
                System.out.println("Layanan yang anda pilih adalah kiloan");
                break;
            case 2:
                System.out.println("Layanan yang anda pilih adalah satuan");
                break;
            default:
                System.out.println("Opsi yang anda pilih tidak tersedia");
                break;
        }
        
        if(this.pilihanLayanan == 1 || this.pilihanLayanan ==2){
            switch (this.pilihanWaktu) {
            case 1:
                System.out.println("Laundry anda akan selesai 3 jam lagi");
                break;
            case 2:
                System.out.println("Laundry anda akan selesai 6 jam lagi");
                break;
            case 3:
                System.out.println("Laundry anda akan selesai kurang lebih 1 hingga 2 hari lagi");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        }
    }
}
