package com.doctors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class ClientModel implements Serializable
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idClient;
    private String name;
    private String email;
    private Integer age;

    private String password;


    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    public List<ReservationModel> reservationModels;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    public List<MessageModel> messageModels;




    public ClientModel()
    {

    }

    public ClientModel(Integer idClient, String name, String email, Integer age, String password, List<ReservationModel> reservationModels, List<MessageModel> messageModels) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.reservationModels = reservationModels;
        this.messageModels = messageModels;
    }

    public ClientModel(String name, String email, Integer age, String password, List<ReservationModel> reservationModels, List<MessageModel> messageModels) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.reservationModels = reservationModels;
        this.messageModels = messageModels;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ReservationModel> getReservationModels() {
        return reservationModels;
    }

    public void setReservationModels(List<ReservationModel> reservationModels) {
        this.reservationModels = reservationModels;
    }

    public List<MessageModel> getMessageModels() {
        return messageModels;
    }

    public void setMessageModels(List<MessageModel> messageModels) {
        this.messageModels = messageModels;
    }

    @Override
    public String toString() {
        return "ClientModel{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", reservationModels=" + reservationModels +
                ", messageModels=" + messageModels +
                '}';
    }
}
