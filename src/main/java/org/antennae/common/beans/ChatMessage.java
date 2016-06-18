package org.antennae.common.beans;

import java.util.Date;

/**
 * Created by snambi on 6/17/16.
 */
public class ChatMessage {

    // common fields
    private int messageId;
    private int channelId;
    private String token;
    private String senderId; // userId (String) of the sender
    private String senderName;

    // fields related to state ( may not be present on all messages )
    private boolean firstMessage;
    private ClientTypeEnum clientType;
    private Date createdTime;

    // fields related to data
    private String data;
    private int parentMessageId;
    private boolean isQuestion;
    private int answerOf;



    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public int getChannelId() {
        return channelId;
    }
    public void getChannelId(int incident) {
        this.channelId = incident;
    }
    public String getSenderId() {
        return senderId;
    }
    public void setSenderId(String userId) {
        this.senderId = userId;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getSenderName() {
        return senderName;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public boolean isFirstMessage() {
        return firstMessage;
    }
    public void setFirstMessage(boolean isFirstMessage) {
        this.firstMessage = isFirstMessage;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public ClientTypeEnum getClientType() {
        return clientType;
    }
    public void setClientType(ClientTypeEnum clientType) {
        this.clientType = clientType;
    }
    public Date getCreatedTime() {
        return createdTime;
    }
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getParentMessageId() {
        return parentMessageId;
    }
    public void setParentMessageId(int parentMessageId) {
        this.parentMessageId = parentMessageId;
    }
    public boolean isQuestion() {
        return isQuestion;
    }
    public void setQuestion(boolean isQuestion) {
        this.isQuestion = isQuestion;
    }
    public int getAnswerOf() {
        return answerOf;
    }
    public void setAnswerOf(int answerOf) {
        this.answerOf = answerOf;
    }
}
