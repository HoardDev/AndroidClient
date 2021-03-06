package com.hoardandroid.LibraryObjects;

import com.hoardandroid.LibraryObjects.FormatEnums.TableTopFormat;

/**
 * Created by Nicholas on 10/24/2015.
 */
public class TableTopGame {
    private int itemId;
    private String userEmail;
    private String title;
    private int minPlayers;
    private int maxPlayers;
    private TableTopFormat style;

    public TableTopGame() {
    }

    public TableTopGame(String gameTitle) {
        this.title = gameTitle;
    }

    public String getGameTitle() {
        return title;
    }

    public void setGameTitle(String gameTitle) {
        this.title = gameTitle;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public TableTopFormat getStyle() {
        return style;
    }

    public void setStyle(TableTopFormat style) {
        this.style = style;
    }

    public String toString(){
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
