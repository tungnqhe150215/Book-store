/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.item;

/**
 *
 * @author nqt26
 */
public class itemDAO extends DBContext{
    public List<item> getbycusid (int id){
        String sql="SELECT * FROM dbo.shoppingcart WHERE CustomerID = ?";
        List<item> list=new ArrayList<>();
        BookDAO bd=new BookDAO();
        CustomerDAO cd=new CustomerDAO();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                item i= new item();
                i.setBookid(bd.GetbyID(rs.getInt(2)));
                i.setCusid(cd.getbyid(rs.getInt(1)));
                i.setQuantity(rs.getInt(3));
                list.add(i);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public int deletebook(int cid,int bid){
        String sql="DELETE FROM dbo.shoppingcart WHERE CustomerID=? and bookID=?";
        List<item> list=new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, cid);
            st.setInt(2, bid);
            ResultSet rs= st.executeQuery();
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    
    public int deletecartid(int id){
          String sql="DELETE FROM dbo.shoppingcart WHERE CustomerID=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, id);
            return st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public int insert(int cid,int bid,int quantity){
            String sql="INSERT INTO dbo.shoppingcart\n" +
"(\n" +
"    CustomerID,\n" +
"    bookID,\n" +
"    quantity\n" +
")\n" +
"VALUES(?,?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, cid);
            st.setInt(2, bid);
            st.setInt(3, quantity);
            return st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public int update(int cid,int bid,int quantity){
        String sql="UPDATE dbo.shoppingcart SET quantity=?\n" +
"WHERE bookID=? AND CustomerID=?;";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, quantity);
            st.setInt(2, bid);
            st.setInt(3, cid);
            return st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
}
