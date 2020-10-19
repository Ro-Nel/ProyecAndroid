package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.AgendaBl;
import bo.ucb.edu.ingsoft.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/contact/delete")
public class ContactDeleteApi {

    private AgendaBl agendaBl;

    @Autowired
    public ContactDeleteApi(AgendaBl agendaBl) {

        this.agendaBl = agendaBl;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact delete() {

        return agendaBl.deleteContact(0);
    }


}
