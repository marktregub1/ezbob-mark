package org.ezbobhiring.logging;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @PostMapping("/log")
    public void printLog(@RequestBody String message) {
        System.out.println(message);
    }
}
