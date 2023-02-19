package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CinemaManagerTest {
    @Test
    public void test() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        CinemaManager manager = new CinemaManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast5() {
        CinemaManager manager = new CinemaManager(5);

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void FindLast11() {
        CinemaManager manager = new CinemaManager(11);

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void FindLast10() {
        CinemaManager manager = new CinemaManager(10);

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


