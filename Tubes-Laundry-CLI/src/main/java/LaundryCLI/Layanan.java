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
    public double cucian;
    
    public Layanan(int pilihanLayanan, int pilihanWaktu,double cucian){
        this.pilihanLayanan = pilihanLayanan;
        this.pilihanWaktu = pilihanWaktu;
        this.cucian = cucian;
    }
    
    
    public int getLayanan(){
        return this.pilihanLayanan;
    }

    public int getWaktu(){
        return this.pilihanWaktu;
    }
    public double getCucian(){
        return this.cucian;
    }
    
    public void printLayanan(){
        
        switch (this.pilihanLayanan) {
            case 1 -> {
                this.layanan = "Kiloan";
            }
            case 2 -> {
                this.layanan = "Satuan";
            }
            default -> System.out.println("Opsi yang anda pilih tidak tersedia");
        }
        switch (this.pilihanWaktu) {
            case 1:
                this.waktu = "Kilat";
                break;
            case 2:
                this.waktu= "Express";
                break;
            case 3:
                this.waktu = "Regular";
                break;
            default:
                System.out.println("Opsi yang anda pilih tidak tersedia");
                break;
        }
    }
    
}
