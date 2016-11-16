package com.example.daniel.midchallenge2_project;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.daniel.midchallenge2_project.entities.ResultAPI;
import com.example.daniel.midchallenge2_project.entities.SearchResult;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Inject
    ListingService listingService;

    @BindView(R.id.m_recyclerView)
    RecyclerView mRecyclerView;

    private static final String BASE_URL = "https://api.airbnb.com/v2/";
    private static final String TAG = "MainActivityTAG_";

    LinearLayoutManager layoutManager;

    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerChallengeComponent.builder().challengeModule(new ChallengeModule(this)).build().inject(this);
        ButterKnife.bind(this);
    }

    public void doMagic(View view) {
        if(networkCheck()) {
            Call<ResultAPI> call = listingService.retrieveListings("Sandy Springs, GA, US");
            call.enqueue(new Callback<ResultAPI>() {
                @Override
                public void onResponse(Call<ResultAPI> call, Response<ResultAPI> response) {

                    ResultAPI resultAPI = response.body();
                    layoutManager = new LinearLayoutManager(getApplicationContext());
                    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    mRecyclerView.setLayoutManager(layoutManager);
                    adapter = new RecyclerAdapter(resultAPI.getSearchResults(), getApplicationContext());
                    mRecyclerView.setAdapter(adapter);
                    Log.d(TAG, "onResponse: " + "Retrofit fetch ok");

                }

                @Override
                public void onFailure(Call<ResultAPI> call, Throwable t) {

                }
            });
        } else {
            Toast.makeText(this, "Device not connected to the Internet.", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean networkCheck() {
        boolean isConnected = false;
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

        if (activeNetwork != null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                isConnected = true;
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                isConnected = true;
            }
        }

        return isConnected;
    }
}
