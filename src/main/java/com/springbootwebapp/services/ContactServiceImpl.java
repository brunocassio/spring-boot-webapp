package com.springbootwebapp.services;


import com.springbootwebapp.domain.Contact;
import com.springbootwebapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bru9isk on 01/10/16.
 */
@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Autowired
    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Iterable<Contact> listAllContacts() {
        return contactRepository.findAll();
    }
}