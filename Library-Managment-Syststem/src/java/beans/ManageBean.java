import daos.SearchDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import models.Search;
import beans.SessionBean;


@Named(value = "ManageBookBean")
@ViewScoped
public class ManageBookBean implements Serializable{
    private ArrayList<Search> search;
    private final SearchDao searchDao = new SearchDao();
    private int bookId;
    private String booknameEn;
    private String booknameAr;
    private String authornameEn;
    private String authornameAr;
    private String bookeditionEn;
    private String bookeditionAr;
    private String statusEn;
    private String statusAr;  
    
   @Inject
   private SessionBean sessionBean;
    
    public ManageBookBean() {
    }
      
    
    public int getBookkId(){
        return bookId;
    }
    public void setBookId (int bookId){
    this.bookId = bookId;
    }
    
    public String getBooknameEn(){
        return booknameEn;
    }
    public void setBooknameEn (String booknameEn){
        this.booknameEn =booknameEn;
    }
    
    public String getBooknameAr(){
        return booknameAr;
    }
    public void setBooknameAr (String booknameAr){
        this.booknameAr =booknameAr;
    }
    
    public String getAuthornameEn(){
        return authornameEn;
    }
    public void setAuthornameEn (String authornameEn){
        this.authornameEn =authornameEn;
    }
    
    public String getAuthornameAr(){
        return authornameAr;
    }
    public void setAuthornameAr (String authornameAr){
        this.authornameAr =authornameAr;
    }
    
    public String getBookeditionEn(){
        return bookeditionEn;
    }
    public void setBookeditionEn (String bookeditionEn){
        this.bookeditionEn =bookeditionEn;
    }
    
    public String getBookeditionAr(){
        return bookeditionAr;
    }
    public void setBookeditionAr (String bookeditionAr){
        this.bookeditionAr =bookeditionAr;
    }
    
    public String getStatusEn(){
        return statusEn;
    }
    public void setStatusEn (String statusEn){
        this.statusEn =statusEn;
    }
    
    public String getStatusAr(){
        return statusAr;
    }
    public void setStatusAr (String statusAr){
        this.statusAr =statusAr;
    }
    
    }

    
