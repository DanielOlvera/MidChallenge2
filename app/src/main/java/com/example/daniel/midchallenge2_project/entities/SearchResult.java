
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SearchResult {

    @SerializedName("listing")
    @Expose
    private Listing listing;
    @SerializedName("pricing_quote")
    @Expose
    private PricingQuote pricingQuote;
    @SerializedName("viewed_at")
    @Expose
    private Object viewedAt;

    /**
     * 
     * @return
     *     The listing
     */
    public Listing getListing() {
        return listing;
    }

    /**
     * 
     * @param listing
     *     The listing
     */
    public void setListing(Listing listing) {
        this.listing = listing;
    }

    /**
     * 
     * @return
     *     The pricingQuote
     */
    public PricingQuote getPricingQuote() {
        return pricingQuote;
    }

    /**
     * 
     * @param pricingQuote
     *     The pricing_quote
     */
    public void setPricingQuote(PricingQuote pricingQuote) {
        this.pricingQuote = pricingQuote;
    }

    /**
     * 
     * @return
     *     The viewedAt
     */
    public Object getViewedAt() {
        return viewedAt;
    }

    /**
     * 
     * @param viewedAt
     *     The viewed_at
     */
    public void setViewedAt(Object viewedAt) {
        this.viewedAt = viewedAt;
    }

}
