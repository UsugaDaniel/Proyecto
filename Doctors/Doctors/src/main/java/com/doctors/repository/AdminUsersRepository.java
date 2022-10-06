package com.doctors.repository;


import com.doctors.model.AdminUsersModel;
import com.doctors.repository.crudrepository.AdminUsersCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository ///Falta comitear el CrudAdmin
public class AdminUsersRepository {

    @Autowired
    private AdminUsersCrudRepository adminUsersCrudRepository;

    public List<AdminUsersModel> getAllAdminUsers() {
        return (List<AdminUsersModel>) adminUsersCrudRepository.findAll();
    }

    public Optional<AdminUsersModel> getAdminUsers(Integer id) {
        return adminUsersCrudRepository.findById((id));
    }

    public AdminUsersModel saveAdminUsers(AdminUsersModel adminUsersModel){
        return adminUsersCrudRepository.save(adminUsersModel);
    }
    public boolean deleteAdminUsers(Integer id){
        adminUsersCrudRepository.deleteById(id);
        return true;
    }

    public AdminUsersModel updateAdminUsers(AdminUsersModel adminUsersModel){
        return adminUsersCrudRepository.save(adminUsersModel);

    }

}
