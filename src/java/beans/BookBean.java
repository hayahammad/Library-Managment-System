package beans;


import daos.BookDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import models.Book;

/**
 *
 * @author Firas.Alhawari
 * 
 */

@Named(value = "BookBean")
@ViewScoped
public class BookBean implements Serializable{
    private final BookDao BookDao = new BookDao();
    private ArrayList<Book> search; 
    
    @Inject 
    private SessionBean sessionBean;
    
    public BookBean() {        
    }       
    
    @PostConstruct
    public void init(){
        try {            
           // search = SearchDao.buildSearch();            
        } catch (Exception ex) {
            Logger.getLogger(BookBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Book> getSearch() {
        return search;
    }

    public void setSearch(ArrayList<Book> search) {
        this.search = search;
    }   
    
    public void searchSearch(){        
    }
    
}
