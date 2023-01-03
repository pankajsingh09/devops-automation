package com;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith( SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class Assignment5ApplicationTests {
	
	
	@Autowired
    private MockMvc mockMvc;
	
	 @Test
	    public void getsAllBooks() throws Exception {
	        mockMvc.perform(MockMvcRequestBuilders.get("/books"))
	                .andExpect(status().isOk())
	                .andReturn();
	    }
	
	

	@Test
	void contextLoads() {
	}

}
