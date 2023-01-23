package ru.netology.billboard;

public class MoviePosterManager {

    private String[] movies = new String[0];
    private int limit = 10;

    public MoviePosterManager() {

    }
    public MoviePosterManager(int limit) {
        if (limit > 0) {
            this.limit = limit;
        }
    }

    public void addMovie(String movie) {
        String[] add = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            add[i] = movies[i];
        }
        add[add.length - 1] = movie;
        movies = add;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] reversed = new String[resultLength];


        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length -1 -i];
        }
        return reversed;
    }
}