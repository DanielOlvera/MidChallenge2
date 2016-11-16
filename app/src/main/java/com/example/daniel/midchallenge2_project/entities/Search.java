
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Search {

    @SerializedName("business_travel_reward_data")
    @Expose
    private BusinessTravelRewardData businessTravelRewardData;
    @SerializedName("has_airbnb_plus_availability")
    @Expose
    private Boolean hasAirbnbPlusAvailability;
    @SerializedName("has_business_travel_ready_availability")
    @Expose
    private Boolean hasBusinessTravelReadyAvailability;
    @SerializedName("is_last_minute_eligible")
    @Expose
    private Boolean isLastMinuteEligible;
    @SerializedName("last_minute_show_dist_sort")
    @Expose
    private Boolean lastMinuteShowDistSort;
    @SerializedName("mobile_session_id")
    @Expose
    private String mobileSessionId;
    @SerializedName("native_currency")
    @Expose
    private String nativeCurrency;
    @SerializedName("price_type")
    @Expose
    private String priceType;
    @SerializedName("price_range_max_native")
    @Expose
    private Integer priceRangeMaxNative;
    @SerializedName("price_range_min_native")
    @Expose
    private Integer priceRangeMinNative;
    @SerializedName("search_id")
    @Expose
    private String searchId;

    /**
     * 
     * @return
     *     The businessTravelRewardData
     */
    public BusinessTravelRewardData getBusinessTravelRewardData() {
        return businessTravelRewardData;
    }

    /**
     * 
     * @param businessTravelRewardData
     *     The business_travel_reward_data
     */
    public void setBusinessTravelRewardData(BusinessTravelRewardData businessTravelRewardData) {
        this.businessTravelRewardData = businessTravelRewardData;
    }

    /**
     * 
     * @return
     *     The hasAirbnbPlusAvailability
     */
    public Boolean getHasAirbnbPlusAvailability() {
        return hasAirbnbPlusAvailability;
    }

    /**
     * 
     * @param hasAirbnbPlusAvailability
     *     The has_airbnb_plus_availability
     */
    public void setHasAirbnbPlusAvailability(Boolean hasAirbnbPlusAvailability) {
        this.hasAirbnbPlusAvailability = hasAirbnbPlusAvailability;
    }

    /**
     * 
     * @return
     *     The hasBusinessTravelReadyAvailability
     */
    public Boolean getHasBusinessTravelReadyAvailability() {
        return hasBusinessTravelReadyAvailability;
    }

    /**
     * 
     * @param hasBusinessTravelReadyAvailability
     *     The has_business_travel_ready_availability
     */
    public void setHasBusinessTravelReadyAvailability(Boolean hasBusinessTravelReadyAvailability) {
        this.hasBusinessTravelReadyAvailability = hasBusinessTravelReadyAvailability;
    }

    /**
     * 
     * @return
     *     The isLastMinuteEligible
     */
    public Boolean getIsLastMinuteEligible() {
        return isLastMinuteEligible;
    }

    /**
     * 
     * @param isLastMinuteEligible
     *     The is_last_minute_eligible
     */
    public void setIsLastMinuteEligible(Boolean isLastMinuteEligible) {
        this.isLastMinuteEligible = isLastMinuteEligible;
    }

    /**
     * 
     * @return
     *     The lastMinuteShowDistSort
     */
    public Boolean getLastMinuteShowDistSort() {
        return lastMinuteShowDistSort;
    }

    /**
     * 
     * @param lastMinuteShowDistSort
     *     The last_minute_show_dist_sort
     */
    public void setLastMinuteShowDistSort(Boolean lastMinuteShowDistSort) {
        this.lastMinuteShowDistSort = lastMinuteShowDistSort;
    }

    /**
     * 
     * @return
     *     The mobileSessionId
     */
    public String getMobileSessionId() {
        return mobileSessionId;
    }

    /**
     * 
     * @param mobileSessionId
     *     The mobile_session_id
     */
    public void setMobileSessionId(String mobileSessionId) {
        this.mobileSessionId = mobileSessionId;
    }

    /**
     * 
     * @return
     *     The nativeCurrency
     */
    public String getNativeCurrency() {
        return nativeCurrency;
    }

    /**
     * 
     * @param nativeCurrency
     *     The native_currency
     */
    public void setNativeCurrency(String nativeCurrency) {
        this.nativeCurrency = nativeCurrency;
    }

    /**
     * 
     * @return
     *     The priceType
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 
     * @param priceType
     *     The price_type
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     * 
     * @return
     *     The priceRangeMaxNative
     */
    public Integer getPriceRangeMaxNative() {
        return priceRangeMaxNative;
    }

    /**
     * 
     * @param priceRangeMaxNative
     *     The price_range_max_native
     */
    public void setPriceRangeMaxNative(Integer priceRangeMaxNative) {
        this.priceRangeMaxNative = priceRangeMaxNative;
    }

    /**
     * 
     * @return
     *     The priceRangeMinNative
     */
    public Integer getPriceRangeMinNative() {
        return priceRangeMinNative;
    }

    /**
     * 
     * @param priceRangeMinNative
     *     The price_range_min_native
     */
    public void setPriceRangeMinNative(Integer priceRangeMinNative) {
        this.priceRangeMinNative = priceRangeMinNative;
    }

    /**
     * 
     * @return
     *     The searchId
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * 
     * @param searchId
     *     The search_id
     */
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

}
