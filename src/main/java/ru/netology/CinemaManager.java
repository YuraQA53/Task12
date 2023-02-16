package ru.netology;

public class CinemaManager {

    private String[] cinema = new String[0];
    private int limit;

    public CinemaManager() {
        this.limit = 10;
    }

    public CinemaManager(int limit) {
        this.limit = limit;
    }

    public void add(String post) {
        String[] tmp = new String[cinema.length + 1];
        for (int i = 0; i < cinema.length; i++) {
            tmp[i] = cinema[i];
        }
        tmp[tmp.length - 1] = post;
        cinema = tmp;
    }

    public String[] findAll() {
        return cinema;
    }

    public String[] findLast() {
        int resultLength;
        if (cinema.length < limit) {
            resultLength = cinema.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = cinema[cinema.length - 1 - i];
        }
        return tmp;
    }
}




