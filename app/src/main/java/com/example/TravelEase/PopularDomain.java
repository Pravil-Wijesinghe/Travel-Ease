package com.example.TravelEase;

import java.io.Serializable;

public class PopularDomain implements Serializable {

    private String title;
    private String description;
    private double score;

    private String pic;

    public PopularDomain(String title, String description, double score, String pic) {
        this.title = title;
        this.description = description;
        this.score = score;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
