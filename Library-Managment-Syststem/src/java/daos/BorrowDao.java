package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import models.BorrowBook;

/**
 *
 * @author Dr. Firas Al-Hawari
 * 
 */
public class BorrowDao extends ConnectionDao {     
    public ArrayList<BorrowBook> buildBorrowBook() throws Exception {
        ArrayList<BorrowBook> list = new ArrayList<>();
        Connection conn = getConnection();
        
        try {            
            String sql = "SELECT BOOK_NAME_EN,AUTHOR_EN,BOOK_EDITION_EN,STATUS_EN FROM BOOK,BORROW WHERE BOOK.BOOK_ID=BORROW.BORROW_ID ";                        
            PreparedStatement ps = conn.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();           

            while (rs.next()) {
                list.add(populateBorrowBook(rs));
            }
            
            rs.close();
            ps.close();

            return list;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
    
    public HashMap<Integer, BorrowBook> buildEventTypesMap() throws Exception {
        HashMap<Integer, BorrowBook> map = new HashMap<>();
        Connection conn = getConnection();
        
        try {            
            String sql = "SELECT * FROM BORROW ORDER BY BORROW_ID";                        
            PreparedStatement ps = conn.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();           

            while (rs.next()) {
                BorrowBook borrowbook = populateBorrowBook(rs);
                map.put(borrowbook.getBorrow_Id(), borrowbook);
            }
            
            rs.close();
            ps.close();

            return map;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    private BorrowBook populateBorrowBook(ResultSet rs) throws SQLException {
        BorrowBook  borrowbook = new BorrowBook();
        
        borrowbook.setBorrow_Id(rs.getInt("BORROW_ID"));
        borrowbook.setUser_Id(rs.getInt("USER_ID"));
        borrowbook.setBook_Id(rs.getInt("BOOK_ID"));
        borrowbook.setDateofborrow(rs.getTimestamp("DATEOFBORROW"));                    
        
        return borrowbook;
    } 
    
    public void updateBorrowBook(BorrowBook event) throws Exception {
        try {
            Connection conn = getConnection();

            String sql = "UPDATE BorrowBook SET DATEOFBORROW=?," ;

            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setTimestamp(4, event.getDateofborrow());

            ps.executeUpdate();
            
            ps.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
    
        public BorrowBook getEvent(int borrow_id) throws Exception {
        try {   
            BorrowBook event = null;
            Connection conn = getConnection();
            
            String sql = "SELECT FROM BOOK, BORROW"
                    + " WHERE BOOK.BOOK_ID=BORROW.BOOK_ID AND"
                    + " BORROW_ID=?"; 
            
            PreparedStatement ps = conn.prepareStatement(sql);            
            ps.setInt(1, borrow_id);
            
            ResultSet rs = ps.executeQuery();           

            while (rs.next()) {
             event = populateBorrowBook(rs);
                
            }

            rs.close();
            ps.close();
            
            return event;            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
      public void deleteEvent(int borrow_id) throws Exception {
        Connection conn = getConnection();
        
        try {
            String sql = "DELETE FROM BORROW WHERE BORROW_ID=?";                               
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, borrow_id);
            
            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }  
    
}
