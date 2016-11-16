
package com.example.daniel.midchallenge2_project.entities;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata {

    @SerializedName("geography")
    @Expose
    private Geography geography;
    @SerializedName("guidebook")
    @Expose
    private Object guidebook;
    @SerializedName("search")
    @Expose
    private Search search;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("facets")
    @Expose
    private Facets facets;
    @SerializedName("listing_tags")
    @Expose
    private ListingTags listingTags;
    @SerializedName("listings_count")
    @Expose
    private Integer listingsCount;
    @SerializedName("urgency_commitment")
    @Expose
    private UrgencyCommitment urgencyCommitment;
    @SerializedName("market_info")
    @Expose
    private MarketInfo marketInfo;
    @SerializedName("price_histogram")
    @Expose
    private PriceHistogram priceHistogram;
    @SerializedName("search_feed_items")
    @Expose
    private List<Object> searchFeedItems = new ArrayList<Object>();
    @SerializedName("avg_price_by_room_type")
    @Expose
    private AvgPriceByRoomType avgPriceByRoomType;
    @SerializedName("messages")
    @Expose
    private Messages messages;
    @SerializedName("overrides")
    @Expose
    private Overrides overrides;
    @SerializedName("breadcrumbs")
    @Expose
    private List<Breadcrumb> breadcrumbs = new ArrayList<Breadcrumb>();
    @SerializedName("guided_search")
    @Expose
    private GuidedSearch guidedSearch;
    @SerializedName("location")
    @Expose
    private Location location;

    /**
     * 
     * @return
     *     The geography
     */
    public Geography getGeography() {
        return geography;
    }

    /**
     * 
     * @param geography
     *     The geography
     */
    public void setGeography(Geography geography) {
        this.geography = geography;
    }

    /**
     * 
     * @return
     *     The guidebook
     */
    public Object getGuidebook() {
        return guidebook;
    }

    /**
     * 
     * @param guidebook
     *     The guidebook
     */
    public void setGuidebook(Object guidebook) {
        this.guidebook = guidebook;
    }

    /**
     * 
     * @return
     *     The search
     */
    public Search getSearch() {
        return search;
    }

    /**
     * 
     * @param search
     *     The search
     */
    public void setSearch(Search search) {
        this.search = search;
    }

    /**
     * 
     * @return
     *     The pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * 
     * @param pagination
     *     The pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * 
     * @return
     *     The facets
     */
    public Facets getFacets() {
        return facets;
    }

    /**
     * 
     * @param facets
     *     The facets
     */
    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    /**
     * 
     * @return
     *     The listingTags
     */
    public ListingTags getListingTags() {
        return listingTags;
    }

    /**
     * 
     * @param listingTags
     *     The listing_tags
     */
    public void setListingTags(ListingTags listingTags) {
        this.listingTags = listingTags;
    }

    /**
     * 
     * @return
     *     The listingsCount
     */
    public Integer getListingsCount() {
        return listingsCount;
    }

    /**
     * 
     * @param listingsCount
     *     The listings_count
     */
    public void setListingsCount(Integer listingsCount) {
        this.listingsCount = listingsCount;
    }

    /**
     * 
     * @return
     *     The urgencyCommitment
     */
    public UrgencyCommitment getUrgencyCommitment() {
        return urgencyCommitment;
    }

    /**
     * 
     * @param urgencyCommitment
     *     The urgency_commitment
     */
    public void setUrgencyCommitment(UrgencyCommitment urgencyCommitment) {
        this.urgencyCommitment = urgencyCommitment;
    }

    /**
     * 
     * @return
     *     The marketInfo
     */
    public MarketInfo getMarketInfo() {
        return marketInfo;
    }

    /**
     * 
     * @param marketInfo
     *     The market_info
     */
    public void setMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
    }

    /**
     * 
     * @return
     *     The priceHistogram
     */
    public PriceHistogram getPriceHistogram() {
        return priceHistogram;
    }

    /**
     * 
     * @param priceHistogram
     *     The price_histogram
     */
    public void setPriceHistogram(PriceHistogram priceHistogram) {
        this.priceHistogram = priceHistogram;
    }

    /**
     * 
     * @return
     *     The searchFeedItems
     */
    public List<Object> getSearchFeedItems() {
        return searchFeedItems;
    }

    /**
     * 
     * @param searchFeedItems
     *     The search_feed_items
     */
    public void setSearchFeedItems(List<Object> searchFeedItems) {
        this.searchFeedItems = searchFeedItems;
    }

    /**
     * 
     * @return
     *     The avgPriceByRoomType
     */
    public AvgPriceByRoomType getAvgPriceByRoomType() {
        return avgPriceByRoomType;
    }

    /**
     * 
     * @param avgPriceByRoomType
     *     The avg_price_by_room_type
     */
    public void setAvgPriceByRoomType(AvgPriceByRoomType avgPriceByRoomType) {
        this.avgPriceByRoomType = avgPriceByRoomType;
    }

    /**
     * 
     * @return
     *     The messages
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    /**
     * 
     * @return
     *     The overrides
     */
    public Overrides getOverrides() {
        return overrides;
    }

    /**
     * 
     * @param overrides
     *     The overrides
     */
    public void setOverrides(Overrides overrides) {
        this.overrides = overrides;
    }

    /**
     * 
     * @return
     *     The breadcrumbs
     */
    public List<Breadcrumb> getBreadcrumbs() {
        return breadcrumbs;
    }

    /**
     * 
     * @param breadcrumbs
     *     The breadcrumbs
     */
    public void setBreadcrumbs(List<Breadcrumb> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    /**
     * 
     * @return
     *     The guidedSearch
     */
    public GuidedSearch getGuidedSearch() {
        return guidedSearch;
    }

    /**
     * 
     * @param guidedSearch
     *     The guided_search
     */
    public void setGuidedSearch(GuidedSearch guidedSearch) {
        this.guidedSearch = guidedSearch;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

}
