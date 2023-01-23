package ru.netology.billboard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {
    MoviePosterManager manager = new MoviePosterManager();

    String movie1 = "Bloodshot";
    String movie2 = "Onward";
    String movie3 = "Hotel Belgrade";
    String movie4 = "The Gentlemen";
    String movie5 = "The Invisible Man";
    String movie6 = "Trolls World Tour";
    String movie7 = "Number One";
    String movie8 = "Avatar";
    String movie9 = "The Terminator";
    String movie10 = "The Matrix";

    @BeforeEach
    public void setup() {

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
    }

    @Test
    public void shouldAddMovies() {

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddMoviesInReverseOrder() {

        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
