package com.example.daniel.midchallenge2_project;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Daniel on 11/15/16.
 */

@Module
public class ChallengeModule {
    private Context context;

    final static String BASE_URL = "https://api.airbnb.com/v2/";

    public ChallengeModule(Context context) {
        this.context = context;
    }

    @Provides
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    public ListingService listingService(Retrofit retrofit){
        return retrofit.create(ListingService.class);
    }
}
