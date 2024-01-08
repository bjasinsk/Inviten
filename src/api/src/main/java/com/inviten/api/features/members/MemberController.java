package com.inviten.api.features.members;

import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {
    private final IMemberRepository memberRepository;

    public MemberController(IMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }



}
