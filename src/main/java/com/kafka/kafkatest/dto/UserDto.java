package com.kafka.kafkatest.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserDto {
    private String username;
    private String email;
    private String message;
    private boolean active;
}
