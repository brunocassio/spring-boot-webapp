package com.springbootwebapp.bootstrap;

import com.springbootwebapp.domain.Contact;
import com.springbootwebapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by bru9isk on 30/09/16.
 */
@Component
public class ContactLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ContactRepository contactRepository;

    @Autowired
    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Contact contact = new Contact();
        contact.setAddress("Avenida Paulista");
        contact.setName("Bruno");
        contact.setPhone("62999999999");
        contactRepository.save(contact);

        Contact contact1 = new Contact();
        contact1.setAddress("Avenida Goias");
        contact1.setName("Adriana");
        contact1.setPhone("62999999777");
        contactRepository.save(contact1);

        Contact contact2 = new Contact();
        contact2.setAddress("Rua EM41");
        contact2.setName("Eduarda");
        contact2.setPhone("62999999777");
        contactRepository.save(contact2);

        Contact contact3 = new Contact();
        contact3.setAddress("Avenida Goias");
        contact3.setName("Maria");
        contact3.setPhone("62999994744");
        contactRepository.save(contact3);

        Contact contact4 = new Contact();
        contact4.setAddress("Avenida Anhanguera");
        contact4.setName("João");
        contact4.setPhone("62999994744");
        contactRepository.save(contact4);

    }
}
