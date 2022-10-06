package com.doctors.controller;


import com.doctors.model.AdminUsersModel;
import com.doctors.service.AdminUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/adminusers")
@CrossOrigin(origins = "*")
public class AdminUsersController {

    @Autowired
    private AdminUsersService adminUsersService;

    @GetMapping("/all")
    public List<AdminUsersModel> getAllAdminUsers() {return adminUsersService.getAllAdminUsers();}

    @GetMapping("/{id}")
    public Optional<AdminUsersModel> getAllAdminUsers(@PathVariable Integer id) {return adminUsersService.getAdminUsers(id);}

    @PostMapping("/save")
    public AdminUsersModel saveAdminUsers(@RequestBody AdminUsersModel adminUsersModel) {return adminUsersService.saveAdminUsers(adminUsersModel);}

    @DeleteMapping("/delete/{id}")
    public Boolean deleteAdminUsers(@PathVariable Integer id) {return adminUsersService.deleteAdminUsers(id);}

    @PutMapping("/update")
    public AdminUsersModel updateAdminUsers(@RequestBody AdminUsersModel adminUsersModel)
    {
        return adminUsersService.updateAdminUsers(adminUsersModel);
    }


}
