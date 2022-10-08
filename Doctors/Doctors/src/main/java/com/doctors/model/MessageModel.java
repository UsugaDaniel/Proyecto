package com.doctors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class MessageModel implements Serializable
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "doctorId")
    @JsonIgnoreProperties({"messagesModels", "reservationModels" })
    private DoctorModel doctorModel;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"messageModels", "reservationModels" })
    private ClientModel clientModel;

    public MessageModel() {
    }

    public MessageModel(Integer idMessage, String messageText, DoctorModel doctorModel, ClientModel clientModel) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.doctorModel = doctorModel;
        this.clientModel = clientModel;
    }

    public MessageModel(String messageText, DoctorModel doctorModel, ClientModel clientModel) {
        this.messageText = messageText;
        this.doctorModel = doctorModel;
        this.clientModel = clientModel;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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

    @Override
    public String toString() {
        return "MessageModel{" +
                "idMessage=" + idMessage +
                ", messageText='" + messageText + '\'' +
                ", doctorModel=" + doctorModel +
                ", clientModel=" + clientModel +
                '}';
    }
}
