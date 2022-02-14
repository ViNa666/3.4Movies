package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerNonEmptyTest {

    @Test
    public void shouldAdd() {

        Movie movie1 = new Movie("Бладшот", ",боевик");
        Movie movie2 = new Movie("Вперед", "Мультфильм");
        Movie movie3 = new Movie("Отель Белград", "Комедия");

        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);

        manager.add(movie3);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{movie1, movie2, movie3};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAll() {
        Movie movie1 = new Movie("Бладшот", ",боевик");
        Movie movie2 = new Movie("Вперед", "Мультфильм");
        Movie movie3 = new Movie("Отель Белград", "Комедия");
        Movie movie4 = new Movie("Джентльмены", "Боевик");
        Movie movie5 = new Movie("Человек-невидимка", "Ужасы");
        Movie movie6 = new Movie("Тролли.Мировой тур", "Мультфильм");
        Movie movie7 = new Movie("Номер один", "Комедия");

        Movie[] movie = new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        MovieManager manager = new MovieManager(movie, 10);
        Movie[] actual = manager.findAll();
        Movie[] expected = movie;

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMovieLengthMoreThenLast() {
        Movie movie1 = new Movie("Бладшот", ",боевик");
        Movie movie2 = new Movie("Вперед", "Мультфильм");
        Movie movie3 = new Movie("Отель Белград", "Комедия");
        Movie movie4 = new Movie("Джентльмены", "Боевик");
        Movie movie5 = new Movie("Человек-невидимка", "Ужасы");
        Movie movie6 = new Movie("Тролли.Мировой тур", "Мультфильм");
        Movie movie7 = new Movie("Номер один", "Комедия");

        Movie[] movie = new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        MovieManager manager = new MovieManager(movie, 5);
        Movie[] actual = manager.findLast();
        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastIfMovieLengthLessThenLast() {
        Movie movie1 = new Movie("Бладшот", ",боевик");
        Movie movie2 = new Movie("Вперед", "Мультфильм");
        Movie movie3 = new Movie("Отель Белград", "Комедия");
        Movie movie4 = new Movie("Джентльмены", "Боевик");
        Movie movie5 = new Movie("Человек-невидимка", "Ужасы");
        Movie movie6 = new Movie("Тролли.Мировой тур", "Мультфильм");
        Movie movie7 = new Movie("Номер один", "Комедия");

        Movie[] movie = new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        MovieManager manager = new MovieManager(movie, 10);
        Movie[] actual = manager.findLast();
        Movie[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(actual, expected);
    }
}