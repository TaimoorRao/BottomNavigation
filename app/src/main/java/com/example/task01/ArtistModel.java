package com.example.task01;

public class ArtistModel {
    private int item_Image;
    private String item_Text1;
    private String item_Text2;
    private int description;

    public ArtistModel(int item_Image, String item_Text1, String item_Text2, int desc) {
        this.item_Image = item_Image;
        this.item_Text1 = item_Text1;
        this.item_Text2 = item_Text2;
        this.description = desc;
    }

    public int getDescription() { return description; }

    public void setDescription(int description) { this.description = description; }

    public int getItem_Image() {
        return item_Image;
    }

    public void setItem_Image(int item_Image) {
        this.item_Image = item_Image;
    }

    public String getItem_Text1() {
        return item_Text1;
    }

    public void setItem_Text1(String item_Text1) {
        this.item_Text1 = item_Text1;
    }

    public String getItem_Text2() {
        return item_Text2;
    }

    public void setItem_Text2(String item_Text2) {
        this.item_Text2 = item_Text2;
    }
}
