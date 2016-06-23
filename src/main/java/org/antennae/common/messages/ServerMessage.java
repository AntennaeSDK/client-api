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

/**
 * Created by snambi on 6/21/16.
 */
public class ServerMessage {

    // from where the message originates.
    // it can be from a user or from a server (bot)
    private ClientAddress from;

    // topic is used to direct the message on the server-side
    private String topic;

    // actual message
    private String payLoad;

    // message type
    private MessageTypeEnum messageType = MessageTypeEnum.PUB_SUB;

    public ClientAddress getFrom() {
        return from;
    }
    public void setFrom(ClientAddress from) {
        this.from = from;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getPayLoad() {
        return payLoad;
    }
    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }
    public MessageTypeEnum getMessageType() {
        return messageType;
    }
    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public String toJson(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public static ServerMessage fromJson(String json ){
        Gson gson = new Gson();
        ServerMessage result = gson.fromJson( json, ServerMessage.class);
        return result;
    }
}
