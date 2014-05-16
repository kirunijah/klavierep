/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.model;

/**
 *
 * @author Oryza Khairunni
 */
public class Anggota {
    private String noAnggota;
    private String nama;
    private String alamat;
    private String pekerjaan;
    
    public Anggota() {
    }
    
    public Anggota (String no, String nama, String alamat, String pekerjaan){
        this.noAnggota = no;
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the noAnggota
     */
    public String getNoAnggota() {
        return noAnggota;
    }

    /**
     * @param noAnggota the noAnggota to set
     */
    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
            
    
}
