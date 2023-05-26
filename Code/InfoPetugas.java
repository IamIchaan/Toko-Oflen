/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoofflen;

/**
 *
 * @author Ichan
 */
public class InfoPetugas extends Budak{
    public void infoPetugas(){
        
    
    }
    public void DaftarPetugas(String nama, String NoTelp, String Alamat, int posisi){
        System.out.println("ID\t:"+super.getJmlPetugas());
        super.setNama(nama);
        System.out.println("Nama Petugas\t: "+nama);   
        System.out.println("Jabatan\t\t: "+super.getJabatanList(posisi));
        super.setJabatan(posisi);
        super.setTelepon(NoTelp);
        System.out.println("Nomor Telepon\t: "+NoTelp);
        super.setAlamat(Alamat);
        System.out.println("Alamat\t\t: "+Alamat);        
    }
    public void PrintPetugas(int id){        
        System.out.println("Nama Petugas\t: "+super.getNama(id));   
        System.out.println("Jabatan\t\t: "+super.getJabatanList(super.getJabatan(id)));
        System.out.println("Nomor Telepon\t: "+super.getTelepon(id));
        System.out.println("Alamat\t\t: "+super.getAlamat(id));
    }

    @Override
    public void PrintKaryawan(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}