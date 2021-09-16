package com.kafka.kafkatest.controller;

import com.kafka.kafkatest.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("api/v1/kafka")
@RequiredArgsConstructor
public class KafkaProducerController {
    private final KafkaTemplate<Long, UserDto> kafkaTemplate;
    @GetMapping("{count}")
    public String sentToTopic(@PathVariable Integer count) throws ExecutionException, InterruptedException {
        for(int i=0;i<count;i++){
            kafkaTemplate.send("test", new UserDto().setEmail("TestEmail"+i).setUsername("firstUsername"+i));
        }
        return "OK";
    }

}
