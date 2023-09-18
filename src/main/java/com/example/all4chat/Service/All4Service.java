package com.example.all4chat.Service;


import com.example.all4chat.Entity.All4landDataEntity;
import com.example.all4chat.dto.All4DTO;

public interface All4Service {

    All4DTO read(Long id);
    All4DTO ans(String team, String what);

    default All4DTO entityToDTO(All4landDataEntity entity){
        All4DTO dto = All4DTO.builder()
                .id(entity.getId())
                .team(entity.getTeam())
                .what(entity.getWhat())
                .detail(entity.getDetail())
                .build();
        return dto;
    }
}
