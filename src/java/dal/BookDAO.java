/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Author;
import model.Book;
import model.Cover;
import model.Publisher;
import model.Seller;

/**
 *
 * @author nqt26
 */
public class BookDAO extends DBContext{
        public List<Book> GetALLBook(){
        List<Book> list= new ArrayList<>();
        String sql = "SELECT b.ID,b.Name,b.Images,b.NXB,b.PublicationDate,b.Author,b.Seller,b.Size,b.TypeofCover,b.Description,b.UnitPrice,b.UnitInStock,\n" +
"b.Discount, a.Name AS Authorname, c.Name as covername, p.NAME AS publishername, s.Name AS sellername FROM dbo.BOOK b\n" +
"INNER JOIN dbo.AUTHOR a ON a.ID = b.Author\n" +
"INNER JOIN dbo.COVER c ON c.ID = b.TypeofCover\n" +
"INNER JOIN dbo.Publisher p ON p.ID = b.NXB\n" +
"INNER JOIN dbo.SELLER s ON s.ID = b.Seller\n" +
"";
        try{
            PreparedStatement  st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while (rs.next()){
                Book a = new Book();
                a.setID(rs.getInt("ID"));
                a.setName(rs.getString("Name"));
                a.setImage(rs.getString("Images"));
                a.setPid( new Publisher(rs.getInt("NXB"),rs.getString("publishername")));
                a.setDate(rs.getString("PublicationDate"));
                a.setAid(new Author(rs.getInt("Author"), rs.getString("Authorname")) );
                a.setSid(new Seller(rs.getInt("Seller"), rs.getString("sellername")));
                a.setSize(rs.getString("Size"));
                a.setCid(new Cover(rs.getInt("Typeofcover"),rs.getString("covername")));
                a.setDescription(rs.getString("Description"));
                a.setUnitprice(rs.getDouble("UnitPrice"));
                a.setUnitinstock(rs.getInt("UnitInStock"));
                list.add(a);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
        public List<Book> GetbySeller(int id){
             String sql = "SELECT b.ID,b.Name,b.Images,b.NXB,b.PublicationDate,b.Author,b.Seller,b.Size,b.TypeofCover,b.Description,b.UnitPrice,b.UnitInStock,\n" +
"b.Discount, a.Name AS Authorname, c.Name as covername, p.NAME AS publishername, s.Name AS sellername FROM dbo.BOOK b\n" +
"INNER JOIN dbo.AUTHOR a ON a.ID = b.Author\n" +
"INNER JOIN dbo.COVER c ON c.ID = b.TypeofCover\n" +
"INNER JOIN dbo.Publisher p ON p.ID = b.NXB\n" +
"INNER JOIN dbo.SELLER s ON s.ID = b.Seller\n" +
"where b.Seller = ?";
            List<Book> list=new ArrayList<>();
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                st.setInt(1, id);
                ResultSet rs=st.executeQuery();
             while (rs.next()){
                Book a = new Book();
                a.setID(rs.getInt("ID"));
                a.setName(rs.getString("Name"));
                a.setImage(rs.getString("Images"));
                a.setPid( new Publisher(rs.getInt("NXB"),rs.getString("publishername")));
                a.setDate(rs.getString("PublicationDate"));
                a.setAid(new Author(rs.getInt("Author"), rs.getString("Authorname")) );
                a.setSid(new Seller(rs.getInt("Seller"), rs.getString("sellername")));
                a.setSize(rs.getString("Size"));
                a.setCid(new Cover(rs.getInt("Typeofcover"),rs.getString("covername")));
                a.setDescription(rs.getString("Description"));
                a.setUnitprice(rs.getDouble("UnitPrice"));
                a.setUnitinstock(rs.getInt("UnitInStock"));
                list.add(a);
            }
            } catch(SQLException e){
                System.out.println(e);
            }
            return list;
        }
        
       public Book GetbyID(int id){
 String sql = "SELECT b.ID,b.Name,b.Images,b.NXB,b.PublicationDate,b.Author,b.Seller,b.Size,b.TypeofCover,b.Description,b.UnitPrice,b.UnitInStock,\n" +
"b.Discount, a.Name AS Authorname, c.Name as covername, p.NAME AS publishername, s.Name AS sellername FROM dbo.BOOK b\n" +
"INNER JOIN dbo.AUTHOR a ON a.ID = b.Author\n" +
"INNER JOIN dbo.COVER c ON c.ID = b.TypeofCover\n" +
"INNER JOIN dbo.Publisher p ON p.ID = b.NXB\n" +
"INNER JOIN dbo.SELLER s ON s.ID = b.Seller\n" +
"where b.ID = ?";
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                st.setInt(1, id);
                ResultSet rs=st.executeQuery();
             while (rs.next()){
                Book a = new Book();
                a.setID(rs.getInt("ID"));
                a.setName(rs.getString("Name"));
                a.setImage(rs.getString("Images"));
                a.setPid( new Publisher(rs.getInt("NXB"),rs.getString("publishername")));
                a.setDate(rs.getString("PublicationDate"));
                a.setAid(new Author(rs.getInt("Author"), rs.getString("Authorname")) );
                a.setSid(new Seller(rs.getInt("Seller"), rs.getString("sellername")));
                a.setSize(rs.getString("Size"));
                a.setCid(new Cover(rs.getInt("Typeofcover"),rs.getString("covername")));
                a.setDescription(rs.getString("Description"));
                a.setUnitprice(rs.getDouble("UnitPrice"));
                a.setUnitinstock(rs.getInt("UnitInStock"));
                return a;
            }
            } catch(SQLException e){
                System.out.println(e);
            }
            return null;
        }
       
       public List<Book> Getbyfilter(List<Author> al,List<Publisher> pl,List<Cover> cl,String name){
             String sql = "SELECT b.ID,b.Name,b.Images,b.NXB,b.PublicationDate,b.Author,b.Seller,b.Size,b.TypeofCover,b.Description,b.UnitPrice,b.UnitInStock,\n" +
"b.Discount, a.Name AS Authorname, c.Name as covername, p.NAME AS publishername, s.Name AS sellername FROM dbo.BOOK b\n" +
"INNER JOIN dbo.AUTHOR a ON a.ID = b.Author\n" +
"INNER JOIN dbo.COVER c ON c.ID = b.TypeofCover\n" +
"INNER JOIN dbo.Publisher p ON p.ID = b.NXB\n" +
"INNER JOIN dbo.SELLER s ON s.ID = b.Seller\n" +
"where 1=1";
            List<Book> list=new ArrayList<>();
            if(!al.isEmpty()){
                sql+= " and ( 0=1";
                for( Author a: al){
                sql+= " or a.id = "+ a.getID();
                }
                sql+=" )";
            }
           if(!pl.isEmpty()){
                sql+= " and ( 0=1";
                for( Publisher p: pl){
                sql+= " or p.id = "+ p.getID();
                }
                sql+=" )";
            }
            if(!cl.isEmpty()){
                sql+= " and ( 0=1";
                for( Cover c: cl){
                sql+= " or c.id = "+ c.getId();
                }
                sql+=" )";
            }
            if(name!=null){
                sql += " and b.Name like N'%"+ name+"%'";
            }
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                ResultSet rs=st.executeQuery();
             while (rs.next()){
                Book a = new Book();
                a.setID(rs.getInt("ID"));
                a.setName(rs.getString("Name"));
                a.setImage(rs.getString("Images"));
                a.setPid( new Publisher(rs.getInt("NXB"),rs.getString("publishername")));
                a.setDate(rs.getString("PublicationDate"));
                a.setAid(new Author(rs.getInt("Author"), rs.getString("Authorname")) );
                a.setSid(new Seller(rs.getInt("Seller"), rs.getString("sellername")));
                a.setSize(rs.getString("Size"));
                a.setCid(new Cover(rs.getInt("Typeofcover"),rs.getString("covername")));
                a.setDescription(rs.getString("Description"));
                a.setUnitprice(rs.getDouble("UnitPrice"));
                a.setUnitinstock(rs.getInt("UnitInStock"));
                list.add(a);
            }
            } catch(SQLException e){
                System.out.println(e);
            }
            return list;
        }
       
       
       public int insertbook(String name,String image,int pub,String pdate,
               int au,int sel,String size,int cover,String des,double price,int quan){
           String sql="INSERT INTO dbo.BOOK" +
"    (Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,"
                   + "UnitPrice,UnitInStock)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
           try{
             PreparedStatement st=connection.prepareStatement(sql);
             st.setString(1, name);
             st.setString(2, image);
             st.setInt(3, pub);
             st.setString(4, pdate);
             st.setInt(5, au);
             st.setInt(6, sel);
             st.setString(7, size);
             st.setInt(8, cover);
             st.setString(9, des); 
             st.setDouble(10, price);
             st.setInt(11, quan);
             return st.executeUpdate();
           } catch(SQLException e){
               System.out.println(e);
           }
           return 0;
       }
       public int deletebook(int id) {
           String sql="DELETE FROM dbo.BOOK WHERE ID=?";
           try{
               PreparedStatement st=connection.prepareStatement(sql);
               st.setInt(1, id);
               st.executeUpdate();
           } catch(SQLException e){
               System.out.println(e);
           }
           return 0;
               
       }
       public int updatebook(int id,String name,String image,int pub,String pdate,
               int au,int sel,String size,int cover,String des,double price,int quan) {
           String sql="UPDATE dbo.BOOK \n" +
"SET Name=?,\n" +
"    Images=?,\n" +
"    NXB=?,\n" +
"    PublicationDate=?,\n" +
"    Author=?,\n" +
"    Seller=?,\n" +
"    Size=?,\n" +
"    TypeofCover=?,\n" +
"    Description=?,\n" +
"    UnitPrice=?,\n" +
"    UnitInStock=?\n" +
" where id=?";
           try{
               PreparedStatement st=connection.prepareStatement(sql);
             st.setString(1, name);
             st.setString(2, image);
             st.setInt(3, pub);
             st.setString(4, pdate);
             st.setInt(5, au);
             st.setInt(6, sel);
             st.setString(7, size);
             st.setInt(8, cover);
             st.setString(9, des); 
             st.setDouble(10, price);
             st.setInt(11, quan);
             st.setInt(12, id);
               return st.executeUpdate();
           } catch(SQLException e){
               System.out.println(e);
           }
           return 0;
               
       }
        public static void main(String[] args) {
        BookDAO bd=new BookDAO();
            System.out.println(bd.GetALLBook().get(0).getDate());
    }
        
}
