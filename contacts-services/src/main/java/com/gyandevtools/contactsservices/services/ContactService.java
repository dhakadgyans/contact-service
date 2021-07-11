package com.gyandevtools.contactsservices.services;

import com.gyandevtools.contactsservices.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContact(Long userId);
}
