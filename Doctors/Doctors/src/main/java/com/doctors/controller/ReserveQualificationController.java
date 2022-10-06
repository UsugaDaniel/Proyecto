package com.doctors.controller;

import com.doctors.model.ReserveQualificationModel;
import com.doctors.service.ReserveQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservequalifications")
@CrossOrigin(origins = "*")

public class ReserveQualificationController{
    @Autowired
    private ReserveQualificationService reserveQualificationService;

    @GetMapping("/all")
    public List<ReserveQualificationModel> getAllReserveQualifications()
    {
        return reserveQualificationService.getAllReserveQualifications();
    }

    @GetMapping("/{id}")
    public Optional<ReserveQualificationModel> getReserveQualification(@PathVariable Integer id)
    {
        return reserveQualificationService.getReserveQualification(id);
    }

    @PostMapping("/save")
    public ReserveQualificationModel saveReserveQualification(@RequestBody ReserveQualificationModel reserveQualificationModel)
    {
        return reserveQualificationService.saveReserveQualification(reserveQualificationModel);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteReserveQualification(@PathVariable Integer id)
    {
        return reserveQualificationService.deleteReserveQualification(id);
    }

    @PutMapping("/update")
    public ReserveQualificationModel updateReserveQualification(@RequestBody ReserveQualificationModel reserveQualificationModel)
    {
        return reserveQualificationService.updateReserveQualification(reserveQualificationModel);
    }
}
