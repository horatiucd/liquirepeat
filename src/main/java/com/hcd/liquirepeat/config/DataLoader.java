package com.hcd.liquirepeat.config;

import com.hcd.liquirepeat.domain.Minifig;
import com.hcd.liquirepeat.repository.MinifigRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Slf4j
@Configuration
public class DataLoader {

    //uncomment to add data at start-up
    //@Bean
    public CommandLineRunner init(MinifigRepository repository) {
        return args -> {
            Minifig harry = new Minifig("Harry Potter");
            Minifig ron = new Minifig("Ron Weasley");
            Minifig hermione = new Minifig("Hermione Granger");

            List.of(harry, ron, hermione)
                    .forEach(minifig -> log.info("Persisted {}.", repository.save(minifig)));
        };
    }
}
