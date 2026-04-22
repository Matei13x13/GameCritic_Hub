package com.gamecritichub.gamecritic_hub.domain;

public class Game {

    private Long id;
    private String title;
    private String genre;
    private double rating;

    public Game(Long id, String title, String genre, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
}