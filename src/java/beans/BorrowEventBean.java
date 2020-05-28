package beans;

import daos.BookDao;
import daos.BorrowDao;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import models.BorrowBook;
import models.Book;


@Named(value = "BorrowEventBean")
@ViewScoped
public class BorrowEventBean implements Serializable{
    private ArrayList<BorrowBook> borrow;
    private final BorrowDao borrowDao = new BorrowDao();
    private final BookDao bookDao = new BookDao();
    private int borrow_id;
    private Timestamp dateofborrow;   
    
    @Inject
    private SessionBean sessionBean;
    
    public BorrowEventBean() {        
    }
    
    @PostConstruct
    public void init(){                
        try {
             borrow_id = sessionBean.getSelectedItemId();
            
            
            if( borrow_id > 0){
                BorrowBook event = borrowDao.getEvent(borrow_id);                
                dateofborrow = event.getDateofborrow();
                
            }
        } catch (Exception ex) {
            Logger.getLogger(AddEditEventBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<BorrowBook> getBorrowBook() {
        return borrow;
    }        

  public int getBorrow_Id() {
        return borrow_id;
    }

    public  void setBorrow_Id(int borrow_id) {
        this.borrow_id = borrow_id;
    }


   public Timestamp getDateofborrow() {
        return dateofborrow;
    }

    public void setDateofborrow(Timestamp dateofborrowEn) {
        this.dateofborrow = dateofborrow;
    }
        
    public void saveEvent() {
        try {
         BorrowBook book = new BorrowBook();
            
            BorrowBook borrowbook = borrow.get(borrow_id - 1);
            book.setBorrow_Id(borrow_id);
            book.setDateofborrow(new Timestamp(dateofborrow.getTime()));
            
            if (sessionBean.getSelectedItemId() > 0) {
                borrowDao.updateBorrowBook( book);
            } 
            
            
        } catch (Exception ex) {
            Logger.getLogger(AddEditEventBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        sessionBean.navigate("borrow_book");
    }
    
    
}
