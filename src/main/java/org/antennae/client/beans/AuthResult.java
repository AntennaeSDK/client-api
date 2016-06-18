package org.antennae.client.beans;

import com.google.gson.Gson;

import java.util.Date;

/**
 * Created by snambi on 6/17/16.
 */
public class AuthResult {

    private String userId;
    private boolean isSuccess;
    private String message;
    private String token;
    private Date expiryDate;


    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public boolean isSuccess() {
        return isSuccess;
    }
    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    // utility methods
    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson( this);
    }
    public static AuthResult fromJson( String json ){
        Gson gson = new Gson();
        return gson.fromJson(json, AuthResult.class);
    }

}
