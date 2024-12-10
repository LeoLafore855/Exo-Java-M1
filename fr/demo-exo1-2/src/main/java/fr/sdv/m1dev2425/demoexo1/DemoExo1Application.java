package fr.sdv.m1dev2425.demoexo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoExo1Application {
    public static void main(String[] args) {
        var context = SpringApplication.run(DemoExo1Application.class, args);

        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.notifyUser();
    }
}
