package com.stockcontrol.stockcontrol.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private Long roleId;
}
