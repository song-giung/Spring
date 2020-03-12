package me.rldnd.demobootmvc;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        this.mockMvc.perform(get("/hello/rldnd"))
                .andDo(print())
                .andExpect(content().string("hello rldnd"));
    }

    @Test
    void hi() throws Exception {
        this.mockMvc.perform(get("/hi").param("name", "rldnd"))
                .andDo(print())
                .andExpect(content().string("hi rldnd"));
    }
}