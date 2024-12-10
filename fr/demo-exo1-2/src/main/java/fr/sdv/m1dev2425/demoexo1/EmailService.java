package fr.sdv.m1dev2425.demoexo1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("email")
public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Message envoyé par email.";
    }
}
