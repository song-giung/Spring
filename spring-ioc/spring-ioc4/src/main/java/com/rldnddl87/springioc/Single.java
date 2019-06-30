package com.rldnddl87.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    //Singleton타입의 빈이 proto타입의 빈을 참조하면? 프로토 타입이 변경이 되지 않는다.
    @Autowired
    Proto proto;

    public Proto getProto() {
        return proto;
    }
}
