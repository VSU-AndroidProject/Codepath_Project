package com.example.food.ui.slideshow.placeholder;

public class Contact {

    private String name;
    private String phn;
    private String orderNum;
    private int photo;

    public Contact() {

    }

    public Contact(String name, String phn, String orderNum) {
        this.name = name;
        this.phn = phn;
        this.orderNum = orderNum;


    }

    public String getName() {
        return name;
    }

    public String getPhn() {
        return phn;
    }
    public String getOrderNum() {
        return orderNum;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }


}