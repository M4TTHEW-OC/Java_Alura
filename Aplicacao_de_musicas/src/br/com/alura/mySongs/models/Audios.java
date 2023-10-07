package br.com.alura.mySongs.models;

public class Audios {

    private String title;

    private int totalReproductions;

    private int totalLikes;

    private int classification;
    private double duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproducitons() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like (){
        this.totalLikes++;
    }

    public void reproduction (){
        this.totalReproductions++;

    }



}
