package abstractFactory.practice;

import abstractFactory.practice.Ide;

public class VSCode implements Ide {
    @Override
    public void showInfo() {
        System.out.println("Esta es una instancia de VSCode");
    }
}
