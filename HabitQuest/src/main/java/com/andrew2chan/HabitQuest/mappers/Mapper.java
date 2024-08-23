package com.andrew2chan.HabitQuest.mappers;

public interface Mapper<A, B> {
    public B mapEntityToDTO(A a);
    public A mapDTOToEntity(B b);
}
