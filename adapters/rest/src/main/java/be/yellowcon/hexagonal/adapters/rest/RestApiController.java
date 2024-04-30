package be.yellowcon.hexagonal.adapters.rest;

import be.yellowcon.hexagonal.domain.ports.in.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private final UseCase useCase;

    @Autowired
    public RestApiController(UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
