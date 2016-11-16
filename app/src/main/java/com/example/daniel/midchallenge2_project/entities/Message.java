
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Message {

    @SerializedName("headline")
    @Expose
    private Object headline;
    @SerializedName("body")
    @Expose
    private Object body;
    @SerializedName("contextual_message")
    @Expose
    private Object contextualMessage;

    /**
     * 
     * @return
     *     The headline
     */
    public Object getHeadline() {
        return headline;
    }

    /**
     * 
     * @param headline
     *     The headline
     */
    public void setHeadline(Object headline) {
        this.headline = headline;
    }

    /**
     * 
     * @return
     *     The body
     */
    public Object getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(Object body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The contextualMessage
     */
    public Object getContextualMessage() {
        return contextualMessage;
    }

    /**
     * 
     * @param contextualMessage
     *     The contextual_message
     */
    public void setContextualMessage(Object contextualMessage) {
        this.contextualMessage = contextualMessage;
    }

}
