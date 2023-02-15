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
public class hanghoa {
    int id;
    String tenhang, loaihang;
    int soluonghang;
    String motahang;

    public hanghoa() {
    }

    public hanghoa(String tenhang, String loaihang, int soluonghang, String motahang) {
        this.tenhang = tenhang;
        this.loaihang = loaihang;
        this.soluonghang = soluonghang;
        this.motahang = motahang;
    }
    
    public hanghoa(int id, String tenhang, String loaihang, int soluonghang, String motahang) {
        this.id = id;
        this.tenhang = tenhang;
        this.loaihang = loaihang;
        this.soluonghang = soluonghang;
        this.motahang = motahang;
    }

    hanghoa(int aInt, String string, String string0, String string1, String string2, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public hanghoa(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getLoaihang() {
        return loaihang;
    }

    public void setLoaihang(String loaihang) {
        this.loaihang = loaihang;
    }

    public int getSoluonghang() {
        return soluonghang;
    }

    public void setSoluonghang(int soluonghang) {
        this.soluonghang = soluonghang;
    }

    public String getMotahang() {
        return motahang;
    }

    public void setMotahang(String motahang) {
        this.motahang = motahang;
    }
    
    
}
