package com.fabiolearnsjava;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

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
        /**
         * testing purposes
         */
        createNewAlbum("tobiasrockyass");
        bunchOfAlbums.get(0).newSong("waterbottle", 3.40);
        bunchOfAlbums.get(0).newSong("chairpoop", 4.30);
        bunchOfAlbums.get(0).newSong("barkateveryone", 5.70);
        bunchOfAlbums.get(0).newSong("bottlecap", 10.70);
        /**
         * End of testing
         */

        if(bunchOfPlaylists.isEmpty()) {
            System.out.println("No playlists added");
        }
        if(bunchOfAlbums.isEmpty()) {
            System.out.println("No albums or songs added");
        }
        printActions();
        while(!quit) {
            System.out.print("> ");
            int action = 0;
            if(input.hasNextInt()) {
                action = input.nextInt();
            }
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
                    System.out.println("Type name of playlist.");
                    playlistName = input.nextLine();
                    if(findPlayList(playlistName) != null) {
                        int playlistIndex = bunchOfPlaylists.indexOf(findPlayList(playlistName));
                        bunchOfPlaylists.get(playlistIndex).printPlaylist();
//                        Playlist comparison = findPlayList(playlistName);
//                        comparison.printPlaylist();
                    } else {
                        System.out.println("Playlist " + playlistName + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("Type name of album.");
                    String albumName = input.nextLine();
                    if(findAlbum(albumName) != null) {
                        int albumIndex = bunchOfAlbums.indexOf(findAlbum(albumName));
                        bunchOfAlbums.get(albumIndex).printSongsFromAlbum();
                    } else {
                        System.out.println("Album " + albumName + " not found.");
                    }
                    break;

                case 6:
                    System.out.println("Type name of playlist to play.");
                    playlistName = input.nextLine();
                    if(findPlayList(playlistName) != null) {
                        playPlaylist(playlistName); // last thing i've made but the number of the song just outputs memory address
                    } else {
                        System.out.println("Playlist " + playlistName + " not found.");
                    }
                    break;
                case 9:
                    System.out.println("Type name of playlist you want to remove song from.");
                    playlistName = input.nextLine();
                    System.out.println("Type name of song to remove from playlist");
                    songName = input.nextLine();
                    Playlist removeSongFromPlaylist = findPlayList(playlistName);
                    removeSongFromPlaylist.removeSongFromPlaylist(songName);
                    break;
                case 10:
                    System.out.println("Bye.");
                    quit = true;
                    break;
                default:
                    printActions();

            }
        }

    }

    private static void createNewPlayList(String playlistName) {
        boolean quit = false;
        bunchOfPlaylists.add(new Playlist(playlistName));
        if(bunchOfPlaylists.isEmpty()) {
            System.out.println("Success adding " + playlistName + ".");
        }
        Playlist playlist = findPlayList(playlistName); // if i create a new one it inserts into the first one, also if i create another playlist I can't call the second playlist to print
        int playlistIndex = bunchOfPlaylists.indexOf(playlist);
        while(!quit) {
            System.out.print("Please type name of song to add to playlist or quit to exit: ");
            String songName = input.nextLine();
            if(songName.toUpperCase().equals("QUIT")) {
                quit = true;
                break;
            }
            Album checkedAlbum = bunchOfPlaylists.get(playlistIndex).findAlbumBySong(songName, bunchOfAlbums);
            if(checkedAlbum != null) {
                //if(bunchOfPlaylists.get(playlistIndex).addSongToPlaylist(songName)) { // don't need this since I already check if album exists I think
                    double duration = checkedAlbum.getDurationOfSong(songName);
                    bunchOfPlaylists.get(playlistIndex).addSongToPlaylist(songName, duration);
                    System.out.println("Success adding " + songName + " to playlist " + playlistName + ".");//was here trying to create playlist
                //}
            }
        }
        System.out.println("Finished adding songs to playlist.");



    }

    private static void createNewAlbum(String albumName) {
        bunchOfAlbums.add(new Album(albumName));
        bunchOfPlaylists.add(new Playlist(albumName, true));
    }

    private static void createNewSong() {
        boolean quit = false;
        System.out.println("Please type name of album for this song.");
        String albumName = input.nextLine(); // if i type here something that doesn't exist it crashes with nullpointerexception gotta check this
        Album album = findAlbum(albumName);
        int albumIndex = bunchOfAlbums.indexOf(album);
        double songDuration;
        if(album.getAlbumName().equals(albumName)) {
            while(!quit) {
                    System.out.print("Type name of new song or type quit to exit - \t");
                    String songName = input.nextLine();
                    if(songName.toUpperCase().equals("QUIT") || songName.toUpperCase().equals("EXIT")) {
                        quit = true;
                        System.out.println("Finished adding songs to album - " + albumName + ".");
                        break;
                    }
                    System.out.println("Please type the duration for this song.");
                    boolean success = false;
                    while(!success) {
                        try {
                            songDuration = input.nextDouble();
                            input.nextLine();
                            if(album.searchSong(songName) == null) {
                                bunchOfAlbums.get(albumIndex).newSong(songName, songDuration);
                                System.out.println("Song added to " + albumName);
                                success = true;
                            }
                        } catch(InputMismatchException exception) {
                            System.out.println("Please enter a real value.");
                            input.nextLine();
                        }

                    }
            }
        } else{
            System.out.println("Album needs to exist before creating a new song");
        }
    }

    private static Album findAlbum(String albumName) {
        ListIterator<Album> albumsIterator = bunchOfAlbums.listIterator();
        int indexAlbum = bunchOfAlbums.indexOf(albumName);
        while(albumsIterator.hasNext()) {
            Album comparison = albumsIterator.next();
            if(comparison.getAlbumName().toUpperCase().equals(albumName.toUpperCase())) {
                return comparison;
            }

        }
        return null;
    }


    private static Playlist findPlayList(String playlistName) {
        ListIterator<Playlist> playlistIterator = bunchOfPlaylists.listIterator();
        while(playlistIterator.hasNext()) {
            Playlist comparison = playlistIterator.next();
            if(comparison.getPlaylistName().toUpperCase().equals(playlistName.toUpperCase())) {
                return comparison;
            }
        }
        return null;
    }

    private static void playPlaylist(String playlist) {
        Scanner input = new Scanner (System.in);
        boolean quit = false;
        Playlist comparison = findPlayList(playlist);
        ListIterator<String> listPlaylist = comparison.getSongsPlaylist().listIterator();

        if(comparison.getSongsPlaylist().isEmpty()) {
            System.out.println("No songs in playlist.");
            return;
        } else {
            System.out.println("Now playing " + listPlaylist.next());
            printButtons();
        }

        while(!quit) {
            int action = input.nextInt();
            input.nextLine();
            switch(action) {
                case 1:
                    if(goingForward) {
                        if(listPlaylist.hasPrevious()) {
                            listPlaylist.previous();
                        }
                        goingForward = false;
                    }
                    if(listPlaylist.hasPrevious()) {
                        System.out.println("Now playing " + listPlaylist.previous());
                    } else {
                        System.out.println("We are at the beginning of playlist.");
                        goingForward = true;
                    }
                    break;
                case 2:
                    if(listPlaylist.hasNext()) {
                        listPlaylist.next();
                        listPlaylist.previous();
                    } else {
                        listPlaylist.previous();
                        listPlaylist.next();
                    }
                    break;
                case 3:
                    if(!goingForward) {
                        if(listPlaylist.hasNext()) {
                            listPlaylist.next();
                        }
                        goingForward = true;
                    }
                    if(listPlaylist.hasNext()) {
                        System.out.println("Now playing "  + listPlaylist.next());
                    } else {
                        System.out.println("Reached end of playlist");
                        goingForward = false;
                    }
                    break;
                case 4:
                    quit = true;
                    System.out.println("Going back.");
                    break;
            }
        }


    }

    private static void printButtons() {
        System.out.println(" \n\t 1 - Backwards." +
                            "\n\t 2 - Repeat." +
                            "\n\t 3 - Forward." +
                            "\n\t 4 - To quit.");
    }

    private static void printActions() {
        System.out.println(" \t 1 - To create new Playlist.\n" +
                            "\t 2 - To create new album.\n" +
                            "\t 3 - To create new Song.\n" +
                            "\t 4 - To display songs from playlist.\n" +
                            "\t 5 - To display songs from album.\n" +
                            "\t 6 - To play playlist.\n" +
                            "\t 9 - To remove song from playlist.\n" +
                            "\t 10 - To quit.\n");
    }


}
