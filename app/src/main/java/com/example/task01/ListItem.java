package com.example.task01;


public class ListItem {
    private String itemText;
    public ListItem(String itemName){
        itemText = itemName;
    }
    public void setItemText(String item){
        this.itemText = item;
    }

    public String getItemText() {
        return itemText;
    }
}
