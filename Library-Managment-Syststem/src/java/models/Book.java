package models;

import java.io.Serializable;

/**
 *
 * @author Firas.Alhawari
 * 
 */
public class Book implements Serializable{

    
   
    private int bookId;
    private String booknameEn;
    private String booknameAr;
    private String authornameEn;
    private String authornameAr;
    private String bookeditionEn;
    private String bookeditionAr;
   private String statusEn;
   private String statusAr;
   
    public  Book(){}
    
    public Book(int bookId, String booknameEn, String booknameAr,String authornameEn,String authornameAr,String bookeditionEn,String bookeditionAr,String statusEn,String statusAr ) {
        this.bookId = bookId;
        this.booknameEn = booknameEn;
        this.booknameAr = booknameAr;
        this.authornameEn = authornameEn;
        this.authornameAr = authornameAr;
        this. bookeditionEn =bookeditionEn;
        this. bookeditionAr =bookeditionAr;
        this.statusEn = statusEn;
        this.statusAr = statusAr;
    }        

    public int getBookId() {
        return bookId;
    }

    public  void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBooknameEn() {
        return booknameEn;
    }

    public void setBooknameEn(String booknameEn) {
        this.booknameEn = booknameEn;
    }

    public String getBooknameAr() {
        return booknameAr;
    }

    public  void  setBooknameAr(String booknameAr) {
        this.booknameAr = booknameAr;
    }
    public String getAuthornameEn() {
        return authornameEn;
    }

    public void setAuthornameEn(String authornameEn) {
        this.authornameEn = authornameEn;
    }
    
        public String getAuthornameAr() {
        return authornameAr;
    }

    public void setAuthornameAr(String authornameAr) {
        this.authornameAr = authornameAr;
    } 
 
    public String getBookeditionEn() {
        return bookeditionEn;
    }

    public void setBookeditionEn(String bookeditionEn) {
        this.bookeditionEn = bookeditionEn;
    } 
    
     public String getBookeditionAr() {
        return bookeditionAr;
    }

    public void setBookeditionAr(String bookeditionAr) {
        this.bookeditionAr = bookeditionAr;
    }
    
    
    
   public String getStatusEn() {
        return statusEn;
    }

    public void setStatusEn(String statusEn) {
        this.statusEn = statusEn;
    } 
    
       public String getStatusAr() {
        return statusEn;
    }

    public void setStatusAr(String statusAr) {
        this.statusAr = statusAr;
    }
    
}
