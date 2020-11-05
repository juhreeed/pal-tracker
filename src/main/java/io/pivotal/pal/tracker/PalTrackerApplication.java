package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PalTrackerApplication {

    @Bean
    public TimeEntryRepository timeEntryRepository(){
        TimeEntryRepository timeEntryRepository = new InMemoryTimeEntryRepository();
        return timeEntryRepository;
    }

    public static void main(String[] args){
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}
