package com.gyandevtools.contactsservices.entity;

public class Contact {
    private Long MobileNo;
    private  String Email;
    private  Long UserId;

    public Contact(Long mobileNo, String email, Long userId) {
        MobileNo = mobileNo;
        Email = email;
        UserId = userId;
    }

    public Contact() {
    }

    public Long getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        MobileNo = mobileNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
