package ru.geekbrains.oop.lesson7.observer;

public enum OfferType {
    IT_MOBILE ("Моб. разраб"),
    IT_WEB ("Веб. разраб"),
    IT_TESTER ("Тестер"),
    IT_GAME_DEV ("Геймдев"),
    IT_TEACHER ("IT преподаватель"),
    HANDYMAN ("Разнорабочий"),
    JANITOR ("Уборщик"),
    BLOGGER ("Блоггер"),
    ACTOR ("Актер"),
    DOCTOR("Домашний доктор");

    public final String desc;

    OfferType(String desc){
        this.desc = desc;
    }
}
