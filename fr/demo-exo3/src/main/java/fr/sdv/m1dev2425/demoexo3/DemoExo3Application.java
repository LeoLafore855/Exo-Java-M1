package fr.sdv.m1dev2425.demoexo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoExo3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoExo3Application.class, args);

        NotificationService service1 = context.getBean(NotificationService.class);
        NotificationService service2 = context.getBean(NotificationService.class);

        service1.sendNotification("Message pour service1");
        service2.sendNotification("Message pour service2");

        service1.sendNotification("Second message pour service1");
        service2.sendNotification("Second message pour service2");
    }
}
