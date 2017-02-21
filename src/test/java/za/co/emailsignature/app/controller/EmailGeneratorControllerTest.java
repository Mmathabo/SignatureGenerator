package za.co.emailsignature.app.controller;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import za.co.emailsignature.app.model.UserDetails;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-config.xml", "classpath:spring/mvc-config.test.xml"})
public class EmailGeneratorControllerTest {

    private UserDetails userDetails;

    private MockMvc mockMvc;
    private SignatureGeneratorController signatureGeneratorController;

    @Before
    public void initMocks() {

        signatureGeneratorController = new SignatureGeneratorController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(signatureGeneratorController).build();
    }

    @Test
    public void testShouldSendUserDetailsToService() throws Exception {
        userDetails = new UserDetails("name", "Surname", "role", "cellNumber");
        signatureGeneratorController.generateSignature(userDetails);
        Gson gson = new Gson();
        String json = gson.toJson(userDetails);


        MvcResult result = this.mockMvc.perform(
                MockMvcRequestBuilders.post("/generateSignature")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andReturn();


    }
}
