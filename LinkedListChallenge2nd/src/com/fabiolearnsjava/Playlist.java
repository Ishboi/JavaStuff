package com.fabiolearnsjava;

import java.util.ArrayList;

public class Playlist {

    private String albumName;
    private String playlistName;
    private ArrayList<Album> albumsList;
    private ArrayList<String> songsPlaylist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.albumsList = new ArrayList<Album>();
    }

    public boolean addAlbum(String albumName) {
        if(findAlbum(albumName) == null) {
            this.albumsList.add(new Album(albumName));
            return true;
        }

        return false;
    }

    public boolean addSong(String albumName, String songName, double duration) {
        Album album = findAlbum(albumName);
        if(album == null) {
            return album.newSong(songName, duration);
        }
        return false;
    }

    public Album findAlbum(String albumName) {
        albumName.toUpperCase();
        for(int i = 0; i<this.albumsList.size(); i++) {
            Album checkedAlbum = this.albumsList.get(i);
            if(checkedAlbum.getAlbumName().toUpperCase().equals(albumName)) {
                return checkedAlbum;
            }
        }
        return null;
    }




}
