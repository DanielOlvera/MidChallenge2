
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UrgencyCommitment {

    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("message_type")
    @Expose
    private Object messageType;
    @SerializedName("show_percent_listings_left_message")
    @Expose
    private Boolean showPercentListingsLeftMessage;
    @SerializedName("listings_left_as_percent")
    @Expose
    private Object listingsLeftAsPercent;

    /**
     * 
     * @return
     *     The message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The messageType
     */
    public Object getMessageType() {
        return messageType;
    }

    /**
     * 
     * @param messageType
     *     The message_type
     */
    public void setMessageType(Object messageType) {
        this.messageType = messageType;
    }

    /**
     * 
     * @return
     *     The showPercentListingsLeftMessage
     */
    public Boolean getShowPercentListingsLeftMessage() {
        return showPercentListingsLeftMessage;
    }

    /**
     * 
     * @param showPercentListingsLeftMessage
     *     The show_percent_listings_left_message
     */
    public void setShowPercentListingsLeftMessage(Boolean showPercentListingsLeftMessage) {
        this.showPercentListingsLeftMessage = showPercentListingsLeftMessage;
    }

    /**
     * 
     * @return
     *     The listingsLeftAsPercent
     */
    public Object getListingsLeftAsPercent() {
        return listingsLeftAsPercent;
    }

    /**
     * 
     * @param listingsLeftAsPercent
     *     The listings_left_as_percent
     */
    public void setListingsLeftAsPercent(Object listingsLeftAsPercent) {
        this.listingsLeftAsPercent = listingsLeftAsPercent;
    }

}
