/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.model;

/**
 *
 * @author tung.pham
 */
public class LoginModel {
    private String userId;
    private String pass;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String toString() {
        return "LoginModel{" + "userId=" + userId + ", pass=" + pass + '}';
    }
    
    
}
