package models;

import java.io.Serializable;

/**
 *
 * @author 
 * 
 */
public class UserRole implements Serializable{

    
   
    private int user_role_id;
    private int user_id;
    
   
   
   
    public  UserRole(){}
    
    public UserRole(int user_id, int user_role_id ) {
        this.user_role_id = user_role_id;
        this.user_id = user_id;
        
    }        

    public int getUser_Role_Id() {
        return user_role_id;
    }

    public  void setUser_Role_Id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public int getUser_Id() {
        return user_id;
    }

    public void setUser_Id(int user_id) {
        this.user_id = user_id;
    }
    
}
