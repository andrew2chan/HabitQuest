package com.andrew2chan.HabitQuest.repositories;

import com.andrew2chan.HabitQuest.domain.Gamifications;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamificationRepository extends CrudRepository<Gamifications, Long> {
}
