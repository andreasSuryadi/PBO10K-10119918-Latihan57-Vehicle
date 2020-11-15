/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan57vehicle;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data dari 
 * kendaraan
 * 
 */

public class PBO10K10119918Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        
        System.out.println("Brand : " + bicycle.getBrand());
        System.out.println("Model : " + bicycle.getModel());
        System.out.println("Jumlah Gear : " + bicycle.getGearCount());
        
        System.out.println();
        
        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);
        
        System.out.println("Brand : " + skateboard.getBrand());
        System.out.println("Model : " + skateboard.getModel());
        System.out.println("Jumlah Gear : " + skateboard.getBoardLength());
    }
    
}
