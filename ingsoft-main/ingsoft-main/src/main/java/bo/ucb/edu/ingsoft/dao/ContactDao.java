package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Contact;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactDao {
    public Contact findByContactId(Integer contactId);

    public Contact deleteContact(Integer contactId);

    public Contact updateContact(Contact contact);

    public Contact insertContact(Contact contact);
}
