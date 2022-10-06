package com.doctors.service;


import com.doctors.model.AdminUsersModel;
import com.doctors.repository.AdminUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminUsersService {

    @Autowired
    private AdminUsersRepository adminUsersRepository;

    public List<AdminUsersModel> getAllAdminUsers(){
        return adminUsersRepository.getAllAdminUsers();
    }

    public Optional<AdminUsersModel> getAdminUsers(Integer id){
        return adminUsersRepository.getAdminUsers(id);
    }

    public AdminUsersModel saveAdminUsers(AdminUsersModel adminUsersModel){
        return adminUsersRepository.saveAdminUsers(adminUsersModel);
    }
    public Boolean deleteAdminUsers(Integer id){
        adminUsersRepository.deleteAdminUsers(id);
        return true;
    }
    public AdminUsersModel updateAdminUsers(AdminUsersModel adminUsersModel){
        return adminUsersRepository.updateAdminUsers(adminUsersModel);
    }
}
