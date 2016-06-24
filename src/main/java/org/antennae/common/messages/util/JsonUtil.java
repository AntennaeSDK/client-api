package org.antennae.common.messages.util;

import org.json.JSONObject;

/**
 * Created by snambi on 6/24/16.
 */
public class JsonUtil {

    public static String identifyClassType( String json  ){

        JSONObject jsonObject = new JSONObject(json);
        String classtype = (String) jsonObject.get("classType");

        return classtype;
    }
}
