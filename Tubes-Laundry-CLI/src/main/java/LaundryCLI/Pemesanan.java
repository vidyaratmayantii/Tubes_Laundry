/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Haikal
 */
public class Pemesanan implements Printable{

    private final String nama;
    private final String alamat;
    private final String noHP;
    private final double cucian;
    private double hitungBiaya = 0;
    
    //should be above formatter variable in constructor
    private ArrayList<String> time = new ArrayList<>();
    private LocalDateTime now = LocalDateTime.now();
    
    public Pemesanan(String nama, String alamat, String noHP, double cucian) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.cucian = cucian;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, HH:mm:ss", Locale.getDefault());
        String currentTime = now.format(formatter);
        time.add(currentTime);
    }

    public ArrayList<String> getTime() {
        return time;
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
    public double getCucian(){
        return cucian;
    }
    
    @Override
    public void printDetails() {
        System.out.println("Pelanggan " + nama + " membawa " + cucian + " kg cucian pada tanggal" +
                time.get(0));
    }
    
    public String jadwalPengiriman(Riwayat histori){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        var waktu = LocalDateTime.now();
        int count = 0;
        var arr = histori.listPesanan;
        for (int i=0; i<arr.size();i++){
            String cariHari = arr.get(i).time.get(0);
            if (cariHari.contains(waktu.format(formatter)) ){
                count++;
            }
        }
        String pengembalianJamSibuk = now.plusDays(3).format(formatter);
        String pengembalianNormal = now.plusDays(2).format(formatter);
        String hasil = (count > 5) ? pengembalianJamSibuk : pengembalianNormal;
        //System.out.println(count);
        return hasil;
    }
}
