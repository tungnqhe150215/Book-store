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
import model.Author;

/**
 *
 * @author nqt26
 */
public class AuthorDAO extends DBContext{
    public List<Author> GetALLAuthor(){
        List<Author> list= new ArrayList<>();
        String sql = "SELECT * FROM AUTHOR";
        try{
            PreparedStatement  st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while (rs.next()){
                Author Au = new Author();
                Au.setID(rs.getInt("ID"));
                Au.setName(rs.getString("Name"));
                list.add(Au);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
