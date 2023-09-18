package com.example.all4chat.Service.ServiceImpl;

import com.example.all4chat.Entity.All4landDataEntity;
import com.example.all4chat.Repository.All4_repository;
import com.example.all4chat.Service.All4Service;
import com.example.all4chat.dto.All4DTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Log4j2
@RequiredArgsConstructor
public class All4ServiceImpl implements All4Service{
    private final All4_repository repository;
    public All4DTO read(Long id) {
        Optional<All4landDataEntity> result = repository.findById(id);
        return result.isPresent()?entityToDTO(result.get()):null;
    }
    public All4DTO ans(String team, String what){
        Optional<All4landDataEntity> result = Optional.ofNullable(repository.findByTeamContainingAndWhatContaining(team, what));
        return result.isPresent()?entityToDTO(result.get()):null;
    }
}
