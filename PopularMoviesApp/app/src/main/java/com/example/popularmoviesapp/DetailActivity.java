package com.example.popularmoviesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String MOVIE_TITLE = "movie_title";
    public static final String RELEASE_DATE = "release_date";
    public static final String MOVIE_RATING = "movie_rating";
    public static final String DESCRIPTION = "description";
    public static final String MOVIE_POSTER = "movie_poster";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView posterImageView = findViewById(R.id.movie_poster);

        String movieTitle = getIntent().getExtras().getString(MOVIE_TITLE);
        String releaseDate = getIntent().getExtras().getString(RELEASE_DATE);
        String movieRating = getIntent().getExtras().getString(MOVIE_RATING);
        String description = getIntent().getExtras().getString(DESCRIPTION);
        String moviePoster = getIntent().getExtras().getString(MOVIE_POSTER);

        Movie chosenMovie = new Movie(movieTitle, releaseDate, movieRating, description, moviePoster);

        if (chosenMovie == null) {
            closeOnError();
            return;
        }
        populateUI(chosenMovie);
        Picasso.get()
                .load(chosenMovie.getMoviePoster())
                .into(posterImageView);

    }
    private void closeOnError() {
        finish();
    }
    private void populateUI(Movie movie){

        TextView titleTextView = findViewById(R.id.movie_title);
        titleTextView.setText(movie.getMovieTitle());
        TextView releaseDateTextView = findViewById(R.id.release_date);
        releaseDateTextView.setText(movie.getMovieReleaseDate());
        TextView ratingTextView = findViewById(R.id.rating);
        ratingTextView.setText(movie.getMovieRating());
        TextView descriptionTextView = findViewById(R.id.description);
        descriptionTextView.setText(movie.getMovieDescription());
    }
}
