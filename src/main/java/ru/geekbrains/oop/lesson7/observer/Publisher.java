package ru.geekbrains.oop.lesson7.observer;

public interface Publisher {

    void sendOffer(String companyName, int salary, OfferType offerType);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
