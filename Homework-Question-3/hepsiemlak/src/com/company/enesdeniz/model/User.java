package com.company.enesdeniz.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    String userType; // bireysel & kurumsal & yeniTip
    String name;
    String email;
    String photo;
    String biography;
    String vkn;
    Set<Advert> favoritePosts = new HashSet<>();
    List<Advert> postings = new ArrayList<>();
    List<Message> messageBox;

    public Set<Advert> getFavoritePosts() {
        return favoritePosts;
    }

    public void setFavoritePosts(Set<Advert> favoritePosts) {
        this.favoritePosts = favoritePosts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userType, String name, String email) {
        super();
        this.userType = userType;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public List<Message> getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(List<Message> messageBox) {
        this.messageBox = messageBox;
    }
}
