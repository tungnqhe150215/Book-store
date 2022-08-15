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
import model.Publisher;
import model.status;

/**
 *
 * @author nqt26
 */
public class StatusDAO extends DBContext{
        public List<status> GetALLStatus(){
        List<status> list= new ArrayList<>();
        String sql = "SELECT * FROM Status";
        try{
            PreparedStatement  st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while (rs.next()){
                status Au = new status();
                Au.setID(rs.getInt("ID"));
                Au.setName(rs.getString("Name"));
                list.add(Au);
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
        
        public status getbyid(int id){
            String sql="Select * from dbo.status where ID=?";
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                st.setInt(1, id);
                ResultSet rs=st.executeQuery();
                if(rs.next()){
                    status s= new status(rs.getInt(1), rs.getString(2));
                    return s;
                }
            }catch(SQLException e){
                System.out.println(e);
            }
            return null;
        }
}
