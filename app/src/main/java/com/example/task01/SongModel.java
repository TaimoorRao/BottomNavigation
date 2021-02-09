package com.example.task01;

public class SongModel {
    int item_Image;
    String item_Text;

    public SongModel(int image, String text) {
        this.item_Image = image;
        this.item_Text = text;
    }

    public int getItem_Image() {
        return item_Image;
    }

    public void setItem_Image(int image) {
        this.item_Image = image;
    }

    public String getItem_Text() {
        return item_Text;
    }

    public void setItem_Text(String text) {
        this.item_Text = text;
    }
}
