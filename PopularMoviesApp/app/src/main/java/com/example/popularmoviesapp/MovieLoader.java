package com.example.popularmoviesapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class MovieLoader extends AsyncTaskLoader<List<Movie>> {
    private String mUrl;

    public MovieLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
    }

    //This is on a background thread
    @Override
    public List<Movie> loadInBackground(){
        if(mUrl == null){
            return null;
        }
        List<Movie> movies = JsonUtils.fetchMovieData(mUrl);
        return movies;
    }
}
