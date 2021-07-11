package com.gyandevtools.contactsservices;

import com.gyandevtools.contactsservices.entity.Contact;
import com.gyandevtools.contactsservices.services.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactsController {

    @Autowired
    private ContactServiceImpl contactService;

    RestTemplate restTemplate;

    @GetMapping("/{userId}")

    public List<Contact> getContact(@PathVariable("userId") Long userId){
        return this.contactService.getContact(userId);
    }
}
