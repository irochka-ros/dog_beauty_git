package com.dog_beauty_git.repo;

import com.dog_beauty_git.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findByUsername(String username);

    List<Users> findAllByOrderByRole();

    Users findUserById(Long id);

}
