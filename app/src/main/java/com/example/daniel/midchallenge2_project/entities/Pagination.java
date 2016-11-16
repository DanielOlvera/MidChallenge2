
package com.example.daniel.midchallenge2_project.entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Pagination {

    @SerializedName("next_offset")
    @Expose
    private Integer nextOffset;
    @SerializedName("result_count")
    @Expose
    private Integer resultCount;

    /**
     * 
     * @return
     *     The nextOffset
     */
    public Integer getNextOffset() {
        return nextOffset;
    }

    /**
     * 
     * @param nextOffset
     *     The next_offset
     */
    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    /**
     * 
     * @return
     *     The resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     * 
     * @param resultCount
     *     The result_count
     */
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

}
