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
import model.Cover;

/**
 *
 * @author nqt26
 */
public class CoverDAO extends DBContext{
      public List<Cover> GetALLCover(){
        List<Cover> list= new ArrayList<>();
        String sql = "SELECT * FROM Cover";
        try{
            PreparedStatement  st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while (rs.next()){
                Cover a = new Cover();
                a.setId(rs.getInt("ID"));
                a.setName(rs.getString("Name"));
                list.add(a);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
