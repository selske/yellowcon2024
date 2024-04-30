package be.yellowcon.hexagonal.bootstrap;

import be.yellowcon.hexagonal.domain.aggregate.UseCaseHandler;
import be.yellowcon.hexagonal.domain.ports.in.UseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    UseCase useCase() {
        return new UseCaseHandler();
    }

}
