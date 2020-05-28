package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import models.Book;  //LOD //event
import models.BorrowBook; //SORT

/**
 *
 * @author Dr. Firas Al-Hawari
 * 
 */
public class BorrowBTNDao extends ConnectionDao {     
    public ArrayList<Book> buildEvents(HashMap<Integer, BorrowBook> borrowbook) 
            throws Exception {
        ArrayList<Book> list = new ArrayList<>();        
        
        try {   
            Connection conn = getConnection();
            
            String sql = "SELECT * FROM Book";                        
            PreparedStatement ps = conn.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();           

            while (rs.next()) {
                list.add(populateBookWithBorrowBook(rs, borrowbook));
            }
            
            rs.close();
            ps.close();
            
            return list;            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    private Book populateBookWithBorrowBook(ResultSet rs, HashMap<Integer, BorrowBook> borrowbook) 
            throws SQLException {
        Book event = new Book();
        
        event.setBookId(rs.getInt("BOOK_ID"));
        event.setBooknameEn(rs.getString("BOOK_NAME_EN"));
        event.setBooknameAr(rs.getString("BOOK_NAME_AR"));
        event.setAuthornameEn(rs.getString("AUTHOR_EN"));
        event.setAuthornameAr(rs.getString("AUTHOR_AR"));
        event.setStatusEn(rs.getString("STATUS_EN"));
        event.setStatusAr(rs.getString("STATUS_AR"));
        //event.setDate(rs.getTimestamp("EVENT_DATE"));
        BorrowBook eventType = new BorrowBook();
        eventType.setBorrow_Id(rs.getInt("BORROW_ID"));        
                    
        
        return event;
    }
    
    private Book populateEvent(ResultSet rs) throws SQLException {
        Book event = new Book();
        
        event.setBookId(rs.getInt("BOOK_ID"));
        event.setBooknameEn(rs.getString("BOOK_NAME_EN"));
        event.setBooknameAr(rs.getString("BOOK_NAME_AR"));
        event.setAuthornameEn(rs.getString("AUTHOR_EN"));
        event.setAuthornameAr(rs.getString("AUTHOR_AR"));
        event.setStatusEn(rs.getString("STATUS_EN"));
        event.setStatusAr(rs.getString("STATUS_AR"));
        
        BorrowBook eventType = new BorrowBook();
        eventType.setBorrow_Id(rs.getInt("BORROW_ID"));        
                                    
        
        return event;
    }
    

    
    public void updateBorrowBook(BorrowBook event) throws Exception {
        try {
            Connection conn = getConnection();

            String sql = "UPDATE BorrowBook SET DATEOFBORROW=?," ;

            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setTimestamp(1, event.getDateofborrow());

            ps.executeUpdate();
            
            ps.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
    
  
    
  
            
}
