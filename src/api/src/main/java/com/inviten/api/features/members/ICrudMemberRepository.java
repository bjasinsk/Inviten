package com.inviten.api.features.members;

public interface ICrudMemberRepository {
    public void createMember(String phoneNumber);
    public void saveMember(Member member);


}
