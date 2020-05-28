package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.BorrowBook;
import models.Book;
import daos.BorrowDao;
import daos.BookDao;



/**
 *
 * @haya&saja*)
 * 
 */
@Named(value = "BorrowBean")
@SessionScoped
public class BorrowBean implements Serializable {
    private BorrowBook selectedEvent;  
    private final BorrowDao borrowDao = new BorrowDao();
    private final BookDao bookDao = new BookDao();
    private ArrayList<BorrowBook> events; 
    
    @Inject 
    private SessionBean sessionBean;

     public void init(){
        try {            
            events = borrowDao.buildBorrowBook();            
        } catch (Exception ex) {
            Logger.getLogger(BorrowBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public BorrowBean() {    
    }      
        public ArrayList<BorrowBook> getEvents() {
        return events;
        }
      public BorrowBook getSelectedEvent() {
        return selectedEvent;
    }
       public void setSelectedEvent(BorrowBook selectedEvent) {
        this.selectedEvent = selectedEvent;
    }
       

}  


   
     




