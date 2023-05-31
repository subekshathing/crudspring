package com.crud.crudproect.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;

    @Column(name="Name")
    private String Name;

    @Column(name="Address")
    private String Address;


    public Users() {
        super();
    }

    public Users(int id, String name, String address) {
        super();
        Id = id;
        Name = name;
        Address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

}

