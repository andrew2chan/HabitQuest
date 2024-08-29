package com.andrew2chan.HabitQuest;

import com.andrew2chan.HabitQuest.domain.Levelxp;
import com.andrew2chan.HabitQuest.repositories.LevelxpRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LevelxpAuto implements CommandLineRunner {
    private LevelxpRepository levelxpRepository;
    private final int MAX_LEVEL = 100;

    private LevelxpAuto(LevelxpRepository levelxpRepository) {
        this.levelxpRepository = levelxpRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long expNeeded = 0;

        for(long i = 1; i <= MAX_LEVEL; i++) {
            if(i >= 1 && i < 5) {
                expNeeded += 1;
            }
            else if(i >= 5 && i < 25) {
                expNeeded += 2;
            }
            else if(i >= 25 && i < 50) {
                expNeeded += 3;
            }
            else if(i >= 50 && i < 75) {
                expNeeded += 5;
            }
            else {
                expNeeded += 10;
            }

            levelxpRepository.save(new Levelxp(i, expNeeded));
        }
    }
}
