package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class PalTrackerApplication {

    @Bean
    public JdbcTimeEntryRepository jdbcTimeEntryRepository(@Autowired DataSource dataSource){
        JdbcTimeEntryRepository jdbcTimeEntryRepository = new JdbcTimeEntryRepository(dataSource);
        return jdbcTimeEntryRepository;
    }

    public static void main(String[] args){
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}
