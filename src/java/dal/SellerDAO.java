/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTree;
import model.Account;
import model.Customer;
import model.Seller;

/**
 *
 * @author nqt26
 */
public class SellerDAO extends DBContext{
    public int insert (String name,String phone,String email,String address,String account){
        String sql="INSERT INTO dbo.Seller(Name,Phone,Email,PlaceofReceipt,accname)\n" +
"VALUES(?,?,?,?,?)";
        try{
         PreparedStatement st=connection.prepareStatement(sql);
         st.setString(1,name);
         st.setString(2,phone);
         st.setString(3,email);
         st.setString(4,address);
         st.setString(5,account);
         return st.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public Seller getbyaccount (String account){
        String sql="SELECT * FROM dbo.Seller INNER JOIN dbo.ACCOUNT ON ACCOUNT.username = SELLER.accname\n" +
"WHERE username = ?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1,account);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Seller c=new Seller();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setPhone(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setAccname(new Account(rs.getString(7), rs.getString(8), rs.getInt(9)));
                return c;
            }
            
        } catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public Seller getbyid (int account){
        String sql="SELECT * FROM dbo.Seller INNER JOIN dbo.ACCOUNT ON ACCOUNT.username = SELLER.accname\n" +
"WHERE id = ?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1,account);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Seller c=new Seller();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setPhone(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setAccname(new Account(rs.getString(7), rs.getString(8), rs.getInt(9)));
                return c;
            }
            
        } catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public int update (String name,String phone,String email,String address,String ID){
            String sql="UPDATE dbo.seller SET name=?, phone=?, email=?, PlaceofReceipt=? \n" +
"WHERE accname=?";
                try{
         PreparedStatement st=connection.prepareStatement(sql);
         st.setString(1,name);
         st.setString(2,phone);
         st.setString(3,email);
         st.setString(4,address);
         st.setString(5,ID);
         return st.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        return 0;

            }
}
