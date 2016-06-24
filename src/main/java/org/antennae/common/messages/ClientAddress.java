/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.antennae.common.messages;

import com.google.gson.Gson;

import java.util.UUID;


/**
 * Created by snambi on 6/21/16.
 */
public class ClientAddress {

    private String appName;
    private String appVersion;
    private String deviceId;
    private String user;

    // TODO: this should be part of the message
    private String requestId; // for every request generate an Unique ID

    public ClientAddress(){
        requestId = UUID.randomUUID().toString();
    }
    public ClientAddress(String uniqueRequestId ){
        this.requestId = uniqueRequestId;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String toJson(){
        Gson gson = new Gson();
        String result = gson.toJson(this);
        return result;
    }

    public static ClientAddress fromJson(String json ){
        Gson gson = new Gson();
        ClientAddress result = gson.fromJson( json, ClientAddress.class);
        return result;
    }
}
