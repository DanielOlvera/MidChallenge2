
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Geography {

    @SerializedName("accuracy")
    @Expose
    private Integer accuracy;
    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("result_type")
    @Expose
    private String resultType;
    @SerializedName("state_short")
    @Expose
    private Object stateShort;
    @SerializedName("state")
    @Expose
    private Object state;
    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;

    /**
     * 
     * @return
     *     The accuracy
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    /**
     * 
     * @param accuracy
     *     The accuracy
     */
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * 
     * @return
     *     The precision
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * 
     * @param precision
     *     The precision
     */
    public void setPrecision(String precision) {
        this.precision = precision;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The resultType
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * 
     * @param resultType
     *     The result_type
     */
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    /**
     * 
     * @return
     *     The stateShort
     */
    public Object getStateShort() {
        return stateShort;
    }

    /**
     * 
     * @param stateShort
     *     The state_short
     */
    public void setStateShort(Object stateShort) {
        this.stateShort = stateShort;
    }

    /**
     * 
     * @return
     *     The state
     */
    public Object getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(Object state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The city
     */
    public Object getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(Object city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

}
