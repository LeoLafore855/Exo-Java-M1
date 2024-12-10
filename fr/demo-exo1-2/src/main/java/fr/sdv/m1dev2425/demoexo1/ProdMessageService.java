package fr.sdv.m1dev2425.demoexo1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Message de production";
    }
}
