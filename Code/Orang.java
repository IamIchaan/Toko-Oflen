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
public abstract class Orang implements User{
    private ArrayList <String> namaOrang = new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telepon = new ArrayList <>();
    private ArrayList <Integer> saldo = new ArrayList <>(); 
    
    public Orang(){
        //Member default 1
        namaOrang.add("Mr.Ambasting");
        alamat.add("Jl. Nega");
        telepon.add("08210924924");
        saldo.add(15000000);
    }
    
    public int getJmlOrang(){
        return namaOrang.size();
    }
    
     
    public void setNama(String Nama, int index){
        namaOrang.add(Nama);
    }
    @Override
    public void setNama(String Nama) {
        namaOrang.add(Nama);
    }
    @Override
    public void setAlamat(String Alamat) {
        alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        telepon.add(Telepon);
    }
    
    public void setSaldo (int Saldo){
        saldo.add(Saldo);
    }
    
    public void editSaldo (int index, int saldo){
        this.saldo.set(index, saldo);
    }

    @Override
    public String getNama(int Nama) {
        return namaOrang.get(Nama);
    }

    @Override
    public String getAlamat(int Alamat) {
        return alamat.get(Alamat);
    }

    @Override
    public String getTelepon(int Telepon) {
        return telepon.get(Telepon);
        
    }
    public int getSaldo (int Saldo){
        return saldo.get(Saldo);
    }
    public abstract void PrintOrang(int id);
    public abstract void DaftarOrang(String nama, String NoTelp, String Alamat, int saldomu);
}