
package com.example.daniel.midchallenge2_project.entities;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Facets {

    @SerializedName("bedrooms")
    @Expose
    private List<Bedroom> bedrooms = new ArrayList<Bedroom>();
    @SerializedName("bathrooms")
    @Expose
    private List<Bathroom> bathrooms = new ArrayList<Bathroom>();
    @SerializedName("beds")
    @Expose
    private List<Bed> beds = new ArrayList<Bed>();
    @SerializedName("availability")
    @Expose
    private List<Availability> availability = new ArrayList<Availability>();
    @SerializedName("room_type")
    @Expose
    private List<RoomType> roomType = new ArrayList<RoomType>();
    @SerializedName("hosting_amenity_ids")
    @Expose
    private List<HostingAmenityId> hostingAmenityIds = new ArrayList<HostingAmenityId>();
    @SerializedName("top_amenities")
    @Expose
    private List<TopAmenity> topAmenities = new ArrayList<TopAmenity>();
    @SerializedName("neighborhood_facet")
    @Expose
    private List<NeighborhoodFacet> neighborhoodFacet = new ArrayList<NeighborhoodFacet>();
    @SerializedName("top_neighborhoods")
    @Expose
    private List<TopNeighborhood> topNeighborhoods = new ArrayList<TopNeighborhood>();
    @SerializedName("property_type_id")
    @Expose
    private List<PropertyTypeId> propertyTypeId = new ArrayList<PropertyTypeId>();
    @SerializedName("facilities_amenities")
    @Expose
    private List<FacilitiesAmenity> facilitiesAmenities = new ArrayList<FacilitiesAmenity>();
    @SerializedName("house_rules_amenities")
    @Expose
    private List<HouseRulesAmenity> houseRulesAmenities = new ArrayList<HouseRulesAmenity>();
    @SerializedName("other_amenities")
    @Expose
    private List<OtherAmenity> otherAmenities = new ArrayList<OtherAmenity>();
    @SerializedName("top_other_amenities")
    @Expose
    private List<TopOtherAmenity> topOtherAmenities = new ArrayList<TopOtherAmenity>();
    @SerializedName("languages")
    @Expose
    private List<Language> languages = new ArrayList<Language>();
    @SerializedName("first_languages")
    @Expose
    private List<FirstLanguage> firstLanguages = new ArrayList<FirstLanguage>();
    @SerializedName("description_languages")
    @Expose
    private List<DescriptionLanguage> descriptionLanguages = new ArrayList<DescriptionLanguage>();
    @SerializedName("first_description_languages")
    @Expose
    private List<FirstDescriptionLanguage> firstDescriptionLanguages = new ArrayList<FirstDescriptionLanguage>();

    /**
     * 
     * @return
     *     The bedrooms
     */
    public List<Bedroom> getBedrooms() {
        return bedrooms;
    }

    /**
     * 
     * @param bedrooms
     *     The bedrooms
     */
    public void setBedrooms(List<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * 
     * @return
     *     The bathrooms
     */
    public List<Bathroom> getBathrooms() {
        return bathrooms;
    }

    /**
     * 
     * @param bathrooms
     *     The bathrooms
     */
    public void setBathrooms(List<Bathroom> bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * 
     * @return
     *     The beds
     */
    public List<Bed> getBeds() {
        return beds;
    }

    /**
     * 
     * @param beds
     *     The beds
     */
    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }

    /**
     * 
     * @return
     *     The availability
     */
    public List<Availability> getAvailability() {
        return availability;
    }

    /**
     * 
     * @param availability
     *     The availability
     */
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    /**
     * 
     * @return
     *     The roomType
     */
    public List<RoomType> getRoomType() {
        return roomType;
    }

    /**
     * 
     * @param roomType
     *     The room_type
     */
    public void setRoomType(List<RoomType> roomType) {
        this.roomType = roomType;
    }

    /**
     * 
     * @return
     *     The hostingAmenityIds
     */
    public List<HostingAmenityId> getHostingAmenityIds() {
        return hostingAmenityIds;
    }

    /**
     * 
     * @param hostingAmenityIds
     *     The hosting_amenity_ids
     */
    public void setHostingAmenityIds(List<HostingAmenityId> hostingAmenityIds) {
        this.hostingAmenityIds = hostingAmenityIds;
    }

    /**
     * 
     * @return
     *     The topAmenities
     */
    public List<TopAmenity> getTopAmenities() {
        return topAmenities;
    }

    /**
     * 
     * @param topAmenities
     *     The top_amenities
     */
    public void setTopAmenities(List<TopAmenity> topAmenities) {
        this.topAmenities = topAmenities;
    }

    /**
     * 
     * @return
     *     The neighborhoodFacet
     */
    public List<NeighborhoodFacet> getNeighborhoodFacet() {
        return neighborhoodFacet;
    }

    /**
     * 
     * @param neighborhoodFacet
     *     The neighborhood_facet
     */
    public void setNeighborhoodFacet(List<NeighborhoodFacet> neighborhoodFacet) {
        this.neighborhoodFacet = neighborhoodFacet;
    }

    /**
     * 
     * @return
     *     The topNeighborhoods
     */
    public List<TopNeighborhood> getTopNeighborhoods() {
        return topNeighborhoods;
    }

    /**
     * 
     * @param topNeighborhoods
     *     The top_neighborhoods
     */
    public void setTopNeighborhoods(List<TopNeighborhood> topNeighborhoods) {
        this.topNeighborhoods = topNeighborhoods;
    }

    /**
     * 
     * @return
     *     The propertyTypeId
     */
    public List<PropertyTypeId> getPropertyTypeId() {
        return propertyTypeId;
    }

    /**
     * 
     * @param propertyTypeId
     *     The property_type_id
     */
    public void setPropertyTypeId(List<PropertyTypeId> propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    /**
     * 
     * @return
     *     The facilitiesAmenities
     */
    public List<FacilitiesAmenity> getFacilitiesAmenities() {
        return facilitiesAmenities;
    }

    /**
     * 
     * @param facilitiesAmenities
     *     The facilities_amenities
     */
    public void setFacilitiesAmenities(List<FacilitiesAmenity> facilitiesAmenities) {
        this.facilitiesAmenities = facilitiesAmenities;
    }

    /**
     * 
     * @return
     *     The houseRulesAmenities
     */
    public List<HouseRulesAmenity> getHouseRulesAmenities() {
        return houseRulesAmenities;
    }

    /**
     * 
     * @param houseRulesAmenities
     *     The house_rules_amenities
     */
    public void setHouseRulesAmenities(List<HouseRulesAmenity> houseRulesAmenities) {
        this.houseRulesAmenities = houseRulesAmenities;
    }

    /**
     * 
     * @return
     *     The otherAmenities
     */
    public List<OtherAmenity> getOtherAmenities() {
        return otherAmenities;
    }

    /**
     * 
     * @param otherAmenities
     *     The other_amenities
     */
    public void setOtherAmenities(List<OtherAmenity> otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    /**
     * 
     * @return
     *     The topOtherAmenities
     */
    public List<TopOtherAmenity> getTopOtherAmenities() {
        return topOtherAmenities;
    }

    /**
     * 
     * @param topOtherAmenities
     *     The top_other_amenities
     */
    public void setTopOtherAmenities(List<TopOtherAmenity> topOtherAmenities) {
        this.topOtherAmenities = topOtherAmenities;
    }

    /**
     * 
     * @return
     *     The languages
     */
    public List<Language> getLanguages() {
        return languages;
    }

    /**
     * 
     * @param languages
     *     The languages
     */
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    /**
     * 
     * @return
     *     The firstLanguages
     */
    public List<FirstLanguage> getFirstLanguages() {
        return firstLanguages;
    }

    /**
     * 
     * @param firstLanguages
     *     The first_languages
     */
    public void setFirstLanguages(List<FirstLanguage> firstLanguages) {
        this.firstLanguages = firstLanguages;
    }

    /**
     * 
     * @return
     *     The descriptionLanguages
     */
    public List<DescriptionLanguage> getDescriptionLanguages() {
        return descriptionLanguages;
    }

    /**
     * 
     * @param descriptionLanguages
     *     The description_languages
     */
    public void setDescriptionLanguages(List<DescriptionLanguage> descriptionLanguages) {
        this.descriptionLanguages = descriptionLanguages;
    }

    /**
     * 
     * @return
     *     The firstDescriptionLanguages
     */
    public List<FirstDescriptionLanguage> getFirstDescriptionLanguages() {
        return firstDescriptionLanguages;
    }

    /**
     * 
     * @param firstDescriptionLanguages
     *     The first_description_languages
     */
    public void setFirstDescriptionLanguages(List<FirstDescriptionLanguage> firstDescriptionLanguages) {
        this.firstDescriptionLanguages = firstDescriptionLanguages;
    }

}
