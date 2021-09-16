package com.kafka.kafkatest.consumer;

import com.kafka.kafkatest.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {
    @KafkaListener(topics = {"test"}, containerFactory = "singleFactory")
    public void consume(UserDto userDto){
        log.info("EVENT {}",userDto);
    }
}
