package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerEmptyTest {
    @Test
    public void shouldAdd() {

        Movie movie1 = new Movie("Бладшот", ",боевик");

        MovieManager manager = new MovieManager();
        manager.add(movie1);


        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{movie1};

        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindAll() {
        MovieManager manager = new MovieManager();

        Movie[]actual = manager.findAll();
        Movie[] expected = {};

        assertArrayEquals(actual, expected);

    }
    @Test
    public void shouldFindLast() {
        MovieManager manager = new MovieManager();

        Movie[]actual = manager.findLast();
        Movie[] expected = {};

        assertArrayEquals(actual, expected);

    }

}
