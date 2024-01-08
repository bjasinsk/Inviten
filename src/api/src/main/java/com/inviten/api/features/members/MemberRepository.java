package com.inviten.api.features.members;

import com.inviten.api.features.meetings.IMeetingRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

public class MemberRepository implements IMemberRepository {

    @Override
    public Member findByPhoneNumber(String phoneNumber){
        return Null;
    }

}
