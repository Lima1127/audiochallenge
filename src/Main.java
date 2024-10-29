import br.com.sun.mysongs.model.Audio;
import br.com.sun.mysongs.model.Podcasts;
import br.com.sun.mysongs.model.Songs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Podcasts podcasts = new Podcasts();
        Songs songs = new Songs();
        Audio audio = new Audio();
        boolean loop = true;
        System.out.println(" Welcome!");

        while (loop){
            System.out.println("""
                    
                    What kind of service do you want to access?
                    1 - Audios
                    2 - Podcasts
                    3 - Songs
                    4 - Exit
                    
                    """);
            int serviceOption = sc.nextInt();
            if (serviceOption == 1){
                String audioTitle = audio.getTitle();
                if (audioTitle == null){
                    System.out.println("What's the audio's title?");
                    sc.nextLine();
                    audio.setTitle(sc.nextLine());
                }
                audio.displayActionsOptions();
                int actionOption = sc.nextInt();
                if (actionOption == 1){
                    audio.play();
                } else if (actionOption == 2) {
                    audio.like();
                } else if (actionOption == 3) {
                    audio.showInfo();
                } else {
                    System.out.println("Invalid Information.");
                }

            } else if (serviceOption == 2) {
                String podcastTitle = podcasts.getHost();
                String podcastDescription = podcasts.getDescription();
                if (podcastTitle == null){
                    System.out.println("What's the Podcast's Host?");
                    sc.nextLine();
                    podcasts.setHost(sc.nextLine());
                }
                if (podcastDescription == null){
                    System.out.println("What's the Podcast's description?");
                    podcasts.setDescription(sc.nextLine());

                }

                podcasts.displayActionsOptions();
                int actionOption = sc.nextInt();

                if (actionOption == 1){
                    podcasts.play();
                } else if (actionOption == 2) {
                    podcasts.like();
                } else if (actionOption == 3) {
                    podcasts.showInfo();
                } else if (actionOption == 4) {
                    podcasts.showOwnerData();
                } else {
                    System.out.println("Invalid Information.");
                }

            } else if (serviceOption == 3) {
                String songTitle = songs.getTitle();
                String albumName = songs.getAlbum();
                String artistName = songs.getArtist();
                String genreType = songs.getGenre();

                if (songTitle == null){
                    System.out.println("What's the song's name?");
                    sc.nextLine();
                    songs.setTitle(sc.nextLine());

                }
                if (albumName == null){
                    System.out.println("What's the album's name?");
                    songs.setAlbum(sc.nextLine());

                }
                if (artistName == null){
                    System.out.println("What's the artist of this song?");
                    songs.setArtist(sc.nextLine());

                }
                if (genreType == null){
                    System.out.println("What's the genre of this song?");
                    songs.setGenre(sc.nextLine());

                }
                songs.displayActionsOptions();

                int actionOption = sc.nextInt();

                if (actionOption == 1){
                    songs.play();
                } else if (actionOption == 2) {
                    songs.like();
                } else if (actionOption == 3) {
                    songs.showInfo();
                } else if (actionOption == 4) {
                    songs.showOwnerData();
                } else {
                    System.out.println("Invalid Information.");
                }
            } else if (serviceOption == 4) {
                System.out.println("Come back soon!");
                loop = false;
            } else {
                System.out.println("Invalid option!");
            }

        }

    }
}