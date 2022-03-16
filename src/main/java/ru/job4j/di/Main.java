package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(ConsoleInput.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Buba Kastorsky");
        ui.add("Yoda Jedi");
        ui.print();

        ConsoleInput ci = context.get(ConsoleInput.class);

        ci.askStr("How r u?");
    }
}
