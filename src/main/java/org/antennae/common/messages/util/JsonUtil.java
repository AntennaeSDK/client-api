package org.antennae.common.messages.util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by snambi on 6/24/16.
 */
public class JsonUtil {

    public static String identifyClassType( String json  ){

        String classtype =null;
        try {

            JSONObject jsonObject = new JSONObject(json);
            classtype = (String) jsonObject.get("classType");

        }catch( JSONException e){

        }

        return classtype;
    }
}
