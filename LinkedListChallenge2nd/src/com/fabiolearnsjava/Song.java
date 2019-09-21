package com.fabiolearnsjava;

public class Song {
    private String title;
    private Double duration;
    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getSong() {
        return this.title;
    }

}
