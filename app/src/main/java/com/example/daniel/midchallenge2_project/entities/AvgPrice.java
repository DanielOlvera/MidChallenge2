
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AvgPrice {

    @SerializedName("Shared room")
    @Expose
    private Integer sharedRoom;
    @SerializedName("Private room")
    @Expose
    private Integer privateRoom;
    @SerializedName("Entire home/apt")
    @Expose
    private Integer entireHomeApt;

    /**
     * 
     * @return
     *     The sharedRoom
     */
    public Integer getSharedRoom() {
        return sharedRoom;
    }

    /**
     * 
     * @param sharedRoom
     *     The Shared room
     */
    public void setSharedRoom(Integer sharedRoom) {
        this.sharedRoom = sharedRoom;
    }

    /**
     * 
     * @return
     *     The privateRoom
     */
    public Integer getPrivateRoom() {
        return privateRoom;
    }

    /**
     * 
     * @param privateRoom
     *     The Private room
     */
    public void setPrivateRoom(Integer privateRoom) {
        this.privateRoom = privateRoom;
    }

    /**
     * 
     * @return
     *     The entireHomeApt
     */
    public Integer getEntireHomeApt() {
        return entireHomeApt;
    }

    /**
     * 
     * @param entireHomeApt
     *     The Entire home/apt
     */
    public void setEntireHomeApt(Integer entireHomeApt) {
        this.entireHomeApt = entireHomeApt;
    }

}
