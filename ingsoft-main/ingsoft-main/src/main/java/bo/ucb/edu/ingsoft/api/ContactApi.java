package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.AgendaBl;
import bo.ucb.edu.ingsoft.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/contact")
public class ContactApi {

    private AgendaBl agendaBl;

    @Autowired
    public ContactApi(AgendaBl agendaBl) {

        this.agendaBl = agendaBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact findById() {

        return agendaBl.findContactById(0);
    }

    //@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    /*public Contact create(@RequestBody Contact contact){
        return agendaBl.createContact(contact);
    }


    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact put(@RequestBody Contact contact) {
      return agendaBl.updateContact(contact);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestParam Integer contactId) {
        agendaBl.deleteContact(contactId);
    }*/
}
