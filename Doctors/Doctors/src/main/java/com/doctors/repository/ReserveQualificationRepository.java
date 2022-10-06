package com.doctors.repository;

import com.doctors.model.ReserveQualificationModel;
import com.doctors.repository.crudrepository.ReserveQualificationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReserveQualificationRepository {

    @Autowired

    private ReserveQualificationCrudRepository reservequalificationCrudRepository;

    public List<ReserveQualificationModel> getAllReserveQualifications() {
        return (List<ReserveQualificationModel>) reservequalificationCrudRepository.findAll();
    }

    public Optional<ReserveQualificationModel> getReserveQualification(Integer id) {
        return reservequalificationCrudRepository.findById(id);
    }

    public ReserveQualificationModel saveReserveQualification(ReserveQualificationModel reservequalificationModel){
        return reservequalificationCrudRepository.save(reservequalificationModel);
    }

    public boolean deleteReserveQualification (Integer id){
        reservequalificationCrudRepository.deleteById(id);
        return true;
    }

    public ReserveQualificationModel updateReserveQualification(ReserveQualificationModel reservequalificationModel){
        return reservequalificationCrudRepository.save(reservequalificationModel);
    }

}