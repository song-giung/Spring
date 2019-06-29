package com.rldnddl87.springnullsafety;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @NonNull
    public String greeting(@NonNull String name) {
        return "hello " + name;
    }
}
