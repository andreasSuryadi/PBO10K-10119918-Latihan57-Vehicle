/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan57vehicle;

/**
 *
 * @author andreas
 */
public class Vehicle {
    private String myBrand, myModel;
    
    public Vehicle() {
        System.out.print("");
    }
    
    public String getBrand() {
        return myBrand;
    }
    
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    
    public String getModel() {
        return myModel;
    }
    
    public void setModel(String model) {
        this.myModel = model;
    }
}
