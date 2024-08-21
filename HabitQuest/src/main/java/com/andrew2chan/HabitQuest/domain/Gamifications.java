package com.andrew2chan.HabitQuest.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "gamifications")
public class Gamifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public long xp = 0;

    @ManyToMany(mappedBy = "gamifications")
    public List<Badges> badges;

    @OneToOne
    @JoinColumn(name = "user_id")
    public Users user;
}
