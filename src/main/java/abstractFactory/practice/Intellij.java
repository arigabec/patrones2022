package abstractFactory.practice;

import abstractFactory.practice.Ide;

public class Intellij implements Ide {
    @Override
    public void showInfo() {
        System.out.println("Esta es una instancia de IntelliJ");
    }
}
