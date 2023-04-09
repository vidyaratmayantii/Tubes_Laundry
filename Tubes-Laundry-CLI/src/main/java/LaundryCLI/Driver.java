/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package LaundryCLI;
/**
 *
 * @author Haikal
 */
public class Driver {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        Layanan layanan = new Layanan("Kiloann","Regularr");
        layanan.printLayanan();
        layanan.printWaktu();
        
        
        
    }
}
