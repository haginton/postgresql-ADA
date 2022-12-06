package com.dbpostgresqltest.postgresql.repository;

import com.dbpostgresqltest.postgresql.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserDto, Long>{
}
