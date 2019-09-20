package com.example.popularmoviesapp;

public class Movie {
    private String mMovieTitle;
    private String mMovieReleaseDate;
    private String mMovieRating;
    private String mMovieDescription;
    private String mMoviePoster;

    public Movie(String movieTitle, String movieReleaseDate, String movieRating, String movieDescription, String moviePoster){
        mMovieTitle = movieTitle;
        mMovieReleaseDate = movieReleaseDate;
        mMovieRating = movieRating;
        mMovieDescription = movieDescription;
        mMoviePoster = moviePoster;
    }
    public Movie(String movieTitle, String moviePoster){
        mMovieTitle = movieTitle;
        mMoviePoster = moviePoster;
    }
    public Movie(){

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
}
