package za.co.emailsignature.app.controller;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import za.co.emailsignature.app.model.UserDetails;
import za.co.emailsignature.app.service.SignatureGeneratorService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-config.xml", "classpath:spring/mvc-config.test.xml"})
public class EmailGeneratorControllerTest {

    @Mock
    SignatureGeneratorService signatureGeneratorService;


    private UserDetails userDetails;

    private MockMvc mockMvc;
    private SignatureGeneratorController signatureGeneratorController;


    @Before
    public void initMocks() {

        MockitoAnnotations.initMocks(this);
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
                post("/generateSignature")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andReturn();

    }
}
