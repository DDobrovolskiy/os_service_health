package os.service.health.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "health", produces = {MediaType.APPLICATION_JSON_VALUE})
public class HealthCheck {
    @GetMapping(value = "check")
    public String check() {
        return "OK";
    }
}
