/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.quanlikho;

/**
 *
 * @author ADMIN
 */
public class Loaihang {
    String loaihang;
    int soluongloai;
    int tonghang;

    public String getLoaihang() {
        return loaihang;
    }

    public void setLoaihang(String loaihang) {
        this.loaihang = loaihang;
    }

    public int getSoluongloai() {
        return soluongloai;
    }

    public void setSoluongloai(int soluongloai) {
        this.soluongloai = soluongloai;
    }

    public int getTonghang() {
        return tonghang;
    }

    public void setTonghang(int tonghang) {
        this.tonghang = tonghang;
    }

    public Loaihang(String loaihang, int soluongloai, int tonghang) {
        this.loaihang = loaihang;
        this.soluongloai = soluongloai;
        this.tonghang = tonghang;
    }
    
}
