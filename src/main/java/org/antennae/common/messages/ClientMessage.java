package org.antennae.common.messages;

import com.google.gson.Gson;

/**
 * Created by snambi on 6/22/16.
 */
public class ClientMessage {

    // to where the message is sent.
    // it can be to an user or an app
    private ClientAddress to;

    // actual message
    private String payLoad;

    public String toJson(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public static ClientMessage fromJson(String json ){
        Gson gson = new Gson();
        ClientMessage result = gson.fromJson( json, ClientMessage.class);
        return result;
    }
}
