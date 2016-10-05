package com.springbootwebapp.web;

import com.springbootwebapp.domain.Contact;
import com.springbootwebapp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bru9isk on 01/10/16.
 */
@Controller
public class ContactController {

    private ContactService contactService;

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("contacts", contactService.listAllContacts());
        return "list";
    }

    @RequestMapping(value = "contact", method = RequestMethod.POST)
    public String save(Contact contact){
        contactService.saveContact(contact);
        return "";
    }

    @RequestMapping("/include")
    public String newContact(Model model){
        model.addAttribute("contact", new Contact());
        return "include";
    }
}
