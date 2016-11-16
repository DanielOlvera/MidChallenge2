
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Breadcrumb {

    @SerializedName("location_name")
    @Expose
    private String locationName;
    @SerializedName("canonical_location_name")
    @Expose
    private String canonicalLocationName;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * 
     * @return
     *     The locationName
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * 
     * @param locationName
     *     The location_name
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * 
     * @return
     *     The canonicalLocationName
     */
    public String getCanonicalLocationName() {
        return canonicalLocationName;
    }

    /**
     * 
     * @param canonicalLocationName
     *     The canonical_location_name
     */
    public void setCanonicalLocationName(String canonicalLocationName) {
        this.canonicalLocationName = canonicalLocationName;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
