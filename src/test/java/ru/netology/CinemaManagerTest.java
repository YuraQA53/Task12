package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CinemaManagerTest {

    @Test
    public void FindListOllMovies() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void FindLimitMovies() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");
        manager.add("Фильм 7");
        manager.add("Фильм 8");
        manager.add("Фильм 9");
        manager.add("Фильм 10");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4", "Фильм 5", "Фильм 6", "Фильм 7", "Фильм 8", "Фильм 9", "Фильм 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindArrayLongerThanLimit() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");
        manager.add("Фильм 7");
        manager.add("Фильм 8");
        manager.add("Фильм 9");
        manager.add("Фильм 10");
        manager.add("Фильм 11");


        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4", "Фильм 5", "Фильм 6", "Фильм 7", "Фильм 8", "Фильм 9", "Фильм 10", "Фильм 11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindMoviesInReverseOrder() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");


        String[] expected = {"Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindLengthArrayInReverseOrder() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");
        manager.add("Фильм 7");
        manager.add("Фильм 8");
        manager.add("Фильм 9");
        manager.add("Фильм 10");



        String[] expected = { "Фильм 10", "Фильм 9", "Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindOverLimitInReverseOrder() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");
        manager.add("Фильм 7");
        manager.add("Фильм 8");
        manager.add("Фильм 9");
        manager.add("Фильм 10");
        manager.add("Фильм 11");
        manager.add("Фильм 12");

        String[] expected = {"Фильм 12", "Фильм 11", "Фильм 10", "Фильм 9", "Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
