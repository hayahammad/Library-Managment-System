package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Book;

/**
 *
 * @author Dr. Firas Al-Hawari
 * 
 */
public class BookDao extends ConnectionDao {     
    public ArrayList<Book> buildSearch() throws Exception {
        ArrayList<Book> list = new ArrayList<>();
        Connection conn = getConnection();
        
        try {            
            String sql = "SELECT * FROM BOOK ORDER BY book_Id";                        
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
    
    
    private Book populateSearch(ResultSet rs) throws SQLException {
        Book search = new Book();
        
        search.setBookId(rs.getInt("BOOK_ID"));
        search.setBooknameEn(rs.getString("BOOK_NAME_EN"));
        search.setBooknameAr(rs.getString("BOOK_NAME_AR"));
        search.setAuthornameEn(rs.getString("AUTHOR_EN"));
        search.setAuthornameAr(rs.getString("AUTHOR_AR"));
        search.setBookeditionEn(rs.getString("BOOK_EDITION_EN"));
        search.setBookeditionAr(rs.getString("BOOK_EDITION_AR"));
        search.setStatusEn(rs.getString("STATUS_EN"));
        search.setStatusAr(rs.getString("STATUS_AR"));

        return search;
    }   
}
