package com.doctors.service;


import com.doctors.model.SpecialtyModel;
import com.doctors.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyService {

    @Autowired

    private SpecialtyRepository specialtyRepository;

    public List<SpecialtyModel> getAllSpecialties(){
        return specialtyRepository.getAllSpecialties();
    }

    public Optional <SpecialtyModel> getSpecialty(Integer id){
        return specialtyRepository.getSpecialty(id);
    }

    public SpecialtyModel saveSpecialty(SpecialtyModel specialtyModel){
        return specialtyRepository.saveSpecialty(specialtyModel);  }

    public Boolean deleteSpecialty(Integer id){
        specialtyRepository.deleteSpecialty(id);
        return true;
    }

    public SpecialtyModel updateSpecialty(SpecialtyModel specialtyModel){
        return specialtyRepository.updateSpecialty(specialtyModel);  }


}
