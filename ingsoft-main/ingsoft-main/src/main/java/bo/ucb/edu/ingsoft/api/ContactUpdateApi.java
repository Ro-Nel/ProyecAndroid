package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.AgendaBl;
import bo.ucb.edu.ingsoft.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/contact/update")

public class ContactUpdateApi{

    private AgendaBl agendaBl;
    @Autowired
    public ContactUpdateApi(AgendaBl agendaBl) {

        this.agendaBl = agendaBl;
    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact update() {

        return agendaBl.updateContact(new Contact());
    }

}
