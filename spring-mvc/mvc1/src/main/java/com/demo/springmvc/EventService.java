package com.demo.springmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {


    public List<Event> getEvents() {
        Event event1 = Event.builder().
                        name("Events no.1").
                        limitOfEnrollment(5).
                        startDateTime(LocalDateTime.of(2020,3,8,11,0)).
                        endDateTime(LocalDateTime.of(2020, 3, 8, 15, 0)).
                        build();

        Event event2 = Event.builder().
                name("Events no.2").
                limitOfEnrollment(5).
                startDateTime(LocalDateTime.of(2020,3,15,11,0)).
                endDateTime(LocalDateTime.of(2020, 3, 15, 15, 0)).
                build();

        return Arrays.asList(event1,event2);
    }
}
