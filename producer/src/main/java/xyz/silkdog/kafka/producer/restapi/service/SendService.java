package xyz.silkdog.kafka.producer.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.silkdog.kafka.producer.kafka.listener.KafkaSender;

@Service
@RequiredArgsConstructor
public class SendService {

    private final KafkaSender kafkaSender;

    public void send(String message) {
        kafkaSender.sendMessage(message);
    }
}
