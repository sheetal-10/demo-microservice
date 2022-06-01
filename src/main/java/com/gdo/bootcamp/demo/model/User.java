package com.gdo.bootcamp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
    @Id
    @GeneratedValue
    public int id;
    public String firstName;
    public String lastName;
    public String emailId;
    public long mobileNo;

}
