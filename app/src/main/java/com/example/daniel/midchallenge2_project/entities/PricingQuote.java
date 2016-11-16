
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PricingQuote {

    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("can_instant_book")
    @Expose
    private Boolean canInstantBook;
    @SerializedName("check_in")
    @Expose
    private Object checkIn;
    @SerializedName("check_out")
    @Expose
    private Object checkOut;
    @SerializedName("guests")
    @Expose
    private Integer guests;
    @SerializedName("guest_details")
    @Expose
    private GuestDetails guestDetails;
    @SerializedName("price")
    @Expose
    private Object price;
    @SerializedName("rate")
    @Expose
    private Rate rate;
    @SerializedName("rate_type")
    @Expose
    private String rateType;

    /**
     * 
     * @return
     *     The available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * 
     * @return
     *     The canInstantBook
     */
    public Boolean getCanInstantBook() {
        return canInstantBook;
    }

    /**
     * 
     * @param canInstantBook
     *     The can_instant_book
     */
    public void setCanInstantBook(Boolean canInstantBook) {
        this.canInstantBook = canInstantBook;
    }

    /**
     * 
     * @return
     *     The checkIn
     */
    public Object getCheckIn() {
        return checkIn;
    }

    /**
     * 
     * @param checkIn
     *     The check_in
     */
    public void setCheckIn(Object checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * 
     * @return
     *     The checkOut
     */
    public Object getCheckOut() {
        return checkOut;
    }

    /**
     * 
     * @param checkOut
     *     The check_out
     */
    public void setCheckOut(Object checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * 
     * @return
     *     The guests
     */
    public Integer getGuests() {
        return guests;
    }

    /**
     * 
     * @param guests
     *     The guests
     */
    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    /**
     * 
     * @return
     *     The guestDetails
     */
    public GuestDetails getGuestDetails() {
        return guestDetails;
    }

    /**
     * 
     * @param guestDetails
     *     The guest_details
     */
    public void setGuestDetails(GuestDetails guestDetails) {
        this.guestDetails = guestDetails;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Object getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Object price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The rate
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * 
     * @param rate
     *     The rate
     */
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    /**
     * 
     * @return
     *     The rateType
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 
     * @param rateType
     *     The rate_type
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

}
