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

        while (loop){
            System.out.println("""
                    Welcome!
                    What service you want to access?
                    1 - Audios
                    2 - Podcasts
                    3 - Songs
                    4 - Exit
                    
                    """);
            int initialOption = sc.nextInt();
            if (initialOption == 1){
                String audioTitle = audio.getTitle();
                if (audioTitle == null){
                    System.out.println("What's the audio's title?");
                    sc.nextLine();
                    audio.setTitle(sc.nextLine());
                }
                audio.actions();
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

            } else if (initialOption == 2) {
                String podcastTitle = podcasts.getHost();
                String podcastDescription = podcasts.getDescription();
                if (podcastTitle == null){
                    System.out.println("What's the Podcast's Host?");
                    sc.nextLine();
                    podcasts.setHost(sc.nextLine());
                }
                if (podcastDescription == null){
                    System.out.println("What's the Podcast's description?");
                    sc.nextLine();
                    podcasts.setDescription(sc.nextLine());
                }

                podcasts.actions();
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

            } else if (initialOption == 3) {
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
                    sc.nextLine();
                    songs.setAlbum(sc.nextLine());
                }
                if (artistName == null){
                    System.out.println("What's the artist of this song?");
                    sc.nextLine();
                    songs.setArtist(sc.nextLine());
                }
                if (genreType == null){
                    System.out.println("What's the genre of this song?");
                    sc.nextLine();
                    songs.setGenre(sc.nextLine());
                }


            }

        }
        System.out.println("");

    }
}