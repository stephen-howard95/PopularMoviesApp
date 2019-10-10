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
    public static final int MOVIE_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        //TODO Make a separate service request to the following URL in Detail Activity. https://api.themoviedb.org/3/movie/{movie_id}?api_key={API_KEY}&append_to_response=videos,reviews
        //Allowed values=trailer*********************???????????????

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView posterImageView = findViewById(R.id.movie_poster);

        String movieTitle = getIntent().getExtras().getString(MOVIE_TITLE);
        String releaseDate = getIntent().getExtras().getString(RELEASE_DATE);
        String movieRating = getIntent().getExtras().getString(MOVIE_RATING);
        String description = getIntent().getExtras().getString(DESCRIPTION);
        String moviePoster = getIntent().getExtras().getString(MOVIE_POSTER);
        int movieId = getIntent().getExtras().getInt(String.valueOf(MOVIE_ID));
        //If i just pass in the ID from the Main activity, then detail activity can turn into a service call from the new URL, taking in the ID
        //and setting it equal to a variable that will get appended to the new URL. So now I have the URL, but how to extract the JSON data??

        Movie chosenMovie = new Movie(movieTitle, releaseDate, movieRating, description, moviePoster, movieId);

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
