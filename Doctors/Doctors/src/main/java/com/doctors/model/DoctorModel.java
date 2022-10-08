package com.doctors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "doctor")
public class DoctorModel implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    private String specialty;

    private Integer year;

    private String description;

    private String department;


    @ManyToOne
    @JoinColumn(name = "specialtyId")
    @JsonIgnoreProperties("doctorModels")
    private SpecialtyModel specialtyModel;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="doctor")
    @JsonIgnoreProperties({"doctor", "messageModels"})
    public List<ReservationModel> reservationModels;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="doctor")
    @JsonIgnoreProperties({"doctor", "client"})
    public List<MessageModel> messageModels;




    public DoctorModel()
    {

    }

    public DoctorModel(Integer id, String name, String email, Integer age, String specialty, Integer year, String description, String department, SpecialtyModel specialtyModel, List<ReservationModel> reservationModels, List<MessageModel> messageModels) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.specialty = specialty;
        this.year = year;
        this.description = description;
        this.department = department;
        this.specialtyModel = specialtyModel;
        this.reservationModels = reservationModels;
        this.messageModels = messageModels;
    }

    public DoctorModel(String name, String email, Integer age, String specialty, Integer year, String description, String department, SpecialtyModel specialtyModel, List<ReservationModel> reservationModels, List<MessageModel> messageModels) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.specialty = specialty;
        this.year = year;
        this.description = description;
        this.department = department;
        this.specialtyModel = specialtyModel;
        this.reservationModels = reservationModels;
        this.messageModels = messageModels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public SpecialtyModel getSpecialtyModel() {
        return specialtyModel;
    }

    public void setSpecialtyModel(SpecialtyModel specialtyModel) {
        this.specialtyModel = specialtyModel;
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
        return "DoctorModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", department='" + department + '\'' +
                ", specialtyModel=" + specialtyModel +
                ", reservationModels=" + reservationModels +
                ", messageModels=" + messageModels +
                '}';
    }
}
