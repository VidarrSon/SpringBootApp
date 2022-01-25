package train2middle.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        double chance = ThreadLocalRandom.current().nextDouble();
        Health.Builder status = chance > 0.9 ? Health.down(new RuntimeException("Bad luck this time...")) : Health.up();
        return status
                .withDetail("chance", chance)
                .build();
    }
}
