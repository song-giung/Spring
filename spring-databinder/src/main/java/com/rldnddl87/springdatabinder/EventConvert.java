package com.rldnddl87.springdatabinder;


import org.springframework.core.convert.converter.Converter;

public class EventConvert  {

    public static class StringToEventConverter implements Converter<String, Event>{
        @Override
        public Event convert(String source) {

            return new Event(Integer.parseInt(source));
        }
    }

    public static class EventToStringConverter implements Converter<Event, String>{

        @Override
        public String convert(Event source) {
            return source.getId().toString();
        }
    }
}
