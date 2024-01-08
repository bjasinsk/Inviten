package com.inviten.api.features.members;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;





@DynamoDbBean
public class Member {


    private String id;
    private String phoneNumber;
    private String role;

    public Member(Member other) {
        this.id = other.id;
        this.phoneNumber = other.phoneNumber;
        this.role = other.role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber ;
    }

   public String getRole() { return role; }

    public void setRole(String role ) {this.role = role; }

    public String getId() {return id; }

    public void setId(String id) {this.id = id; }

}

