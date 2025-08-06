package com.beratyesbek.springcloudgcpfirestore;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {

    private final  DeviceRepository deviceRepository;

    @PostMapping
    public ResponseEntity<Device> create(@RequestBody Device device) {
        device = deviceRepository.save(device).block();
        return ResponseEntity.ok(device);
    }
}
