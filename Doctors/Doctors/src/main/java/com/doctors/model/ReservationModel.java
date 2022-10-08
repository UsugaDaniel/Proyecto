package com.doctors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="reservation")

public class ReservationModel implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";


    @ManyToOne
    @JoinColumn(name = "doctorId")
    @JsonIgnoreProperties("reservationModels")
    private DoctorModel doctorModel;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"reservationModels", "messageModels"})
    private ClientModel clientModel;


    @OneToOne
    @JsonIgnoreProperties("reservationModel")
    private ReserveQualificationModel reserveQualificationModel;

    public ReservationModel() {
    }

    public ReservationModel(Date startDate, Date devolutionDate, String status, DoctorModel doctorModel, ClientModel clientModel, ReserveQualificationModel reserveQualificationModel) {
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.status = status;
        this.doctorModel = doctorModel;
        this.clientModel = clientModel;
        this.reserveQualificationModel = reserveQualificationModel;
    }

    public ReservationModel(Integer idReservation, Date startDate, Date devolutionDate, String status, DoctorModel doctorModel, ClientModel clientModel, ReserveQualificationModel reserveQualificationModel) {
        this.idReservation = idReservation;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.status = status;
        this.doctorModel = doctorModel;
        this.clientModel = clientModel;
        this.reserveQualificationModel = reserveQualificationModel;


    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DoctorModel getDoctorModel() {
        return doctorModel;
    }

    public void setDoctorModel(DoctorModel doctorModel) {
        this.doctorModel = doctorModel;
    }

    public ClientModel getClientModel() {
        return clientModel;
    }

    public void setClientModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }

    public ReserveQualificationModel getReserveQualificationModel() {
        return reserveQualificationModel;
    }

    public void setReserveQualificationModel(ReserveQualificationModel reserveQualificationModel) {
        this.reserveQualificationModel = reserveQualificationModel;
    }

    @Override
    public String toString() {
        return "ReservationModel{" +
                "idReservation=" + idReservation +
                ", startDate=" + startDate +
                ", devolutionDate=" + devolutionDate +
                ", status='" + status + '\'' +
                ", doctorModel=" + doctorModel +
                ", clientModel=" + clientModel +
                ", reserveQualificationModel=" + reserveQualificationModel +
                '}';
    }
}
