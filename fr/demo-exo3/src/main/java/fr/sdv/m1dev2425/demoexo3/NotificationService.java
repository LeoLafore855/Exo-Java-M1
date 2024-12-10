package fr.sdv.m1dev2425.demoexo3;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NotificationService {
    private int notificationCount = 0;

    public void sendNotification(String message) {
        notificationCount++;
        System.out.println("Notification envoyée : " + message);
        System.out.println("Nombre de notifications envoyées : " + notificationCount);
    }

    @PostConstruct
    public void init() {
        System.out.println("NotificationService initialisé.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("NotificationService détruit.");
    }
}
