package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private String albumName;
    private String playlistName;
    private ArrayList<Album> albumsList;
    private LinkedList<String> songsPlaylist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.albumName = playlistName;
        this.songsPlaylist = new LinkedList<>();
    }

    public Playlist(String albumName, boolean album) {
        this.playlistName = albumName;
        this.albumName = albumName;
        this.albumsList = new ArrayList<Album>();
        this.albumsList.add(new Album(albumName));
        this.songsPlaylist = new LinkedList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<String> getSongsPlaylist() {
        return songsPlaylist;
    }

    public boolean addAlbum(String albumName) {
        if(findAlbum(albumName) == null) {
            this.albumsList.add(new Album(albumName));
            return true;
        }

        return false;
    }


    public void addSongToPlaylist(String songName, double duration) {
        this.songsPlaylist.add(songName);// just need this I think, since I alreaddy validate if the album exists before
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

    public Album findAlbumBySong(String songName, LinkedList<Album> bunchOfAlbums) {
        String checkedSong;
        for(int i = 0; i<bunchOfAlbums.size(); i++) {
            Album checkedAlbum = bunchOfAlbums.get(i);
            copyListToArrayList(bunchOfAlbums);
            checkedSong = checkedAlbum.searchSong(songName, this.albumsList);
            if(checkedSong != null) {
                return checkedAlbum;
            }
        }
        System.out.println("Song " + songName + " doesn't have an Album yet, create an album for it first.");
        return null;
    }

    private void copyListToArrayList(LinkedList<Album> bunchOfAlbums) {
        ListIterator<Album> albumListIterator = bunchOfAlbums.listIterator();
        this.albumsList = new ArrayList<Album>();
        while(albumListIterator.hasNext()) {
            this.albumsList.add(albumListIterator.next());
        }
    }

    // this probably can be deleted
    public Album findAlbumBySong(String songName) {
        for(int i = 0; i<this.albumsList.size(); i++) {
            Album checkedAlbum = this.albumsList.get(i);
            if(checkedAlbum.searchSong(songName.toUpperCase()).toUpperCase().equals(albumName)) {
                System.out.println("Success adding " + songName + " to playlist.");
                return checkedAlbum;
            }
        }
        System.out.println("Song " + songName + " doesn't have an Album yet, create an album for it first.");
        return null;
    }

    public void printPlaylist() {
        ListIterator<String> songIterator = this.songsPlaylist.listIterator();
        System.out.println("======================================");
        while(songIterator.hasNext()) {
            System.out.println("Song number " + (songIterator.nextIndex()+1) + " is called " + songIterator.next());
        }
        System.out.println("======================================");
    }




    public boolean removeSongFromPlaylist(String song) {
        ListIterator<String> songIterator = this.songsPlaylist.listIterator();
        while(songIterator.hasNext()) {
            int index = songIterator.nextIndex();
            if(songIterator.next().toUpperCase().equals(song.toUpperCase())) {
               songsPlaylist.remove(index);
               return true;
            }
        }
        return false;
    }




}
