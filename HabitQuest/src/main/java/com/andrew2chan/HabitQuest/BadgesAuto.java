package com.andrew2chan.HabitQuest;

import com.andrew2chan.HabitQuest.domain.Badges;
import com.andrew2chan.HabitQuest.repositories.BadgesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BadgesAuto implements CommandLineRunner {
    private BadgesRepository badgesRepository;
    private final int MAX_LEVEL = 100;

    private BadgesAuto(BadgesRepository badgesRepository) {
        this.badgesRepository = badgesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        for(long i = 5; i <= MAX_LEVEL; i += 5) {
            Badges dayBadge = Badges.builder()
                    .name(i + " Day Streak!")
                    .description("Completed your habits for " + i + " days in a row!")
                    .streakDays(i)
                    .build();

            badgesRepository.save(dayBadge);

            Badges levelBadge = Badges.builder()
                    .name("Level " + i)
                    .description("Reached Level " + i)
                    .levelReached(i)
                    .build();

            badgesRepository.save(levelBadge);
        }
    }
}
