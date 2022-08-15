/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class AccountDAO extends DBContext{
    public Account getAccount(String username){
        String sql="select * from account where username=? ";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, username);            
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new Account(rs.getString("username"), 
                        rs.getString("password"),rs.getInt("userlevel"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public int create(Account a){
        String sql="insert into account values(?,?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, a.getPassword());
            st.setInt(3, a.getLevel());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int changePass(String username,String password){
        String sql="UPDATE dbo.ACCOUNT SET password=? \n" +
"WHERE username=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1,password);
            st.setString(2,username);
            return st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }

}
