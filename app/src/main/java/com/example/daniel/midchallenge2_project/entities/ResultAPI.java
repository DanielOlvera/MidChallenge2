
package com.example.daniel.midchallenge2_project.entities;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResultAPI {

    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("search_results")
    @Expose
    private List<SearchResult> searchResults = new ArrayList<SearchResult>();

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The searchResults
     */
    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    /**
     * 
     * @param searchResults
     *     The search_results
     */
    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

}
