package me.rldnd.demowebmvc;

import com.sun.net.httpserver.Headers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getTest() throws Exception {
        this.mockMvc.perform(get("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));


    }

    @Test
    void getEvents() throws Exception {
        this.mockMvc.perform(get("/events"))
                .andExpect(status().isOk());
    }

    @Test
    void getEventWithId() throws Exception {
        this.mockMvc.perform(get("/events/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("events 1"));

        this.mockMvc.perform(get("/events/2"))
                .andExpect(status().isOk())
                .andExpect(content().string("events 2"));

        this.mockMvc.perform(get("/events/3"))
                .andExpect(status().isOk())
                .andExpect(content().string("events 3"));
    }

    @Test
    void createEventWithHeader() throws Exception {
        this.mockMvc.perform(
                post("/events")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void deleteAnEvent() throws Exception {
        this.mockMvc.perform(delete("/events/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("deleted 1"));

        this.mockMvc.perform(delete("/events/2"))
                .andExpect(status().isOk())
                .andExpect(content().string("deleted 2"));

        this.mockMvc.perform(delete("/events/3"))
                .andExpect(status().isOk())
                .andExpect(content().string("deleted 3"));
    }

}