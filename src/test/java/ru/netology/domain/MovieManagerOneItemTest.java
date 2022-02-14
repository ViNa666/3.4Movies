package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerOneItemTest {
    @Test
    public void shouldAdd() {
        Movie movie1 = new Movie("Бладшот", ",боевик");
        Movie movie2 = new Movie("Вперед", "Мультфильм");

        MovieManager manager = new MovieManager();
        manager.add(movie1);

        manager.add(movie2);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{movie1, movie2};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindAll() {
        Movie movie1 = new Movie("Бладшот", ",боевик");

        MovieManager manager = new MovieManager();
        manager.add(movie1);

        Movie[] actual = manager.findAll();
        Movie[] expected = new Movie[]{movie1};

        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldFindLast() {
        Movie movie1 = new Movie("Бладшот", ",боевик");

        MovieManager manager = new MovieManager();
        manager.add(movie1);

        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{movie1};

        assertArrayEquals(actual, expected);
    }

}