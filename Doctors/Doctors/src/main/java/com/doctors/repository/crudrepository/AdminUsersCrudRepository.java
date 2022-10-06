package com.doctors.repository.crudrepository;

import com.doctors.model.AdminUsersModel;
import org.springframework.data.repository.CrudRepository;

public interface AdminUsersCrudRepository extends CrudRepository<AdminUsersModel,Integer> {
}
