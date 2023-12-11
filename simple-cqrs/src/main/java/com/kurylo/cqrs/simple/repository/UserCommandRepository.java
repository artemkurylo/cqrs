package com.kurylo.cqrs.simple.repository;

import com.kurylo.cqrs.simple.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommandRepository extends JpaRepository<User, Long> {
    void deleteUserById(Long id);
}
