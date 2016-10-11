package com.springbootwebapp.services;

import com.springbootwebapp.domain.Contact;

/**
 * Created by bru9isk on 01/10/16.
 */
public interface ContactService {

    Iterable<Contact> listAllContacts();

    Contact saveContact(Contact contact);

    Contact getContactById(Integer id);

    void deleteContact(Integer id);
}
