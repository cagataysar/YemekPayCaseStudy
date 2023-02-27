package com.main.YemekPayCaseStudy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.YemekPayCaseStudy.model.ToDo;
import com.main.YemekPayCaseStudy.repo.ToDoRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {

    @Autowired
    public MockMvc mockMvc;

    @Autowired
    private ToDoRepository repository;

    /*@Test
    public void getAll() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/todo"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(this.repository.findAll().size())));
    }*/

   /* @Test
    @Order(value = 1)
    public void getById() throws Exception {
//        { "id": 2, "title" : "Submit code",  "description" : "Submit the code for the the Todo app", "due_DATE":"2023-03-03","completed": false }

        RequestBuilder request = MockMvcRequestBuilders.get("/api/todo/1");
        ResultMatcher idMatcher = MockMvcResultMatchers.jsonPath("$.id").value("1");
        ResultMatcher titleMatcher = MockMvcResultMatchers.jsonPath("$.title").value("birinci");
        ResultMatcher completedMatcher = MockMvcResultMatchers.jsonPath("$.completed").value(false);
        ResultMatcher due_dateMatcher = MockMvcResultMatchers.jsonPath("$.due_DATE").value("2023-02-27");
        ResultMatcher descriptionMatcher = MockMvcResultMatchers.jsonPath("$.description").value("acikalamaaa   ");
        ResultMatcher okMatcher = MockMvcResultMatchers.status().isOk();
//        mockMvc.perform(request).andExpect(idMatcher).andExpect(titleMatcher).andExpect(completedMatcher).andExpect(due_dateMatcher).andExpect(descriptionMatcher).andExpect(okMatcher);
        mockMvc.perform(request).andExpectAll(idMatcher,titleMatcher,completedMatcher,due_dateMatcher,descriptionMatcher,okMatcher);
    }*/

   /* @Test
    @Order(value = 2)
    public void saveTest() throws Exception {
//        { "id": 2, "title" : "Submit code",  "description" : "Submit the code for the the Todo app", "due_DATE":"2023-03-03","completed": false }
        String todo = new ObjectMapper()
                .writeValueAsString(new ToDo("Submit code", false));
        RequestBuilder request = MockMvcRequestBuilders.post("/api/todo").content(todo).contentType(MediaType.APPLICATION_JSON);
        String result = mockMvc.perform(request).andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("kaydedildi", result);
        System.err.println("--------------> " + result);
    }*/
}
