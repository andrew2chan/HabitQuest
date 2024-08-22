package com.andrew2chan.HabitQuest.repositories;

import com.andrew2chan.HabitQuest.domain.Habits;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitsRepository extends CrudRepository<Habits, Long> {
}
