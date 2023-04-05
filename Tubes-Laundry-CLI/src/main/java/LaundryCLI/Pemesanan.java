/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 *
 * @author Haikal
 */
public class Pemesanan {
    private final String nama, alamat, noHP;
    private final double cucian;
    private double hitungBiaya = 0;
    private LocalDateTime tanggalPemesanan, jadwalPengiriman;
    
    public Pemesanan(){
        Scanner x = new Scanner(System.in);
        System.out.println("Siapa namamu: ");
        nama = x.nextLine();
        System.out.println("Isi alamat pengiriman: ");
        alamat = x.nextLine();
        System.out.println("Isi nomor HP mu: ");
        noHP = x.nextLine();
        System.out.println("Berat cucian: ");
        cucian = x.nextDouble();
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNoHP(){
        return noHP;
    }
    public double cucian(){
        return cucian;
    }
    
    public String getTanggalPemesanan(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH:mm");
        String currentTime = now.format(formatter);
        return currentTime;
    }
    
}
