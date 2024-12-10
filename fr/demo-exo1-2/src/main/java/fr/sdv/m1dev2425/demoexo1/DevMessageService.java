package fr.sdv.m1dev2425.demoexo1;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Message de développement";
    }
}

