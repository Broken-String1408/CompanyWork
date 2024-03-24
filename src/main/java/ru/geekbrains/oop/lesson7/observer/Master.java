package ru.geekbrains.oop.lesson7.observer;

public class Master extends Worker {

    public Master(String name, OfferType offerType){
        super(name, 80000, offerType);
    }

    @Override
    public boolean onReceiveOffer(Offer offer) {
        return handleOffer("Cпециалист", offer);
    }
}
