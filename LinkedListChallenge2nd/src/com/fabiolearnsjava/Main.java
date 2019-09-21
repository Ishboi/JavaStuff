package com.fabiolearnsjava;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static String playlistName;
    private static String albumName;
    private static String songName;
    private static LinkedList<Playlist> bunchOfPlaylists = new LinkedList<Playlist>();
    private static LinkedList<Album> bunchOfAlbums = new LinkedList<Album>();
    private static boolean quit = false;
    private static boolean goingForward = true;
    private static ListIterator<Playlist> playlistIterator = bunchOfPlaylists.listIterator();
    private static ListIterator<Album> albumIterator = bunchOfAlbums.listIterator();

    public static void main(String[] args) {
        ListIterator<Playlist> listIterator = bunchOfPlaylists.listIterator();
        ListIterator<Album> albumIterator = bunchOfAlbums.listIterator();

        if(bunchOfPlaylists.isEmpty()) {
            System.out.println("No playlists added");
        } else if(bunchOfAlbums.isEmpty()) {
            System.out.println("No albums or songs added");
        }
        while(!quit) {
            int action = input.nextInt();
            input.nextLine();
            switch(action) {
                case 1:
                    System.out.print("Type name of new playlist: ");
                    playlistName = input.nextLine();
                    createNewPlayList(playlistName);
                    break;
                case 2:
                    System.out.println("Type name of new album");
                    albumName = input.nextLine();
                    createNewAlbum(albumName);
                    break;
                case 3:
                    createNewSong();
                    break;
                case 4:
                    System.out.println("Bye.");
                    quit = true;
                    break;

            }
        }

    }

    private static void createNewPlayList(String playlistName) {
        bunchOfPlaylists.add(new Playlist(playlistName));

    }

    private static void createNewAlbum(String albumName) {
        bunchOfAlbums.add(new Album(albumName));
    }

    private static void createNewSong() {
        boolean quit = false;
        System.out.println("Please type name of album for this song.");
        String albumName = input.nextLine();
        Album album = findAlbum(albumName);
        if(album.getAlbumName().equals(albumName)) {
            while(!quit) {
                    System.out.print("Type name of new song - ");
                    String songName = input.nextLine();
                if(songName.equals("QUIT")) {
                    quit = true;
                    break;
                }
                    LinkedList<String> bunchOfSongs = new ALbum //estava aqui a tentar entender como criar um conjunto de novas músicas e adicionar elas ao albúm
                    System.out.println("Song added to " + albumName);
            }
        } else{
            System.out.println("Album needs to exist before creating a new song");
        }
    }

    private static Album findAlbum(String albumName) {
        while(playlistIterator.hasNext()) {
            Album comparison = playlistIterator.next().findAlbum(albumName);
            if(comparison.getAlbumName().equals(albumName)) {
                return comparison;
            }

        }
        return null;
    }

    private static boolean findSongs

    private void printActions() {
        System.out.println(" \n\t 1 - To create new Playlist." +
                            "\n\t 2 - To create new album." +
                            "\n\t 3 - To create new Song." +
                            "\n\t 4 - To quit.");
    }

    private void (int action) {
        switch(action) {
            case 1:
                System.out.println("\nName")
        }
    }

}
