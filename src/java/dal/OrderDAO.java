/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import model.Customer;
import model.item;
import model.orderdetail;
import model.orders;
/**
 *
 * @author nqt26
 */
public class OrderDAO extends DBContext{
    public void addOrder(Customer a,List<item> i){
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try{
        String sql1 ="INSERT INTO dbo.Orders\n" +
"(\n" +
"    CustomerID,\n" +
"    Address,\n" +
"    OrderDate,\n" +
"    status\n" +
") VALUES(?,?,?,?)";
        
            PreparedStatement st1=connection.prepareStatement(sql1);
            st1.setInt(1, a.getId());
            st1.setString(2, a.getAddress());
            st1.setString(3, date);
            st1.setInt(4, 4);
            st1.executeUpdate();
          
            String sql2="select top 1 OrderID from dbo.Orders order by OrderID desc";
            PreparedStatement st2=connection.prepareStatement(sql2);
            ResultSet rs=st2.executeQuery();
            if(rs.next()){
                int oid=rs.getInt(1);
                for(item it:i){
                String sql3="insert into dbo.OrderDetail values(?,?,?,?)";
                PreparedStatement st3=connection.prepareStatement(sql3);
                st3.setInt(1, oid);
                st3.setInt(2, it.getBookid().getID());
                st3.setInt(3, it.getQuantity());
                st3.setDouble(4, it.getQuantity()*it.getBookid().getUnitprice());
                st3.executeUpdate();
            }
            }
            
            String sql4 = "update dbo.BOOK set UnitInStock = UnitInStock - ? "
                        + "where id = ?";
            PreparedStatement st4=connection.prepareStatement(sql4);
            for(item it:i){
                st4.setInt(1, it.getQuantity());
                st4.setInt(2, it.getBookid().getID());
                st4.executeUpdate();
            }
        } catch(SQLException s1){
            System.out.println(s1);
        }
    }
    
    public void UpdateOrder(int id,int status){
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        try{
            String sql="update dbo.Order set status=? where OrderID=?";
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, status);
            st.setInt(2, id);
            st.executeUpdate();
            if(status == 2){
                String sql1="update dbo.Order set shippeddate=? where id=?";
                PreparedStatement st1=connection.prepareStatement(sql);
            st1.setString(1, date);
            st1.setInt(2, id);
            st1.executeUpdate();
            }
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public List<orders> getneworder(){
        String sql="Select Top 100 * from dbo.orders order by OrderID desc";
        List<orders> list=new  ArrayList<>();
        CustomerDAO cd=new CustomerDAO();
        StatusDAO sd=new StatusDAO();
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                orders ord=new orders();
                ord.setId(rs.getInt(1));
                ord.setCus(cd.getbyid(rs.getInt(2)));
                ord.setAddress(rs.getString(3));
                ord.setOrderDate(rs.getString(4));
                ord.setShippeddate(rs.getString(5));
                ord.setStatus(sd.getbyid(rs.getInt(6)));
                list.add(ord);
            }
        } catch( SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public orders getorderbyid(int id){
        String sql="Select  * from dbo.orders where orderID=?";
        CustomerDAO cd=new CustomerDAO();
        StatusDAO sd=new StatusDAO();
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                orders ord=new orders();
                ord.setId(rs.getInt(1));
                ord.setCus(cd.getbyid(rs.getInt(2)));
                ord.setAddress(rs.getString(3));
                ord.setOrderDate(rs.getString(4));
                ord.setShippeddate(rs.getString(5));
                ord.setStatus(sd.getbyid(rs.getInt(6)));
                return ord;
            }
        } catch( SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public List<orderdetail> getbyorderid(int id){
        String sql="Select * from dbo.Orderdetail where orderID=?";
        List<orderdetail> list= new ArrayList<>();
        BookDAO bd=new BookDAO();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                orderdetail ord=new orderdetail();
                ord.setOid(getorderbyid(rs.getInt(1)));
                ord.setBid(bd.GetbyID(rs.getInt(2)));
                ord.setQuantity(rs.getInt(3));
                ord.setTotal(rs.getDouble(4));
                list.add(ord);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
     public List<orderdetail> getbybookid(List<Book> a){        
        List<orderdetail> list= new ArrayList<>();
        BookDAO bd=new BookDAO();
        
        try{
            String sql="Select * from dbo.Orderdetail where BookID=?";
            PreparedStatement st=connection.prepareStatement(sql);
            for(Book b:a){

            st.setInt(1, b.getID());
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                orderdetail ord=new orderdetail();
                ord.setOid(getorderbyid(rs.getInt(1)));
                ord.setBid(bd.GetbyID(rs.getInt(2)));
                ord.setQuantity(rs.getInt(3));
                ord.setTotal(rs.getDouble(4));
                list.add(ord);
            }
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
     
    public List<orders> getbycusid(int id){
        String sql="Select  * from dbo.orders where CustomerID=?";
        List<orders> list=new  ArrayList<>();
        CustomerDAO cd=new CustomerDAO();
        StatusDAO sd=new StatusDAO();
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
           while(rs.next()){
                orders ord=new orders();
                ord.setId(rs.getInt(1));
                ord.setCus(cd.getbyid(rs.getInt(2)));
                ord.setAddress(rs.getString(3));
                ord.setOrderDate(rs.getString(4));
                ord.setShippeddate(rs.getString(5));
                ord.setStatus(sd.getbyid(rs.getInt(6)));
                list.add(ord);
            }
        } catch( SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
