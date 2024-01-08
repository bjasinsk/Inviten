package com.inviten.api.features.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

public class MemberService {

    private final IMemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public MemberService(IMemberRepository memberRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.memberRepository = memberRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Transactional(rollbackFor = Exception.class)
    public String saveDto(Member member) {
        member.setPhoneNumber(bCryptPasswordEncoder.encode(member.getPhoneNumber()));
        Member savedMember = memberRepository.save(member);
        return savedMember.getId();
    }
}
