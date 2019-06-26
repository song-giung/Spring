package com.rldnddl87.springdatabinder;

import org.springframework.format.Formatter;
import java.text.ParseException;
import java.util.Locale;

//threas safe - bean등록가능 - 다른 bean들도 주입가능

public class EventFormatter implements Formatter<Event> {

    @Override
    public String print(Event object, Locale locale) {
        return null;
    }

    @Override
    public Event parse(String text, Locale locale) throws ParseException {

        return new Event(Integer.parseInt(text));
    }
}
