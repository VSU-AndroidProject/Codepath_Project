package com.example.food.ui.slideshow.placeholder;

public class Contact {

    private String name;
    private String phn;
    private int photo;

    public Contact() {

    }

    public Contact(String name, String phn) {
        this.name = name;
        this.phn = phn;

    }

    public String getName() {
        return name;
    }

    public String getPhn() {
        return phn;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }


}