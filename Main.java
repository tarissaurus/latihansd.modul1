/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();
        
        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);
        
        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        
        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);
        
        System.out.println("Menu Konsumsi");
        for(Konsumsi<Makanan, Minuman> konsumsi: listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();
            
            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
    
}
