package com.fabiolearnsjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private LinkedList<Song> songs;
    private String albumName;
    public ArrayList<Album> albumsList;

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

    public double getDurationOfSong(String songName) {
        if(songs.isEmpty()) {
            System.out.println("Currently no songs found.");
            return -1.0;
        }
        ListIterator<Song> songListIterator = songs.listIterator();
        boolean songFound = false;
        while(songListIterator.hasNext()) {
            if(songListIterator.next().getSong().toUpperCase().equals(songName.toUpperCase())) {
                double duration = songListIterator.previous().getDuration();
                return duration;
            }
        }
        return -1.0;
    }


    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean newSong(String name, double duration) {
        if(searchSong(name) == null) {
            this.songs.add(new Song(name, duration));
            return true;
        } else {
            return false;
        }

    }

    public String searchSong(String songName, ArrayList<Album> albums) {
        if(songs.isEmpty()) {
            System.out.println("Currently no songs found.");
            return null;
        }
        ListIterator<Song> songListIterator = songs.listIterator();
        boolean songFound = false;

        for(int i = 0; i < albums.size(); i++) {
            Album currentAlbum = albums.get(i);
            for(int j = i; j <songs.size(); j++) {
                if(songs.get(j).getSong().toUpperCase().equals(songName.toUpperCase())) {
                    return songName;
                }

            }
        }
        return null;
    }

    public String searchSong(String songName) {
        if(songs.isEmpty()) {
            System.out.println("Currently no songs found.");
            return null;
        }
        ListIterator<Song> songListIterator = songs.listIterator();
        boolean songFound = false;
        while(songListIterator.hasNext()) {
            if(songListIterator.next().equals(songName)) {
                System.out.println("Song " + songName + " was found.");
                return songName;
            }
        }
        return null;
    }

    public void printSongsFromAlbum() {
        ListIterator<Song> songIterator = this.songs.listIterator();
        System.out.println("======================================");
        while(songIterator.hasNext()) {
            System.out.println("Song number " + (songIterator.nextIndex()+1) + " is called " + songIterator.next().getSong());
        }
        System.out.println("======================================");
    }


    /**
     * Didn't actually needed to use this one still since there is the option for an object to give object.indexof()
     * @param albumName
     * @return
     */
    public int indexOfAlbum(String albumName) {
        for(int i = 0; i<albumsList.size(); i++) {
            if(albumsList.get(i).getAlbumName().equals(albumName)) {
                return i;
            }
        }
        return -1;

    }


}
