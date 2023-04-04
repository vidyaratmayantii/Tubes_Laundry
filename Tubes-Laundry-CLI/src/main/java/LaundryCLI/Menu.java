/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaundryCLI;
import java.util.Scanner;

public class Menu {
    
    public void printMenu(){
        System.out.println("Selamat datang di aplikasi Laundry, Silakan pilih menu berikut.");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Pesan jasa Laundry");
            System.out.println("2. Tampilkan detail pemesanan");
            System.out.println("3. Tampilkan riwayat pemesanan");
            System.out.println("4. Keluar");
            System.out.println("Pilih opsi : ");
            int opsi = input.nextInt();
            if (opsi == 4){
                break;
            } else if (opsi == 1){
                Riwayat histori = new Riwayat();
                Pemesanan order = new Pemesanan();
                order.printDetail();
                histori.listPesanan.add(order);
            }
        }
        
    }
}
