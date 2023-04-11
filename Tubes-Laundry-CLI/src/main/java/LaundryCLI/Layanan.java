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
    public String waktu;
    public String layanan;
    private double cucian;
    
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
    public double getCucian(){
        return cucian;
    }
    public void printLayanan(){
        Scanner dataLayanan = new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        System.out.println("Input layanan yang dipilih:");
        System.out.println("1.Kiloan");
        System.out.println("2.Satuan");
        pilihanLayanan = dataLayanan.nextInt();
        if(pilihanLayanan == 1 || pilihanLayanan == 2){
            System.out.println("Input layann waktu yang dipilih:");
            System.out.println("1.Kilat");
            System.out.println("2.Express");
            System.out.println("3.Regular");
            pilihanWaktu = dataLayanan.nextInt();
            if (pilihanWaktu == 1){
                this.waktu = "Kilat";
            } else if (pilihanWaktu == 2){
                this.waktu = "Express";
            } else if (pilihanWaktu == 3) {
                this.waktu = "Regular";
            }
        }
        
        if(pilihanLayanan == 1){
            System.out.println("Berat cucian pelanggan (kg)");
            cucian = data.nextDouble();
        }else if(pilihanLayanan == 2){
            System.out.println("Jumlah baju (pcs)");
            cucian = data.nextInt();
        }
        
        switch (this.pilihanLayanan) {
            case 1:
                System.out.println("Layanan yang anda pilih adalah kiloan");
                this.layanan = "Kiloan";
                break;
            case 2:
                System.out.println("Layanan yang anda pilih adalah satuan");
                this.layanan = "Satuan";
                break;
            default:
                System.out.println("Opsi yang anda pilih tidak tersedia");
                break;
        }
        
    }
}
