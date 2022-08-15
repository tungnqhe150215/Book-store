/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;
import model.Customer;
import model.Seller;

/**
 *
 * @author nqt26
 */
public class CustomerDAO extends DBContext{
    public int insert (String name,String phone,String email,String address,String account){
        String sql="INSERT INTO dbo.CUSTOMER(Name,Phone,Email,Address,accname)\n" +
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
        public Customer getbyaccount (String account){
        String sql="SELECT * FROM dbo.Customer INNER JOIN dbo.ACCOUNT ON ACCOUNT.username = CUSTOMER.accname\n" +
"WHERE username = ?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1,account);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Customer c=new Customer();
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
        
        public Customer getbyid (int id){
        String sql="SELECT * FROM dbo.Customer INNER JOIN dbo.ACCOUNT ON ACCOUNT.username = CUSTOMER.accname\n" +
"WHERE id = ?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1,id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Customer c=new Customer();
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
            String sql="UPDATE dbo.customer SET name=?, phone=?, email=?, address=? \n" +
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
