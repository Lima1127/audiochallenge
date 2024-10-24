package br.com.sun.mysongs.model;

public class Audio {
    private String title;
    private int totalPlay = 0, likes = 0, classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getTotalPlay() {
        return totalPlay;
    }

    public double getClassification() {
        return classification;
    }

    public int getLikes() {
        return likes;
    }

    public void like(){
        likes++;
        System.out.println("Audio liked.");
    }

    public void play(){
        totalPlay++;
        System.out.println("Playing audio.");
    }
}
