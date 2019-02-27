package com.example.akhil.yogalist;
public class ListItems {

    private String head;


    private int  image;

    public ListItems( String head, int image ) {
        this.head = head;
        this.image =image;
    }

    public String getHead() {
        return head;
    }


    public int getImage() {
        return image;
    }
}

