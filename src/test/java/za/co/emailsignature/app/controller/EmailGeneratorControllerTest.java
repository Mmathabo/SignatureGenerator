package za.co.emailsignature.app.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import za.co.emailsignature.app.model.UserDetails;
import za.co.emailsignature.app.service.SignatureGeneratorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-config.xml", "classpath:spring/mvc-config.test.xml" })
public class EmailGeneratorControllerTest {

    @Mock
    SignatureGeneratorService signatureGeneratorService;

    @Mock
    UserDetails userDetails;

    private MockMvc mockMvc;
    private SignatureGeneratorController signatureGeneratorController;


    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
        signatureGeneratorController  = new SignatureGeneratorController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(signatureGeneratorController).build();
    }

    @Test
    public void testShouldSendUserDetailsToService() throws Exception {
        //TODO: finish the test
    }
}
