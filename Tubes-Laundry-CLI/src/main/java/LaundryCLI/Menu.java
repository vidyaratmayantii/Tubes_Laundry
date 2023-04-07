/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;
import java.util.Scanner;

public class Menu {
    private String nama, alamat, noHP;
    private double cucian;
    
    public void printMenu(){
        System.out.println("Selamat datang di aplikasi Laundry, Silakan isi detail pelanggan");
        System.out.println("1. Pesan jasa Laundry");
        System.out.println("2. Lakukan Transaksi");
        System.out.println("3. Tampilkan riwayat pemesanan");
        System.out.println("4. Keluar");
        System.out.println("Pilih opsi : ");

    }
    
    public void options(){
        Riwayat histori = new Riwayat(nama, alamat, noHP, cucian);
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
                    System.out.println("Berat cucian pelanggan (kg)");
                    cucian = data.nextDouble();
                    Pemesanan order = new Pemesanan(nama, alamat, noHP, cucian);
                    histori.listPesanan.add(order);
                    break;
                case 2:
                    break;
                case 3:
                    histori.printDetails();
                case 5:
                    Pemesanan dummy = new Pemesanan("flxnzz", "New York", "08193048392", 2);
                    Pemesanan dummy2 = new Pemesanan("ourmine", "Indonesia", "4492300139", 4);
                    Pemesanan dummy3 = new Pemesanan("x47", "Bandung", "1320394103", 3);
                    histori.listPesanan.add(dummy);
                    histori.listPesanan.add(dummy2);
                    histori.listPesanan.add(dummy3);
                    dummy.jadwalPengiriman(histori);
                    
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
