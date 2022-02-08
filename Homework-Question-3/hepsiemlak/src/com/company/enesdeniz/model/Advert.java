package com.company.enesdeniz.model;

import java.math.BigDecimal;
import java.util.Date;

public class Advert {

    private RealEstate realEstate;
    private String title;
    private User user; // hem bireysel & kurumsal
    private String[] photoList = new String[5];
    private BigDecimal price;
    private int date;
    private boolean isForward = false;
    private boolean isExamine = false;
    private Date createdDate;
    private boolean isActive;

    public Advert() {

    }

    public Advert(RealEstate realEstate, User user, String[] photoList) {
        this.realEstate = realEstate;
        this.user = user;
        this.photoList = photoList;
    }

    public Advert(RealEstate realEstate, User user, String[] photoList, BigDecimal price) {
        this.realEstate = realEstate;
        this.user = user;
        this.photoList = photoList;
        this.price = price;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getPhotoList() {
        return photoList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhotoList(String[] photoList) {
        this.photoList = photoList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }

    public boolean isExamine() {
        return isExamine;
    }

    public void setExamine(boolean examine) {
        isExamine = examine;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Advert(RealEstate realEstate, String title, User user, String[] photoList, BigDecimal price,
                  int date, boolean isForward, boolean isExamine, Date
                          createdDate, boolean isActive) {
        super();
        this.realEstate = realEstate;
        this.user = user;
        this.photoList = photoList;
        this.price = price;
        this.date = date;
        this.isForward = isForward;
        this.isExamine = isExamine;
        this.createdDate = createdDate;
        this.isActive = isActive;
    }
}
