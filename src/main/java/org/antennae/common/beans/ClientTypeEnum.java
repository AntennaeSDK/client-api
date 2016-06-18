package org.antennae.common.beans;

/**
 * Created by snambi on 6/17/16.
 */
public enum ClientTypeEnum {
    WebSocket("WebSocket"),
    iOS("iOS"),
    Android("Android");

    private String type;
    private ClientTypeEnum( String type){
        this.type = type;
    }
}