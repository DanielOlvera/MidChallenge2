
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Ratio {

    @SerializedName("Entire home/apt")
    @Expose
    private Double entireHomeApt;
    @SerializedName("Private room")
    @Expose
    private Double privateRoom;
    @SerializedName("Shared room")
    @Expose
    private Double sharedRoom;

    /**
     * 
     * @return
     *     The entireHomeApt
     */
    public Double getEntireHomeApt() {
        return entireHomeApt;
    }

    /**
     * 
     * @param entireHomeApt
     *     The Entire home/apt
     */
    public void setEntireHomeApt(Double entireHomeApt) {
        this.entireHomeApt = entireHomeApt;
    }

    /**
     * 
     * @return
     *     The privateRoom
     */
    public Double getPrivateRoom() {
        return privateRoom;
    }

    /**
     * 
     * @param privateRoom
     *     The Private room
     */
    public void setPrivateRoom(Double privateRoom) {
        this.privateRoom = privateRoom;
    }

    /**
     * 
     * @return
     *     The sharedRoom
     */
    public Double getSharedRoom() {
        return sharedRoom;
    }

    /**
     * 
     * @param sharedRoom
     *     The Shared room
     */
    public void setSharedRoom(Double sharedRoom) {
        this.sharedRoom = sharedRoom;
    }

}
