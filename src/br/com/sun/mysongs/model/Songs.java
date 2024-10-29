package br.com.sun.mysongs.model;

import br.com.sun.mysongs.interfaces.Ownerable;

public class Songs extends Audio implements Ownerable {
    private String album, artist, genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void showOwnerData(){
        System.out.printf("Artist: %s\n", artist);
    }


    @Override
    public void actions() {
        System.out.printf("""
                        
                        What you want to do with the song %s?
                        1 - Play
                        2 - Like
                        3 - Information
                        4 - Owner
                        
                        """, getTitle());
    }

    @Override
    public void showInfo() {
        System.out.printf("""
                
                Title: %s
                Artist: %s
                Album: %s
                Genre: %s
                likes: %d
                Views: %d
                
                """, getTitle(), artist, album, genre, getLikes(), getTotalPlay());
    }
}
