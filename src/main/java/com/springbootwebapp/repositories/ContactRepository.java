package com.springbootwebapp.repositories;

import com.springbootwebapp.domain.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bru9isk on 30/09/16.
 */
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
