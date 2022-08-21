package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerAfishaTest {
    ManagerAfisha afisha = new ManagerAfisha();

    @Test
    public void testAdd() {
        afisha.addMovies("Cinema 1");
        afisha.addMovies("Cinema 2");
        afisha.addMovies("Cinema 3");
        afisha.addMovies("Cinema 4");
        String[] expected = {"Cinema 1", "Cinema 2", "Cinema 3", "Cinema 4"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        afisha.addMovies("Cinema 1");
        afisha.addMovies("Cinema 2");
        afisha.addMovies("Cinema 3");
        afisha.addMovies("Cinema 4");
        String[] expected = {"Cinema 4", "Cinema 3", "Cinema 2", "Cinema 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    ManagerAfisha afisha2 = new ManagerAfisha(12);

    @Test
    public void testFindLast2() {
        afisha2.addMovies("Cinema 1");
        afisha2.addMovies("Cinema 2");
        afisha2.addMovies("Cinema 3");
        afisha2.addMovies("Cinema 4");
        afisha2.addMovies("Cinema 5");
        afisha2.addMovies("Cinema 6");
        afisha2.addMovies("Cinema 7");
        afisha2.addMovies("Cinema 8");
        afisha2.addMovies("Cinema 9");
        afisha2.addMovies("Cinema 10");
        afisha2.addMovies("Cinema 11");
        afisha2.addMovies("Cinema 12");
        String[] expected = {"Cinema 12", "Cinema 11", "Cinema 10", "Cinema 9", "Cinema 8", "Cinema 7", "Cinema 6", "Cinema 5", "Cinema 4", "Cinema 3", "Cinema 2", "Cinema 1"};
        String[] actual = afisha2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
