package za.co.emailsignature.app.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.co.emailsignature.app.model.UserDetails;

import java.io.PrintWriter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-config.xml", "classpath:spring/mvc-config.test.xml" })
public class EmailGeneratorServiceTest {

    @Mock
    UserDetails userDetails;

    @Mock
    PrintWriter printWriter;


    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShouldWriteToFile() throws Exception {

        SignatureGeneratorService signatureGeneratorService = new SignatureGeneratorService();

        signatureGeneratorService.writeToFile(userDetails);

        //TODo: finish off test


    }
}
