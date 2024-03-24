package ru.geekbrains.oop.lesson7.observer;

public class Student extends Worker {

    public Student(String name, OfferType offerType){
        super(name, 5000, offerType);
    }

    @Override
    public boolean onReceiveOffer(Offer offer) {
        return handleOffer("Студент", offer);
    }
}
