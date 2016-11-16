
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PrimaryHost {

    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("has_profile_pic")
    @Expose
    private Boolean hasProfilePic;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("picture_url")
    @Expose
    private String pictureUrl;
    @SerializedName("smart_name")
    @Expose
    private String smartName;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("is_superhost")
    @Expose
    private Boolean isSuperhost;

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The hasProfilePic
     */
    public Boolean getHasProfilePic() {
        return hasProfilePic;
    }

    /**
     * 
     * @param hasProfilePic
     *     The has_profile_pic
     */
    public void setHasProfilePic(Boolean hasProfilePic) {
        this.hasProfilePic = hasProfilePic;
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
     *     The smartName
     */
    public String getSmartName() {
        return smartName;
    }

    /**
     * 
     * @param smartName
     *     The smart_name
     */
    public void setSmartName(String smartName) {
        this.smartName = smartName;
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
     *     The isSuperhost
     */
    public Boolean getIsSuperhost() {
        return isSuperhost;
    }

    /**
     * 
     * @param isSuperhost
     *     The is_superhost
     */
    public void setIsSuperhost(Boolean isSuperhost) {
        this.isSuperhost = isSuperhost;
    }

}
