package com.classifiedmapbackend.entity.jpa;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "facebook_account")
@PrimaryKeyJoinColumn(name = "userID")
public class FacebookAccountEntity extends BaseAccountEntity {
    private String facebookID;

    public FacebookAccountEntity() {
    }

    @Builder
    public FacebookAccountEntity(String id, String firstName, String lastName, String phoneNumber, String email, String facebookID) {
        super(id, firstName, lastName, phoneNumber, email);
        this.facebookID = facebookID;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }
}