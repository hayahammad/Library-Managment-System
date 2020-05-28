package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.User;

/**
 *
 * @author Dr. Firas Al-Hawari
 * 
 */
public class UserDao extends ConnectionDao {     
    public ArrayList<User> buildUser() throws Exception {
        ArrayList<User> list = new ArrayList<>();
        Connection conn = getConnection();
        
        try {            
            String sql = "SELECT * FROM USERS ORDER BY USER_ID";                        
            PreparedStatement ps = conn.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();           

            while (rs.next()) {
                list.add(populateuser(rs));
            }
            
            rs.close();
            ps.close();

            return list;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
    
    
    private User populateuser(ResultSet rs) throws SQLException {
        User user = new User();
        
        user.setUserId(rs.getInt("USER_ID"));
        user.setUsername(rs.getString("USERNAME"));
        user.setPassWord(rs.getString("PASSWORD"));
        user.setFirstnameEn(rs.getString("FIRST_NAME_EN"));
        user.setFirstnameAr(rs.getString("FIRST_NAME_AR"));
        user.setLastnameEn(rs.getString("LAST_NAME_EN"));
        user.setLastnameAr(rs.getString("LAST_NAME_AR"));
        

        return user;
    }   
}
