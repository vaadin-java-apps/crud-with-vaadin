package pl.pawtel.testowycrudzbaza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pawtel.testowycrudzbaza.repository.RegistryRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner loadData(RegistryRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Registry("San", "Lesko", "trout"));
            repository.save(new Registry("Dunajec", "Lesko", "trout"));
            repository.save(new Registry("Drawa", "Lesko", "trout"));
            repository.save(new Registry("Wapnik", "Lesko", "trout"));
        };
    }
}
