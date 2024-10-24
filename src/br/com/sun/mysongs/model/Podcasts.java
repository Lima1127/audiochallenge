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
        System.out.printf("Host: %s\n", host);
    }
}
