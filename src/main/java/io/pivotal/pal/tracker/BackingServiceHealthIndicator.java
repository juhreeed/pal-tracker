package io.pivotal.pal.tracker;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class BackingServiceHealthIndicator implements HealthIndicator {

    private final BackingService service;
    BackingServiceHealthIndicator(BackingService service){
        this.service = service;
    }

    public Health health(){
        Health.Builder builder = new Health.Builder();
        if(service.ping()){
            builder.up();
        } else {
            builder.down();
        }
        return builder.build();
    }
}
