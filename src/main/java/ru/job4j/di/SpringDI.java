package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        Store store = context.getBean(Store.class);
        store.add("Yoda Jedi");
        Store store2 = context.getBean(Store.class);
        store2.add("Obi-van");
        store.getAll().forEach(System.out::println);
        store2.getAll().forEach(System.out::println);
    }
}
