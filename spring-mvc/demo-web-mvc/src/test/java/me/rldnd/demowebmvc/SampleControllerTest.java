package me.rldnd.demowebmvc;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void hello() throws Exception{
        this.mockMvc.perform(get("/hello")
                    .contentType(MediaType.APPLICATION_JSON)
                    //.accept(MediaType.APPLICATION_JSON)
                    )
                .andDo(print())
                .andExpect(status().isOk()) //status().isMethodNotAllowed()
                .andExpect(content().string("hello"))
                .andExpect(handler().handlerType(SampleController.class))
                .andExpect(handler().methodName("hello"));
    }


}