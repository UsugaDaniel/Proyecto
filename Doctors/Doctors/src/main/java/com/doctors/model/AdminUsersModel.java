package com.doctors.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usersadmin")

public class AdminUsersModel implements Serializable
{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idAdmin;
    private String name;
    private String email;
    private String password;

    public AdminUsersModel() {
    }

    public AdminUsersModel(Integer idAdmin, String name, String email, String password) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public AdminUsersModel(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminUsersModel{" +
                "idAdmin=" + idAdmin +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
