package com.company.enesdeniz.model;

public class RealEstate {
    String province;
    String district;
    String housingType;
    String numberOfRooms;
    int area;
    int floorLocation;

    public RealEstate(String province, String district, String numberOfRooms) {
        this.province = province;
        this.district = district;
        this.numberOfRooms = numberOfRooms;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
