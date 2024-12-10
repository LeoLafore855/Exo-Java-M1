package fr.sdv.m1dev2425.demoexo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScopesApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(ScopesApplication.class, args);

        NotificationService service1 = context.getBean(NotificationService.class);
        NotificationService service2 = context.getBean(NotificationService.class);

        service1.sendNotification("Message pour service1");
        service2.sendNotification("Message pour service2");

        service1.sendNotification("Second message pour service1");

        SpringApplication.exit(context);
    }
}
