/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoofflen;

import java.util.ArrayList;

/**
 *
 * @author Ichan
 */
public class Barang {
    private ArrayList <String> namaBarang = new ArrayList <>();
    private ArrayList <Integer> stok = new ArrayList <>();
    private ArrayList <Integer> harga = new ArrayList <>();
    int sum; 
    
    public Barang(){
        // Barang default 1
        namaBarang.add("Doujin\t");
        stok.add(75);
        harga.add(50000);
        
        // Barang default 2
        namaBarang.add("Manga\t");
        stok.add(50);
        harga.add(120000);
        
        namaBarang.add("UwU Toy\t");
        stok.add(25);
        harga.add(100000);
    }
    
    public int getJmlBarang(){
        for (int i = 0; i < stok.size(); i++) {
            sum += stok.get(i);
        }
        return sum;
    }
    public int getJmlItem(){
        return namaBarang.size();
    }
    
     public void setNama(String Nama) {
        namaBarang.add(Nama);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }
    
    public void editStok(int index, int stok){
        this.stok.set(index, stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }
    
    public String getBarang(int barang) {
        return namaBarang.get(barang);
    }

    public int getStok(int stok) {
        return this.stok.get(stok);
        
    }
    public int getHarga (int harga){
        return this.harga.get(harga);
    }
}
