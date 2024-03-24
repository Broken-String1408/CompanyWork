package ru.geekbrains.oop.lesson7.observer;

public class SuperPro extends Worker {

    public SuperPro(String name, OfferType offerType){
        super(name, 150000, offerType);
    }
    @Override
    public boolean onReceiveOffer(Offer offer) {
        return handleOffer("Супер про", offer);
    }
}
