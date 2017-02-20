package za.co.emailsignature.app.service;

import org.springframework.stereotype.Service;
import za.co.emailsignature.app.model.UserDetails;

import java.io.IOException;
import java.io.PrintWriter;

@Service
public class SignatureGeneratorService {

    public void writeToFile(UserDetails userDetails) {

        try {
            PrintWriter writer = new PrintWriter("userDetails.txt", "UTF-8");
            writer.println(userDetails.formatNameAndSurname());
            writer.println(userDetails.getRole());
            writer.println(userDetails.getAddressLine1());
            writer.println(userDetails.getSurburb());
            writer.println(userDetails.getCellNumber());
            writer.println(userDetails.getOfficeNumber());
            writer.println(userDetails.getCompanyLink());
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
}

