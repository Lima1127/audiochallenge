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
        System.out.printf("Host: %s\n", artist);
    }
}
