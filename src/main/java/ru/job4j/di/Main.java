package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Buba Kastorsky");
        ui.add("Yoda Jedi");
        ui.print();

        context.get(ConsoleInput.class).askStr("How r u?");
    }
}
