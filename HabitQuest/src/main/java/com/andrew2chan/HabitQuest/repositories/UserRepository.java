package com.andrew2chan.HabitQuest.repositories;

import com.andrew2chan.HabitQuest.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
}
