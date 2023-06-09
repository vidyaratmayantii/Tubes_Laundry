/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;
import java.util.Scanner;

public class Menu {
    private String nama, alamat, noHP;
    private int pilihanWaktu ,pilihanLayanan;
    private double cucian;
    private int jumlah;
    
    public void printMenu(){
        System.out.println("Selamat datang di aplikasi Laundry, Silakan isi detail pelanggan");
        System.out.println("1. Pesan jasa Laundry");
        System.out.println("2. Lakukan Transaksi");
        System.out.println("3. Tampilkan riwayat pemesanan");
        System.out.println("4. Keluar");
        System.out.println("Pilih opsi : ");

    }
    
    public void options(){
        Riwayat histori = new Riwayat(pilihanLayanan,pilihanWaktu , cucian,nama, alamat, noHP);
        Scanner input = new Scanner(System.in);
        int opsi = 0;
        while (opsi != 4){
            printMenu();
            opsi = input.nextInt();
            Scanner data = new Scanner(System.in);
            switch (opsi) {
                case 1:
            
                    System.out.println("Input nama pelanggan");
                    nama = data.nextLine();
                    System.out.println("Masukan alamat pengiriman");
                    alamat = data.nextLine();
                    System.out.println("Nomor kontak pelanggan");
                    noHP = data.nextLine();
                    
                    Scanner dataLayanan = new Scanner(System.in);
                    Scanner dataWaktu = new Scanner(System.in);
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
                    }

                    if(pilihanLayanan == 1){
                        System.out.println("Berat cucian pelanggan (kg)");
                        cucian = dataWaktu.nextDouble();
                    }else if(pilihanLayanan == 2){
                        System.out.println("Jumlah baju (pcs)");
                        cucian = dataWaktu.nextInt();
                    }

                    Layanan layanan= new Layanan(pilihanLayanan, pilihanWaktu,cucian);
                    layanan.printLayanan();
                    
                    if(pilihanLayanan == 1){
                        Layanan layanan_kilo = new Layanan_kiloan(pilihanLayanan, pilihanWaktu,cucian);
                        layanan_kilo.printLayanan();
                    }else if(pilihanLayanan == 2){
                        Layanan layanan_pcs = new Layanan_pcsan(pilihanLayanan, pilihanWaktu,cucian);
                        layanan_pcs.printLayanan();
                    }
                    histori.listLayanan.add(layanan);
                    System.out.println();
                    Pemesanan order = new Pemesanan(pilihanLayanan,pilihanWaktu, cucian,nama, alamat, noHP);
                    histori.listPesanan.add(order);
                    System.out.println("");
                    
                    break;
                case 2:
                    System.out.println("===Struk Transaksi Laundry===");
                    Transaksi transaksi = new Transaksi(jumlah,pilihanLayanan, pilihanWaktu,cucian,nama, alamat, noHP);
                    transaksi.HitungBiaya();
                    transaksi.printDetails();
                    System.out.println("=============================");
                    System.out.println("");
                    break;
                case 3:
                    histori.printDetails();
                case 4:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
