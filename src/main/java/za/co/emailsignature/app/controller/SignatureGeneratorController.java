package za.co.emailsignature.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import za.co.emailsignature.app.model.UserDetails;
import za.co.emailsignature.app.service.SignatureGeneratorService;

@Controller
@RequestMapping(value = "/generateSignature", method= RequestMethod.POST)
public class SignatureGeneratorController {

    @Autowired
    SignatureGeneratorService signatureGeneratorService =  new SignatureGeneratorService();


    public void generateSignature (@RequestBody UserDetails userDetails){
        signatureGeneratorService.writeToFile(userDetails);
    }

}
