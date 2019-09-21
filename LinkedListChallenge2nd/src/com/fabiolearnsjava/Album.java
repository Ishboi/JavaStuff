package com.fabiolearnsjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private LinkedList<Song> songs;
    private String albumName;
    private ArrayList<Album> albumsList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new LinkedList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }


    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean newSong(String name, double duration) {
        if(searchSong(name, this.songs)) {
            this.songs.add(new Song(name, duration));
            return true;
        } else {
            return false;
        }

    }

    public boolean searchSong(String songName, LinkedList<Song> songs) {
        if(songs.isEmpty()) {
            System.out.println("Currently no songs found.");
            return false;
        }
        ListIterator<Song> songListIterator = songs.listIterator();
        boolean songFound = false;
        while(songListIterator.hasNext()) {
            if(songListIterator.next().equals(songName)) {
                System.out.println("Song " + songName + " found.");
                return true;
            }
        }
        return false;
    }


}
