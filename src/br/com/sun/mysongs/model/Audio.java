package br.com.sun.mysongs.model;

public class Audio {
    private String title;
    private int totalPlay = 0, likes = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getTotalPlay() {
        return totalPlay;
    }

    public int getLikes() {
        return likes;
    }

    public void showInfo(){
        System.out.printf("""
                Title: %s
                Likes: %d
                Total Play: %d
                
                """, title, likes, totalPlay);
    }

    public void actions(){
        System.out.printf("""
                        What you want to do with %s Audio?
                        1 - Play
                        2 - Like
                        3 - Information
                        
                        """, title);
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
