package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    //private ArrayList<Song> songs;
    private SongList songList;

    private class SongList {
        private ArrayList<Song> songs = new ArrayList<>();
        public boolean addSong(String title, double duration) {
            if(findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        //this.songs = new ArrayList<Song>();
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if(songList.findSong(title) == null) {
            this.songList.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
//
//    private Song findSong(String title) {
//        for(Song checkedSong: this.songs) {
//            if(checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songList.songs.size())) {
            playlist.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
