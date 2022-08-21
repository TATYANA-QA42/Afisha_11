package ru.netology;

public class ManagerAfisha {
    private String[] Movies = new String[0];
    private int limit;

    public ManagerAfisha(int limit) {
        this.limit = limit;
    }

    public ManagerAfisha() {
        limit = 10;
    }

    public void addMovies(String movie) {
        String[] tmp = new String[Movies.length + 1];
        for (int i = 0; i < Movies.length; i++) {
            tmp[i] = Movies[i];
        }
        tmp[tmp.length - 1] = movie;
        Movies = tmp;
    }

    public String[] findAll() {
        return Movies;
    }

    public String[] findLast() {
        int length;
        if (Movies.length < limit) {
            length = Movies.length;
        } else {
            length = limit;
        }
        String[] tmp = new String[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Movies[Movies.length - 1 - i];
        }
        return tmp;
    }

}
