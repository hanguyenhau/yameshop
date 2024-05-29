package com.yameshopbe.dao;

import com.yameshopbe.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
