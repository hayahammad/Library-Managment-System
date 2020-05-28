package models;

import java.io.Serializable;

/**
 *
 * @author Firas.Alhawari
 * 
 */
public class User implements Serializable{

    
   
    private int userid;
    private String firstnameEn;
    private String firstnameAr;
    private String lastnameEn;
    private String lastnameAr;
    private String username;
    private String passWord;
   
    public  User(){}
   
    
    public User(int userid, String firstnameEn, String firstnameAr,String lastnameEn,String lastnameAr,String username ,String passWord ) {
        this.userid = userid;
        this.firstnameEn = firstnameEn;
        this.firstnameAr = firstnameAr;
        this.lastnameEn = lastnameEn;
        this.lastnameAr = lastnameAr;
        this. username =username;
        this. passWord =passWord;
        
    }        

    public int getUserId() {
        return userid;
    }

    public  void setUserId(int userid) {
        this.userid = userid;
    }

    public String getFirstnameEn() {
        return firstnameEn;
    }

    public void setFirstnameEn(String firstnameEn) {
        this.firstnameEn = firstnameEn;
    }
     
    public String getFirstnameAr() {
        return firstnameAr;
    }

    public void setFirstnameAr(String firstnameAr) {
        this.firstnameAr = firstnameAr;
    }
    
    public String getLastnameAr() {
        return lastnameAr;
    }

    public void setLastnameAr(String lastnameAr) {
        this.lastnameAr = lastnameAr;
    }
    
   public String getLastnameEn() {
        return lastnameEn;
    }

    public void setLastnameEn(String lastnameEn) {
        this.lastnameEn = lastnameEn;
    } 
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
}
