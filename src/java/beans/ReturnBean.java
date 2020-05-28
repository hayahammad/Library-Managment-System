
package beans;

import daos.ReturnDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import models.Return;

/**
 *
 * @author Amro
 */

@Named(value = "ReturnBean")
@ViewScoped
public class ReturnBean implements Serializable{
    private final ReturnDao ReturnDao = new ReturnDao();
    private ArrayList<Return> returns; 
    
    @Inject 
    private SessionBean sessionBean;
    
    public ReturnBean() {        
    }       
    
    @PostConstruct
    public void init(){
        try {                       
        } catch (Exception ex) {
            Logger.getLogger(ReturnBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Return> getReturn() {
        return returns;
    }

    public void setReturn(ArrayList<Return> returns) {
        this.returns = returns;
    }   
    
    public void returnReturn(){        
    }
    
}
