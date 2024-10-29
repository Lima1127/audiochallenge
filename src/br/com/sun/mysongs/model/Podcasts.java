package br.com.sun.mysongs.model;

import br.com.sun.mysongs.interfaces.Ownerable;

public class Podcasts extends Audio implements Ownerable {
    private String host, description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showOwnerData(){
        System.out.printf("%s is the podcast's owner!\n", host);
    }

    @Override
    public void showInfo() {
        System.out.printf("""
                
                Host: %s
                description: %s
                likes: %d
                Views: %d
                
                """, host, description, getLikes(), getTotalPlay());
    }

    @Override
    public void actions() {
        System.out.printf("""
                        What you want to do with %s Podcast??
                        1 - Play
                        2 - Like
                        3 - Information
                        4 - Owner
                        
                        """, host);
    }
}
