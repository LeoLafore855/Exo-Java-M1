package fr.sdv.m1dev2425.demoexo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private final MessageService messageService;

    @Autowired
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser() {
        System.out.println(messageService.getMessage());
    }
}
