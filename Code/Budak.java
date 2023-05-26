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
public abstract class Budak implements User{
    private ArrayList <String> namaPetugas=new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telepon = new ArrayList <>();
    private ArrayList <Integer> jabatan = new ArrayList <Integer>();
    private String ListJabatan[] = {"CEO - Chief Executive Officer","Manager","Employee","Intern"};
    
    public Budak(){
        // Karyawan Default pertama
        namaPetugas.add("Mas Rusdi");
        alamat.add("JL. Bogor");
        telepon.add("0892183341");
        jabatan.add(0);
        
        // Karyawan Default kedua
        namaPetugas.add("Pico");
        alamat.add("JL. Bokuno");
        telepon.add("0822443287");
        jabatan.add(1);
        
        // Karyawan Default tiga
        namaPetugas.add("Astolfo");
        alamat.add("JL. NoBiner");
        telepon.add("08234348849");
        jabatan.add(2);
        
    }
    public String getJabatanList(int jabatan){
       return ListJabatan[this.jabatan.get(jabatan)];
    }
    
    public int getJmlPetugas(){
        return namaPetugas.size();
    }

    @Override
    public void setNama(String Nama) {
        namaPetugas.add(Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        telepon.add(Telepon);
    }
    
    public void setJabatan(int Jabatan){
        jabatan.add(Jabatan);
    }

    @Override
    public String getNama(int Nama) {
        return namaPetugas.get(Nama);
    }

    @Override
    public String getAlamat(int Alamat) {
        return alamat.get(Alamat);
    }

    @Override
    public String getTelepon(int Telepon) {
        return telepon.get(Telepon);
    }
    
    public int getJabatan(int Jabatan) {
        return jabatan.get(Jabatan);
    }
   
    public abstract void PrintKaryawan(int id);

}