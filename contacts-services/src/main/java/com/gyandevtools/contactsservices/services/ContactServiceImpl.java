package com.gyandevtools.contactsservices.services;

import com.gyandevtools.contactsservices.entity.Contact;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContactServiceImpl implements ContactService{

    List<Contact> ls = List.of(
            new Contact(909090L, "gyan@gmail.com", 123L),
            new Contact(909088L, "dhakad@gmail.com", 123L),
            new Contact(789456L, "aloo@gmail.com", 124L),
            new Contact(909077L, "demo@gmail.com", 125L)
    );

    @Override
    public List<Contact> getContact(Long userId) {
        return ls.stream().filter(e -> e.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
