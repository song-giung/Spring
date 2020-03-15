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
    void headTest() throws Exception{
        this.mockMvc.perform(head("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));

        //head로 요청을 받을경우 본문이 없는 헤더정보만 리턴해야 한다.
    }

    @Test
    void optionTest() throws Exception {
        this.mockMvc.perform(options("/hello"))
                .andDo(print())
                .andExpect(status().isOk());

        //options로 요청을 받으면 헤더에 응답가능한 httpmethod목록을 제공한다.
        // Headers = [Allow:"GET,HEAD,POST,OPTIONS"]
    }


}