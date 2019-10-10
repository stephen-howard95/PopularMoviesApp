package com.example.popularmoviesapp;

public class Movie {
    private String mMovieTitle;
    private String mMovieReleaseDate;
    private String mMovieRating;
    private String mMovieDescription;
    private String mMoviePoster;
    private int mMovieId;

    public Movie(String movieTitle, String movieReleaseDate, String movieRating, String movieDescription, String moviePoster, int movieId){
        mMovieTitle = movieTitle;
        mMovieReleaseDate = movieReleaseDate;
        mMovieRating = movieRating;
        mMovieDescription = movieDescription;
        mMoviePoster = moviePoster;
        mMovieId = movieId;
    }

    public String getMovieTitle(){
        return mMovieTitle;
    }
    public String getMovieReleaseDate(){
        return mMovieReleaseDate;
    }
    public String getMovieRating(){
        return mMovieRating;
    }
    public String getMovieDescription(){
        return mMovieDescription;
    }
    public String getMoviePoster(){
        return mMoviePoster;
    }
    public int getMovieId(){
        return mMovieId;
    }
}
