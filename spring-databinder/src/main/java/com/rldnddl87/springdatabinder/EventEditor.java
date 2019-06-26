package com.rldnddl87.springdatabinder;

import java.beans.PropertyEditorSupport;

//Non Thread safe -> PropertyEditor는 bean으로 등록해서 사용하면 안된다

public class EventEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }

    @Override
    public String getAsText() {
        Event event =(Event)getValue();
        return event.getId().toString();
    }


}
