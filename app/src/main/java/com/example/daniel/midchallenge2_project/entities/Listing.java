
package com.example.daniel.midchallenge2_project.entities;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Listing {

    @SerializedName("airbnb_plus_enabled")
    @Expose
    private Boolean airbnbPlusEnabled;
    @SerializedName("bathrooms")
    @Expose
    private Double bathrooms;
    @SerializedName("bedrooms")
    @Expose
    private Integer bedrooms;
    @SerializedName("beds")
    @Expose
    private Integer beds;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("coworker_hosted")
    @Expose
    private Boolean coworkerHosted;
    @SerializedName("distance")
    @Expose
    private Object distance;
    @SerializedName("extra_host_languages")
    @Expose
    private List<Object> extraHostLanguages = new ArrayList<Object>();
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("instant_bookable")
    @Expose
    private Boolean instantBookable;
    @SerializedName("is_business_travel_ready")
    @Expose
    private Boolean isBusinessTravelReady;
    @SerializedName("is_new_listing")
    @Expose
    private Boolean isNewListing;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("listing_tags")
    @Expose
    private List<Object> listingTags = new ArrayList<Object>();
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("person_capacity")
    @Expose
    private Integer personCapacity;
    @SerializedName("picture_count")
    @Expose
    private Integer pictureCount;
    @SerializedName("picture_url")
    @Expose
    private String pictureUrl;
    @SerializedName("primary_host")
    @Expose
    private PrimaryHost primaryHost;
    @SerializedName("property_type")
    @Expose
    private String propertyType;
    @SerializedName("property_type_id")
    @Expose
    private Integer propertyTypeId;
    @SerializedName("public_address")
    @Expose
    private String publicAddress;
    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount;
    @SerializedName("room_type")
    @Expose
    private String roomType;
    @SerializedName("room_type_category")
    @Expose
    private String roomTypeCategory;
    @SerializedName("scrim_color")
    @Expose
    private String scrimColor;
    @SerializedName("star_rating")
    @Expose
    private Double starRating;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("xl_picture_url")
    @Expose
    private String xlPictureUrl;
    @SerializedName("preview_encoded_png")
    @Expose
    private String previewEncodedPng;
    @SerializedName("picture_urls")
    @Expose
    private List<String> pictureUrls = new ArrayList<String>();
    @SerializedName("xl_picture_urls")
    @Expose
    private List<String> xlPictureUrls = new ArrayList<String>();

    /**
     * 
     * @return
     *     The airbnbPlusEnabled
     */
    public Boolean getAirbnbPlusEnabled() {
        return airbnbPlusEnabled;
    }

    /**
     * 
     * @param airbnbPlusEnabled
     *     The airbnb_plus_enabled
     */
    public void setAirbnbPlusEnabled(Boolean airbnbPlusEnabled) {
        this.airbnbPlusEnabled = airbnbPlusEnabled;
    }

    /**
     * 
     * @return
     *     The bathrooms
     */
    public Double getBathrooms() {
        return bathrooms;
    }

    /**
     * 
     * @param bathrooms
     *     The bathrooms
     */
    public void setBathrooms(Double bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * 
     * @return
     *     The bedrooms
     */
    public Integer getBedrooms() {
        return bedrooms;
    }

    /**
     * 
     * @param bedrooms
     *     The bedrooms
     */
    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * 
     * @return
     *     The beds
     */
    public Integer getBeds() {
        return beds;
    }

    /**
     * 
     * @param beds
     *     The beds
     */
    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The coworkerHosted
     */
    public Boolean getCoworkerHosted() {
        return coworkerHosted;
    }

    /**
     * 
     * @param coworkerHosted
     *     The coworker_hosted
     */
    public void setCoworkerHosted(Boolean coworkerHosted) {
        this.coworkerHosted = coworkerHosted;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public Object getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The extraHostLanguages
     */
    public List<Object> getExtraHostLanguages() {
        return extraHostLanguages;
    }

    /**
     * 
     * @param extraHostLanguages
     *     The extra_host_languages
     */
    public void setExtraHostLanguages(List<Object> extraHostLanguages) {
        this.extraHostLanguages = extraHostLanguages;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The instantBookable
     */
    public Boolean getInstantBookable() {
        return instantBookable;
    }

    /**
     * 
     * @param instantBookable
     *     The instant_bookable
     */
    public void setInstantBookable(Boolean instantBookable) {
        this.instantBookable = instantBookable;
    }

    /**
     * 
     * @return
     *     The isBusinessTravelReady
     */
    public Boolean getIsBusinessTravelReady() {
        return isBusinessTravelReady;
    }

    /**
     * 
     * @param isBusinessTravelReady
     *     The is_business_travel_ready
     */
    public void setIsBusinessTravelReady(Boolean isBusinessTravelReady) {
        this.isBusinessTravelReady = isBusinessTravelReady;
    }

    /**
     * 
     * @return
     *     The isNewListing
     */
    public Boolean getIsNewListing() {
        return isNewListing;
    }

    /**
     * 
     * @param isNewListing
     *     The is_new_listing
     */
    public void setIsNewListing(Boolean isNewListing) {
        this.isNewListing = isNewListing;
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
     *     The listingTags
     */
    public List<Object> getListingTags() {
        return listingTags;
    }

    /**
     * 
     * @param listingTags
     *     The listing_tags
     */
    public void setListingTags(List<Object> listingTags) {
        this.listingTags = listingTags;
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

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * 
     * @param neighborhood
     *     The neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * 
     * @return
     *     The personCapacity
     */
    public Integer getPersonCapacity() {
        return personCapacity;
    }

    /**
     * 
     * @param personCapacity
     *     The person_capacity
     */
    public void setPersonCapacity(Integer personCapacity) {
        this.personCapacity = personCapacity;
    }

    /**
     * 
     * @return
     *     The pictureCount
     */
    public Integer getPictureCount() {
        return pictureCount;
    }

    /**
     * 
     * @param pictureCount
     *     The picture_count
     */
    public void setPictureCount(Integer pictureCount) {
        this.pictureCount = pictureCount;
    }

    /**
     * 
     * @return
     *     The pictureUrl
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 
     * @param pictureUrl
     *     The picture_url
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    /**
     * 
     * @return
     *     The primaryHost
     */
    public PrimaryHost getPrimaryHost() {
        return primaryHost;
    }

    /**
     * 
     * @param primaryHost
     *     The primary_host
     */
    public void setPrimaryHost(PrimaryHost primaryHost) {
        this.primaryHost = primaryHost;
    }

    /**
     * 
     * @return
     *     The propertyType
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * 
     * @param propertyType
     *     The property_type
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * 
     * @return
     *     The propertyTypeId
     */
    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    /**
     * 
     * @param propertyTypeId
     *     The property_type_id
     */
    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    /**
     * 
     * @return
     *     The publicAddress
     */
    public String getPublicAddress() {
        return publicAddress;
    }

    /**
     * 
     * @param publicAddress
     *     The public_address
     */
    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    /**
     * 
     * @return
     *     The reviewsCount
     */
    public Integer getReviewsCount() {
        return reviewsCount;
    }

    /**
     * 
     * @param reviewsCount
     *     The reviews_count
     */
    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    /**
     * 
     * @return
     *     The roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 
     * @param roomType
     *     The room_type
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * 
     * @return
     *     The roomTypeCategory
     */
    public String getRoomTypeCategory() {
        return roomTypeCategory;
    }

    /**
     * 
     * @param roomTypeCategory
     *     The room_type_category
     */
    public void setRoomTypeCategory(String roomTypeCategory) {
        this.roomTypeCategory = roomTypeCategory;
    }

    /**
     * 
     * @return
     *     The scrimColor
     */
    public String getScrimColor() {
        return scrimColor;
    }

    /**
     * 
     * @param scrimColor
     *     The scrim_color
     */
    public void setScrimColor(String scrimColor) {
        this.scrimColor = scrimColor;
    }

    /**
     * 
     * @return
     *     The starRating
     */
    public Double getStarRating() {
        return starRating;
    }

    /**
     * 
     * @param starRating
     *     The star_rating
     */
    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    /**
     * 
     * @return
     *     The thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * 
     * @param thumbnailUrl
     *     The thumbnail_url
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * 
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The xlPictureUrl
     */
    public String getXlPictureUrl() {
        return xlPictureUrl;
    }

    /**
     * 
     * @param xlPictureUrl
     *     The xl_picture_url
     */
    public void setXlPictureUrl(String xlPictureUrl) {
        this.xlPictureUrl = xlPictureUrl;
    }

    /**
     * 
     * @return
     *     The previewEncodedPng
     */
    public String getPreviewEncodedPng() {
        return previewEncodedPng;
    }

    /**
     * 
     * @param previewEncodedPng
     *     The preview_encoded_png
     */
    public void setPreviewEncodedPng(String previewEncodedPng) {
        this.previewEncodedPng = previewEncodedPng;
    }

    /**
     * 
     * @return
     *     The pictureUrls
     */
    public List<String> getPictureUrls() {
        return pictureUrls;
    }

    /**
     * 
     * @param pictureUrls
     *     The picture_urls
     */
    public void setPictureUrls(List<String> pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    /**
     * 
     * @return
     *     The xlPictureUrls
     */
    public List<String> getXlPictureUrls() {
        return xlPictureUrls;
    }

    /**
     * 
     * @param xlPictureUrls
     *     The xl_picture_urls
     */
    public void setXlPictureUrls(List<String> xlPictureUrls) {
        this.xlPictureUrls = xlPictureUrls;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "airbnbPlusEnabled=" + airbnbPlusEnabled +
                ", bathrooms=" + bathrooms +
                ", bedrooms=" + bedrooms +
                ", beds=" + beds +
                ", city='" + city + '\'' +
                ", coworkerHosted=" + coworkerHosted +
                ", distance=" + distance +
                ", extraHostLanguages=" + extraHostLanguages +
                ", id=" + id +
                ", instantBookable=" + instantBookable +
                ", isBusinessTravelReady=" + isBusinessTravelReady +
                ", isNewListing=" + isNewListing +
                ", lat=" + lat +
                ", listingTags=" + listingTags +
                ", lng=" + lng +
                ", name='" + name + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", personCapacity=" + personCapacity +
                ", pictureCount=" + pictureCount +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", primaryHost=" + primaryHost +
                ", propertyType='" + propertyType + '\'' +
                ", propertyTypeId=" + propertyTypeId +
                ", publicAddress='" + publicAddress + '\'' +
                ", reviewsCount=" + reviewsCount +
                ", roomType='" + roomType + '\'' +
                ", roomTypeCategory='" + roomTypeCategory + '\'' +
                ", scrimColor='" + scrimColor + '\'' +
                ", starRating=" + starRating +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", user=" + user +
                ", userId=" + userId +
                ", xlPictureUrl='" + xlPictureUrl + '\'' +
                ", previewEncodedPng='" + previewEncodedPng + '\'' +
                ", pictureUrls=" + pictureUrls +
                ", xlPictureUrls=" + xlPictureUrls +
                '}';
    }
}
