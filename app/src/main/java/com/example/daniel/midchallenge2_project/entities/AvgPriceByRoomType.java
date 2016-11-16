
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AvgPriceByRoomType {

    @SerializedName("ratio")
    @Expose
    private Ratio ratio;
    @SerializedName("avg_price")
    @Expose
    private AvgPrice avgPrice;

    /**
     * 
     * @return
     *     The ratio
     */
    public Ratio getRatio() {
        return ratio;
    }

    /**
     * 
     * @param ratio
     *     The ratio
     */
    public void setRatio(Ratio ratio) {
        this.ratio = ratio;
    }

    /**
     * 
     * @return
     *     The avgPrice
     */
    public AvgPrice getAvgPrice() {
        return avgPrice;
    }

    /**
     * 
     * @param avgPrice
     *     The avg_price
     */
    public void setAvgPrice(AvgPrice avgPrice) {
        this.avgPrice = avgPrice;
    }

}
