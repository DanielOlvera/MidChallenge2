
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GuidedSearch {

    @SerializedName("avg_gbm_score")
    @Expose
    private Double avgGbmScore;
    @SerializedName("avg_usd_price")
    @Expose
    private Double avgUsdPrice;
    @SerializedName("min_stars")
    @Expose
    private Double minStars;
    @SerializedName("min_review_count")
    @Expose
    private Double minReviewCount;

    /**
     * 
     * @return
     *     The avgGbmScore
     */
    public Double getAvgGbmScore() {
        return avgGbmScore;
    }

    /**
     * 
     * @param avgGbmScore
     *     The avg_gbm_score
     */
    public void setAvgGbmScore(Double avgGbmScore) {
        this.avgGbmScore = avgGbmScore;
    }

    /**
     * 
     * @return
     *     The avgUsdPrice
     */
    public Double getAvgUsdPrice() {
        return avgUsdPrice;
    }

    /**
     * 
     * @param avgUsdPrice
     *     The avg_usd_price
     */
    public void setAvgUsdPrice(Double avgUsdPrice) {
        this.avgUsdPrice = avgUsdPrice;
    }

    /**
     * 
     * @return
     *     The minStars
     */
    public Double getMinStars() {
        return minStars;
    }

    /**
     * 
     * @param minStars
     *     The min_stars
     */
    public void setMinStars(Double minStars) {
        this.minStars = minStars;
    }

    /**
     * 
     * @return
     *     The minReviewCount
     */
    public Double getMinReviewCount() {
        return minReviewCount;
    }

    /**
     * 
     * @param minReviewCount
     *     The min_review_count
     */
    public void setMinReviewCount(Double minReviewCount) {
        this.minReviewCount = minReviewCount;
    }

}
