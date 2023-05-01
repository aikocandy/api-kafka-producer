package xyz.silkdog.apiproducer.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.silkdog.apiproducer.kafka.listener.KafkaSender;

@Service
@RequiredArgsConstructor
public class SendService {

    private final KafkaSender kafkaSender;

    public void send(String message) {
        kafkaSender.sendMessage(message);
    }
}
