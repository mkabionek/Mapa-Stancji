package com.classifiedmapbackend.entity.jpa;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
@Builder
public class AddressEntity {

    @Id
    private String id;

    @Column(name = "City")
    private String city;

    @Column(name = "District")
    private String district;

    @Column(name = "Street")
    private String street;

    @Column(name = "Building_num")
    private String buildingNum;

    @Column(name = "Flat_num")
    private String flatNum;

    public AddressEntity(String id, String city, String district, String street, String buildingNum, String flatNum) {
        this.id = id;
        this.city = city;
        this.district = district;
        this.street = street;
        this.buildingNum = buildingNum;
        this.flatNum = flatNum;
    }

    public AddressEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

}
