package com.andrew2chan.HabitQuest.services;

public interface SecurityService {
    public String hashPassword(String plainTextPassword);
    public boolean checkPassword(String plainTextPassword, String hashedPassword);
}
