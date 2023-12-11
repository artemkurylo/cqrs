package com.kurylo.cqrs.simple.repository;

import com.kurylo.cqrs.simple.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQueryRepository extends JpaRepository<User, Long> {
}
