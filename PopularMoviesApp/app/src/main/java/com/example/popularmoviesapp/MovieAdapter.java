package com.example.popularmoviesapp;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {
    public MovieAdapter(Context context, ArrayList<Movie> movies) {
        super(context, 0, movies);
    }

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View movieView = convertView;
        if(movieView == null){
            movieView = LayoutInflater.from(getContext()).inflate(R.layout.movie_list_item, parent, false);
        }
        Movie movie = getItem(position);
        TextView titleTextView = movieView.findViewById(R.id.movie_title);
        titleTextView.setText(movie.getMovieTitle());
        TextView ratingTextView = movieView.findViewById(R.id.rating);
        ratingTextView.setText(movie.getMovieRating());
        TextView descriptionTextView = movieView.findViewById(R.id.description);
        descriptionTextView.setText(movie.getMovieDescription());
        TextView releaseDateTextView = movieView.findViewById(R.id.release_date);
        releaseDateTextView.setText(movie.getMovieReleaseDate());

        ImageView moviePosterImageView = movieView.findViewById(R.id.movie_poster);
        Picasso.get()
                .load(movie.getMoviePoster())
                .into(moviePosterImageView);
        return movieView;
    }
}
