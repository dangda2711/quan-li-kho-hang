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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HangHoaModify {
    public static List<hanghoa> findAll() {
        List<hanghoa> dshanghoa = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/quanlikho", "root", "");
            
            //query
            String sql = "select * from khohang";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                hanghoa hang = new hanghoa(resultSet.getInt("id"), 
                        resultSet.getString("tenhang"), resultSet.getString("loaihang"), 
                        resultSet.getInt("soluonghang"), 
                        resultSet.getString("motahang"));
                dshanghoa.add(hang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return dshanghoa;
    }
    
    public static void insert(hanghoa hang) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/quanlikho", "root", "");
            
            //query
            String sql = "insert into khohang(tenhang, loaihang, soluonghang, motahang) values(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, hang.getTenhang());
            statement.setString(2, hang.getLoaihang());
            statement.setInt(3, hang.getSoluonghang());
            statement.setString(4, hang.getMotahang());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void update(hanghoa hang) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/quanlikho", "root", "");

            
            //query
            String sql = "update khohang set tenhang=?,loaihang=?,soluonghang=?,motahang=? where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1,hang.getTenhang());
            statement.setString(2, hang.getLoaihang());
            statement.setInt(3, hang.getSoluonghang());
            statement.setString(4, hang.getMotahang());
            statement.setInt(5,hang.getId());
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify .class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/quanlikho", "root", "");
            
            //query
            String sql = "delete from khohang where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static List<Loaihang> thongKe(){
        List<Loaihang> dsLoaihang = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/quanlikho", "root", "");
            
            //query
            String sql = "select loaihang,count(loaihang) as 'soluongloai', sum(soluonghang) as 'tonghang'  from khohang group by loaihang ";
            statement = connection.prepareCall(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Loaihang loaihang = new Loaihang(resultSet.getString("loaihang"), 
                        resultSet.getInt("soluongloai"), resultSet.getInt("tonghang"));
                dsLoaihang.add(loaihang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        return dsLoaihang;
        
    }
    
    public static List<hanghoa> findByFullname(String tenhang) {
        List<hanghoa> dsKho = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3325/quanlikho", "root", "");
            
            //query
            String sql = "select * from khohang where (tenhang like ? or loaihang like ? )";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+tenhang+"%");
            statement.setString(2, "%"+tenhang+"%");
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                hanghoa hang = new hanghoa(resultSet.getInt("id"), 
                        resultSet.getString("tenhang"), resultSet.getString("loaihang"), 
                        resultSet.getInt("soluonghang"), resultSet.getString("motahang") );
                dsKho.add(hang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HangHoaModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return dsKho;
    }
    
    

}
