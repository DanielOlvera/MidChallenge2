
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TopOtherAmenity {

    @SerializedName("key")
    @Expose
    private Integer key;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("count")
    @Expose
    private Integer count;

    /**
     * 
     * @return
     *     The key
     */
    public Integer getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    public void setKey(Integer key) {
        this.key = key;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

}
