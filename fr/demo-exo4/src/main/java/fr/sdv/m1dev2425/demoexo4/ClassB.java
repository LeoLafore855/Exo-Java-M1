package fr.sdv.m1dev2425.demoexo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

    private final ClassA classA;

    @Autowired
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public void printMessage() {
        System.out.println("Message de ClassB");
    }
}
