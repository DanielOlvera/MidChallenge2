
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Location {

    @SerializedName("canonical_location")
    @Expose
    private String canonicalLocation;
    @SerializedName("display_location")
    @Expose
    private String displayLocation;

    /**
     * 
     * @return
     *     The canonicalLocation
     */
    public String getCanonicalLocation() {
        return canonicalLocation;
    }

    /**
     * 
     * @param canonicalLocation
     *     The canonical_location
     */
    public void setCanonicalLocation(String canonicalLocation) {
        this.canonicalLocation = canonicalLocation;
    }

    /**
     * 
     * @return
     *     The displayLocation
     */
    public String getDisplayLocation() {
        return displayLocation;
    }

    /**
     * 
     * @param displayLocation
     *     The display_location
     */
    public void setDisplayLocation(String displayLocation) {
        this.displayLocation = displayLocation;
    }

}
