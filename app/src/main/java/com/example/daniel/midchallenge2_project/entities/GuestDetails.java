
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GuestDetails {

    @SerializedName("number_of_adults")
    @Expose
    private Integer numberOfAdults;
    @SerializedName("number_of_children")
    @Expose
    private Integer numberOfChildren;
    @SerializedName("number_of_infants")
    @Expose
    private Integer numberOfInfants;

    /**
     * 
     * @return
     *     The numberOfAdults
     */
    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * 
     * @param numberOfAdults
     *     The number_of_adults
     */
    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    /**
     * 
     * @return
     *     The numberOfChildren
     */
    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * 
     * @param numberOfChildren
     *     The number_of_children
     */
    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    /**
     * 
     * @return
     *     The numberOfInfants
     */
    public Integer getNumberOfInfants() {
        return numberOfInfants;
    }

    /**
     * 
     * @param numberOfInfants
     *     The number_of_infants
     */
    public void setNumberOfInfants(Integer numberOfInfants) {
        this.numberOfInfants = numberOfInfants;
    }

}
