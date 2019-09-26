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

    public static void main(String[] args) {
        /**
         * testing purposes
         */
        createNewAlbum("tobiasrockyass");
        bunchOfAlbums.get(0).newSong("waterbottle", 3.40);
        bunchOfAlbums.get(0).newSong("chairpoop", 4.30);
        bunchOfAlbums.get(0).newSong("barkateveryone", 5.70);
        bunchOfAlbums.get(0).newSong("bottlecap", 10.70);
        createNewAlbum("fabio");
        bunchOfAlbums.get(1).newSong("badum", 3.40);
        bunchOfAlbums.get(1).newSong("junior", 4.30);
        bunchOfAlbums.get(1).newSong("likes", 5.70);
        bunchOfAlbums.get(1).newSong("programming", 10.70);

        createNewAlbum("first");
        bunchOfAlbums.get(2).newSong("chairpoop", 4.30);
        bunchOfAlbums.get(2).newSong("bottlecap", 10.70);
        createNewAlbum("second");
        bunchOfAlbums.get(3).newSong("waterbottle", 3.40);
        bunchOfAlbums.get(3).newSong("badum", 3.40);
        bunchOfAlbums.get(3).newSong("likes", 5.70);
        bunchOfAlbums.get(3).newSong("programming", 10.70);
        bunchOfAlbums.get(3).newSong("bottlecap", 10.70);

        bunchOfPlaylists.get(2).addSongToPlaylist("waterbottle", 3.40);
        bunchOfPlaylists.get(2).addSongToPlaylist("bottlecap", 3.40);
        bunchOfPlaylists.get(3).addSongToPlaylist("waterbottle", 3.40);
        bunchOfPlaylists.get(3).addSongToPlaylist("badum", 3.40);
        bunchOfPlaylists.get(3).addSongToPlaylist("likes", 5.70);
        bunchOfPlaylists.get(3).addSongToPlaylist("programming", 10.70);
        bunchOfPlaylists.get(3).addSongToPlaylist("bottlecap", 10.70);







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
                    System.out.print("Type name of new playlist > ");
                    playlistName = input.nextLine();
                    createNewPlayList(playlistName);
                    break;
                case 2:
                    System.out.print("Type name of new album > ");
                    albumName = input.nextLine();
                    createNewAlbum(albumName);
                    break;
                case 3:
                    createNewSong();
                    break;
                case 4:
                    System.out.print("Type name of playlist > ");
                    playlistName = input.nextLine();
                    addSongToPlaylist(playlistName);

                case 5:
                    System.out.print("Type name of playlist > ");
                    playlistName = input.nextLine();
                    if(findPlayList(playlistName) != null) {
                        int playlistIndex = bunchOfPlaylists.indexOf(findPlayList(playlistName));
                        bunchOfPlaylists.get(playlistIndex).printPlaylist();
                    } else {
                        System.out.println("Playlist " + playlistName + " not found.");
                    }
                    break;
                case 6:
                    System.out.print("Type name of album > ");
                    String albumName = input.nextLine();
                    if(findAlbum(albumName) != null) {
                        int albumIndex = bunchOfAlbums.indexOf(findAlbum(albumName));
                        bunchOfAlbums.get(albumIndex).printSongsFromAlbum();
                    } else {
                        System.out.println("Album " + albumName + " not found.");
                    }
                    break;

                case 7:
                    System.out.print("Type name of playlist to play > ");
                    playlistName = input.nextLine();
                    if(findPlayList(playlistName) != null) {
                        playPlaylist(playlistName);
                    } else {
                        System.out.println("Playlist " + playlistName + " not found.");
                    }
                    break;
                case 8:
                    printPlaylists(false);
                    break;
                case 9:
                    printPlaylists(true);
                    break;
                case 10:
                    System.out.print("Type name of playlist you want to remove song from > ");
                    playlistName = input.nextLine();
                    int playlistIndex = bunchOfPlaylists.indexOf(findPlayList(playlistName));
                    bunchOfPlaylists.get(playlistIndex).printPlaylist();
                    System.out.print("Type name of song to remove from playlist or quit to exit >");
                    songName = input.nextLine();
                    if(songName.toUpperCase().equals("QUIT")) {
                        System.out.println("Action canceled.");
                        break;
                    }
                    Playlist removeSongFromPlaylist = findPlayList(playlistName);
                    if(removeSongFromPlaylist.removeSongFromPlaylist(songName)) {
                        System.out.println("Success removing " + songName + " from " + playlistName + ".");
                    } else {
                        System.out.println("Song in " + playlistName + " not found.");
                    }
                    break;
                case 11:
                    System.out.println("Bye.");
                    quit = true;
                    break;
                default:
                    printActions();

            }
        }

    }

    private static void addSongToPlaylist(String playlistName) {
        boolean quit = false;
        Playlist playlist = findPlayList(playlistName);
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
                double duration = checkedAlbum.getDurationOfSong(songName);
                bunchOfPlaylists.get(playlistIndex).addSongToPlaylist(songName, duration);
                System.out.println("Success adding " + songName + " to playlist " + playlistName + ".");
            }
        }
        System.out.println("Finished adding songs to playlist.");
    }

    private static void createNewPlayList(String playlistName) {
        boolean quit = false;
        bunchOfPlaylists.add(new Playlist(playlistName));
        if(bunchOfPlaylists.isEmpty()) {
            System.out.println("Success adding " + playlistName + ".");
        }
        Playlist playlist = findPlayList(playlistName);
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
                double duration = checkedAlbum.getDurationOfSong(songName);
                bunchOfPlaylists.get(playlistIndex).addSongToPlaylist(songName, duration);
                System.out.println("Success adding " + songName + " to playlist " + playlistName + ".");
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
        System.out.print("Please type name of album for this song >");
        String albumName = input.nextLine(); // if i type here something that doesn't exist it crashes with nullpointerexception gotta check this
        Album album = findAlbum(albumName);
        int albumIndex = bunchOfAlbums.indexOf(album);
        double songDuration;
        if(album.getAlbumName().equals(albumName)) {
            while(!quit) {
                    System.out.print("Type name of new song or type quit to exit > \t");
                    String songName = input.nextLine();
                    if(songName.toUpperCase().equals("QUIT") || songName.toUpperCase().equals("EXIT")) {
                        quit = true;
                        System.out.println("Finished adding songs to album - " + albumName + ".");
                        break;
                    }
                    System.out.print("Please type the duration for this song >");
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
            System.out.println("Album needs to exist before creating a new song.");
        }
    }

    private static Album findAlbum(String albumName) {
        ListIterator<Album> albumsIterator = bunchOfAlbums.listIterator();
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

    private static void printPlaylists(boolean album) {
        System.out.println("======================================");
        if(album) {
            ListIterator<Album> playlistIterator = bunchOfAlbums.listIterator();
                while(playlistIterator.hasNext()) {
                    System.out.println("Album number " + (playlistIterator.nextIndex()+1) + " is called " + playlistIterator.next().getAlbumName());
                }
        } else {
            ListIterator<Playlist> playlistIterator = bunchOfPlaylists.listIterator();
            while(playlistIterator.hasNext()) {
                System.out.println("Playlist number " + (playlistIterator.nextIndex()+1) + " is called " + playlistIterator.next().getPlaylistName());
            }
        }
        System.out.println("======================================");
    }

    private static void playPlaylist(String playlist) {
        Scanner input = new Scanner (System.in);
        boolean quit = false;
        Playlist comparison = findPlayList(playlist);
        ListIterator<String> listPlaylist = comparison.getSongsPlaylist().listIterator();

        if(comparison.getSongsPlaylist().isEmpty()) { // skips first one in playlist, also cant remove songs from playlist need to fix it
            System.out.println("No songs in playlist.");
            printButtons();
            return;
        } else {
            printButtons();
        }

        while(!quit) {
            System.out.print("> ");
            int action;
            try {
                action = input.nextInt();
                input.nextLine();
                switch(action) {
                    case 1:
                        System.out.println("\n***********Playing first song " + listPlaylist.next() + ".***********\n");
                        break;

                    case 2:
                        if(goingForward) {
                            if(listPlaylist.hasPrevious()) {
                                listPlaylist.previous();
                            }
                            goingForward = false;
                        }
                        if(listPlaylist.hasPrevious()) {
                            System.out.println("\n***********Now playing " + listPlaylist.previous() + ".***********\n");
                        } else {
                            System.out.println("\n***********We are at the beginning of playlist.***********\n");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        listPlaylist.previous();
                        System.out.println("\n***********Repeating song " + listPlaylist.next() + ".***********\n");
                        break;
                    case 4:
                        if(!goingForward) {
                            if(listPlaylist.hasNext()) {
                                listPlaylist.next();
                            }
                            goingForward = true;
                        }
                        if(listPlaylist.hasNext()) {
                            System.out.println("\n***********Now playing "  + listPlaylist.next() + ".***********\n");
                        } else {
                            System.out.println("\n***********Reached end of playlist.***********\n");
                            goingForward = false;
                        }
                        break;
                    case 5:
                        quit = true;
                        System.out.println("Going back.");
                        break;
                }

            } catch (InputMismatchException exception) {
                printButtons();
                System.out.println("Please insert a valid number.");
                input.nextLine();
            }
        }


    }

    private static void printButtons() {
        System.out.println(" \t 1 - Play playlist" +
                            "\n\t 2 - Backwards." +
                            "\n\t 3 - Repeat." +
                            "\n\t 4 - Forward." +
                            "\n\t 5 - To quit.");
    }

    private static void printActions() {
        System.out.println(" \t 1 - To create new Playlist.\n" +
                            "\t 2 - To create new album.\n" +
                            "\t 3 - To create new Song.\n" +
                            "\t 4 - To add song to playlist.\n" +
                            "\t 5 - To display songs from playlist.\n" +
                            "\t 6 - To display songs from album.\n" +
                            "\t 7 - To play playlist.\n" +
                            "\t 8 - To display existing playlists.\n" +
                            "\t 9 - To display existing albums.\n" +
                            "\t 10 - To remove song from playlist.\n" +
                            "\t 11 - To quit.\n");
    }


}
