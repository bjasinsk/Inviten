package com.inviten.api.features.members;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMemberRepository extends JpaRepository<Member, String> {

    //Method to authorize user
    public Member findByPhoneNumber(String phoneNumber);


}

