package com.andrew2chan.HabitQuest.repositories;

import com.andrew2chan.HabitQuest.domain.Levelxp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelxpRepository extends CrudRepository<Levelxp, Long> {
}
