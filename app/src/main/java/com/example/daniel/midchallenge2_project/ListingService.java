package com.example.daniel.midchallenge2_project;

import com.example.daniel.midchallenge2_project.entities.ResultAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Daniel on 11/15/16.
 */

public interface ListingService {
    @GET("search_results?client_id=3092nxybyb0otqw18e8nh5nty&locale=en-US&currency=USD&_format=for_search_results_with_minimal_pricing&_limit=10")
    Call<ResultAPI> retrieveListings(@Query("location") String location);

}
