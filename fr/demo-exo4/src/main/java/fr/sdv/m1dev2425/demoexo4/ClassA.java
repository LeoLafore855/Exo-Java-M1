package fr.sdv.m1dev2425.demoexo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    private final ClassB classB;

    @Autowired
    public ClassA(@Lazy ClassB classB) {
        this.classB = classB;
    }

    public void printMessage() {
        System.out.println("Message de ClassA");
    }
}
