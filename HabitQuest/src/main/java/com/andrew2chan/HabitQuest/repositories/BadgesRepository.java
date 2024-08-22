package com.andrew2chan.HabitQuest.repositories;

import com.andrew2chan.HabitQuest.domain.Badges;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BadgesRepository extends CrudRepository<Badges, Long> {
}
