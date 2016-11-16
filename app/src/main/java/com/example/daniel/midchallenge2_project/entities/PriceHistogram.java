
package com.example.daniel.midchallenge2_project.entities;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PriceHistogram {

    @SerializedName("average_price")
    @Expose
    private Integer averagePrice;
    @SerializedName("histogram")
    @Expose
    private List<Integer> histogram = new ArrayList<Integer>();

    /**
     * 
     * @return
     *     The averagePrice
     */
    public Integer getAveragePrice() {
        return averagePrice;
    }

    /**
     * 
     * @param averagePrice
     *     The average_price
     */
    public void setAveragePrice(Integer averagePrice) {
        this.averagePrice = averagePrice;
    }

    /**
     * 
     * @return
     *     The histogram
     */
    public List<Integer> getHistogram() {
        return histogram;
    }

    /**
     * 
     * @param histogram
     *     The histogram
     */
    public void setHistogram(List<Integer> histogram) {
        this.histogram = histogram;
    }

}
