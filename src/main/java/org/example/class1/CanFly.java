package org.example.class1;

public interface CanFly {

    void fly();

}

interface HasWings {

    public abstract Object getWindSpan();

}

abstract class Falcon implements CanFly, HasWings {

}