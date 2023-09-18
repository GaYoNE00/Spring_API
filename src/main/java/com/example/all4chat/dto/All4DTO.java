package com.example.all4chat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class All4DTO {

    private Long id;
    private String team;
    private String what;
    private String detail;

}
