
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void ShouldFindAll() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindIfNone() {
        MoviesManager manager = new MoviesManager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindIfOne() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie 2");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLast() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastIfLessFive() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastIfMoreFive() {
        MoviesManager manager = new MoviesManager(6);


        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void ShouldFindLastIfOne() {
        MoviesManager manager = new MoviesManager();

        manager.add("Movie 1");



        String[] actual = manager.findLast();
        String[] expected = {"Movie 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastIfMoreFiveLimit() {
        MoviesManager manager = new MoviesManager();


        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");



        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastIfMoreSixLimit() {
        MoviesManager manager = new MoviesManager(6);


        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");



        String[] actual = manager.findLast();
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3","Movie 2"};
        Assertions.assertArrayEquals(expected, actual);

    }

}
