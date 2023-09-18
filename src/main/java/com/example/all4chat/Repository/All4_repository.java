package com.example.all4chat.Repository;

import com.example.all4chat.Entity.All4landDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface All4_repository extends JpaRepository<All4landDataEntity,Long> {
    All4landDataEntity findByTeamContainingAndWhatContaining(String team, String what);

}
