
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Return;
/**
 *
 * @author Amro
 */
public class ReturnDao extends ConnectionDao {     
    public ArrayList<Return> buildSearch() throws Exception {
        ArrayList<Return> list = new ArrayList<>();
        Connection conn = getConnection();
        
        try {            
            String sql = "SELECT * FROM RETURN ORDER BY RETURN_ID";                        
            PreparedStatement ps = conn.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();           

            while (rs.next()) {
                list.add(populateSearch(rs));
            }
            
            rs.close();
            ps.close();

            return list;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
    
    
    private Return populateSearch(ResultSet rs) throws SQLException {
        Return returns = new Return();
        
        returns.setReturnId(rs.getInt("returnId"));
        returns.setUserId(rs.getInt("userId"));
        returns.setBookId(rs.getInt("bookId"));
        returns.setDateofreturn(rs.getTimestamp("dateofreturn"));

        return returns ;
    }   
}

