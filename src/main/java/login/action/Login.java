/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.action;

import login.model.LoginModel;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author tung.pham
 */
public class Login extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private LoginModel loginModel;

    public String execute() throws Exception {

        //call Service class to store loginModel's state in database
        return SUCCESS;

    }

    public void validate() {

        if (loginModel.getUserId().length() == 0) {

            addFieldError("loginModel.userId", "User ID is required.");

        }

        if (loginModel.getPass().length() == 0) {

            addFieldError("loginModel.pass", "Password is required.");

        }

        if (loginModel.getPass().length() < 3) {

            addFieldError("loginModel.pass", "Password is required and must be over 3");

        }

    }

    public LoginModel getLoginModel() {

        return loginModel;

    }

    public void setLoginModel(LoginModel login) {

        loginModel = login;

    }
}
