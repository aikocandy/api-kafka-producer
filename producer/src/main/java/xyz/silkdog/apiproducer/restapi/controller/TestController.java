package xyz.silkdog.apiproducer.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.silkdog.apiproducer.restapi.dto.SendRequestDto;
import xyz.silkdog.apiproducer.restapi.service.SendService;

@RequestMapping("/test/v1")
@RestController
@RequiredArgsConstructor
public class TestController {

    private final SendService sendService;

    @PostMapping("send")
    public ResponseEntity<?> send(@RequestBody SendRequestDto sendRequestDto) {
        sendService.send(sendRequestDto.getMessage());
        return ResponseEntity.ok("ok");
    }
}
