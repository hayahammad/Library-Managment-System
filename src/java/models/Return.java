package models;

import java.io.Serializable;
import java.sql.Timestamp;



 
public class Return implements Serializable{

  
    private int return_id;
    private int user_id;
    private int book_id;
    private Timestamp dateofreturn;
    
   
   
    public  Return(){}
    
    public Return( int return_id ,int user_id, int book_id,Timestamp dateofreturn         
            
            
            
            ) {
        this.return_id = return_id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.dateofreturn = dateofreturn;
        
    }        

    public int getBorrow_Id() {
        return return_id;
    }

    public  void setBorrow_Id(int return_id) {
        this.return_id = return_id;
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

    public Timestamp getDateofreturn() {
        return dateofreturn;
    }

    public void setDateofborrow(Timestamp dateofborrowEn) {
        this.dateofreturn = dateofreturn;
    }

    
}
