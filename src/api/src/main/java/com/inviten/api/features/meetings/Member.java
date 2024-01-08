package com.inviten.api.features.meetings;

import lombok.Generated;
import nonapi.io.github.classgraph.json.Id;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;




@DynamoDbBean
public class Member {

    private Integer userId;
    private String phoneNumber;
    private String role;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber ;
    }

   public String getRole() { return role; }

    public void setRole(String role ) {this.role = role; }

}

