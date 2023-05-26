/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoofflen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ichan
 */
public class Transaksi {
    ArrayList <Integer> idMember = new ArrayList <>();
    ArrayList <Integer> idBarang = new ArrayList <>();
    ArrayList <Integer> Banyak = new ArrayList <>();
    public Transaksi(){
        idMember.add(0);
        idBarang.add(0);
        Banyak.add(10);
        
        idMember.add(0);
        idBarang.add(1);
        Banyak.add(3);
    }
    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyaknya){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.Banyak.add(banyaknya);
        barang.editStok(idBarang, barang.getStok(idBarang)-banyaknya);
    }
    public void ProsesTransaksi(Orang orang, Barang barang, Transaksi transaksi, int Member){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Berbelanja");
        System.out.print("Berbelanja Sebagai Member: ");
        int idMember = Member;
        System.out.println("Selamat Datang "+orang.getNama(idMember));
        ArrayList <Integer> idBarang = new ArrayList <>();
        ArrayList <Integer> Banyak = new ArrayList <>();
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan Kode Barang (Tekan 99 Untuk Confim): ");
            temp = input.nextInt();           
            if (temp<=barang.getJmlItem()) {
                idBarang.add(temp);
                System.out.print(barang.getBarang(idBarang.get(i))+ " Sebanyak: ");
                int banyak = input.nextInt();               
                if (banyak>barang.getStok(temp)) {
                    System.out.println("Maaf Stok Tidak cukup");
                    idBarang.remove(i);
                    i--;
                }
                else if (banyak<=barang.getStok(temp)){
                     Banyak.add(banyak); 
                     
                }   
                i++;
            }
        } while (temp!=99);
        
        System.out.println("Transaksi belanja Member "+ orang.getNama(idMember)+" Sebagai berikut: ");
        System.out.println("Nama Barang \t\tQty \tHarga \tJumlah \t");
        int total = 0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = Banyak.get(j)*barang.getHarga(idBarang.get(j));
            total += jumlah;
            System.out.println(barang.getBarang(idBarang.get(j))+"\t\t"+Banyak.get(j)+"\t"+
                    barang.getHarga(idBarang.get(j))+"\t"+jumlah);
            transaksi.setTransaksi(barang, idMember, idBarang.get(j), Banyak.get(j));
        }
        System.out.println("Total Belanja: "+total);
        orang.editSaldo(idMember, orang.getSaldo(idMember)-total);
    
}
    
    public int getIdBarang(int idBarang){
        return this.idBarang.get(idBarang);       
    }
    
    public int getIdMember(int idMember){
        return this.idMember.get(idMember);       
    }
    
    public int getBanyaknya(int banyak){
        return this.Banyak.get(banyak);       
    }
    public int getJmlTransaksi(){
        return this.idMember.size();
    }
}
