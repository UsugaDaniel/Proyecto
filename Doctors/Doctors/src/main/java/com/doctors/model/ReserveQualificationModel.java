package com.doctors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="reservequalification")


public class ReserveQualificationModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idScore;
    private String name;
    private String email;
    private Integer age;

    private String messageText;

    private Integer stars;


    @OneToOne
    @JsonIgnoreProperties("reserveQualificationModel")
    private ReservationModel reservations;
    public ReserveQualificationModel() {
    }

    public ReserveQualificationModel(Integer idScore, String name, String email, Integer age, String messageText, Integer stars, ReservationModel reservations) {
        this.idScore = idScore;
        this.name = name;
        this.email = email;
        this.age = age;
        this.messageText = messageText;
        this.stars = stars;
        this.reservations = reservations;
    }

    public ReserveQualificationModel(String name, String email, Integer age, String messageText, Integer stars, ReservationModel reservations) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.messageText = messageText;
        this.stars = stars;
        this.reservations = reservations;
    }

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
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

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public ReservationModel getReservations() {
        return reservations;
    }

    public void setReservations(ReservationModel reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "ReserveQualificationModel{" +
                "idScore=" + idScore +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", messageText='" + messageText + '\'' +
                ", stars=" + stars +
                ", reservations=" + reservations +
                '}';
    }
}