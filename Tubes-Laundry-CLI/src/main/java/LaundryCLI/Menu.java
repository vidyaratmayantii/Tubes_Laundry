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
        Riwayat histori = new Riwayat();
        while (true) {
            System.out.println("1. Pesan jasa Laundry");
            System.out.println("2. Tampilkan detail pemesanan");
            System.out.println("3. Tampilkan riwayat pemesanan");
            System.out.println("4. Keluar");
            System.out.println("Pilih opsi : ");
            //histori.listPesanan.add(null);
            int opsi = input.nextInt();
            if (opsi == 4){
                break;
            } else if (opsi == 1){
                Pemesanan order = new Pemesanan();
                histori.listPesanan.add(order);
                
            } else if (opsi == 2) {
                
            } else if (opsi == 3) {
                histori.Detail();
            }
        }
        
    }
}
