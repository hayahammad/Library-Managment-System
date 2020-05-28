package models;

import java.io.Serializable;
import java.sql.Timestamp;



 
public class BorrowBook implements Serializable{

  
    private int borrow_id;
    private int user_id;
    private int book_id;
    private Timestamp dateofborrow;
    
   
   
    public  BorrowBook(){}
    
    public BorrowBook( int borrow_id ,int user_id, int book_id,Timestamp dateofborrow         
            
            
            
            ) {
        this.borrow_id = borrow_id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.dateofborrow = dateofborrow;
        
    }        

    public int getBorrow_Id() {
        return borrow_id;
    }

    public  void setBorrow_Id(int borrow_id) {
        this.borrow_id = borrow_id;
    }

    public int getUser_Id() {
        return user_id;
    }

    public void setUser_Id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_Id() {
        return book_id;
    }

    public  void setBook_Id(int book_id) {
        this.book_id = book_id;
    }

    public Timestamp getDateofborrow() {
        return dateofborrow;
    }

    public void setDateofborrow(Timestamp dateofborrowEn) {
        this.dateofborrow = dateofborrow;
    }

    
}
