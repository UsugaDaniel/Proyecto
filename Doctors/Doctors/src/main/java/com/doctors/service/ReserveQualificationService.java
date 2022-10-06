package com.doctors.service;

import com.doctors.model.ReserveQualificationModel;
import com.doctors.repository.ReserveQualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReserveQualificationService {

    @Autowired
    private ReserveQualificationRepository reservequalificationRepository;

    public List<ReserveQualificationModel> getAllReserveQualifications(){
        return reservequalificationRepository.getAllReserveQualifications();
    }

    public Optional<ReserveQualificationModel> getReserveQualification(Integer id){
        return reservequalificationRepository.getReserveQualification(id);
    }

    public ReserveQualificationModel saveReserveQualification(ReserveQualificationModel reservequalificationModel){
        return reservequalificationRepository.saveReserveQualification(reservequalificationModel);
    }

    public boolean deleteReserveQualification(Integer id){
        reservequalificationRepository.deleteReserveQualification(id);
        return true;
    }

    public ReserveQualificationModel updateReserveQualification(ReserveQualificationModel reservequalificationModel){
        return reservequalificationRepository.updateReserveQualification(reservequalificationModel);
    }

}