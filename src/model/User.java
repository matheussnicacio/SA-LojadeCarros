/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Classe: User
 *
 * @author matheus_n_pereira
 */
public class User {

    private int id_user;
    private String nm_user;
    private String ds_login;
    private String ds_password;
    private String ds_email;

   
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNm_user() {
        return nm_user;
    }

    public void setNm_user(String nm_user) {
       if(nm_user.length() >= 3 ){
       this.nm_user = nm_user;
           
           }else{
    
        this.nm_user = "";
    }
}

    public String getDs_login() {
        return ds_login;
    }

    public void setDs_login(String ds_login) {
        this.ds_login = ds_login;
    }

    public String getDs_password() {
        return ds_password;
    }

    public void setDs_password(String ds_password) {
        this.ds_password = ds_password;
    }

    public String getDs_email() {
        return ds_email;
    }

    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }
    
    
    
    
    
}
