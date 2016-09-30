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

    }
}
