package ru.geekbrains.oop.lesson7.observer;

public interface Observer {
    boolean onReceiveOffer(Offer offer);

    // Is this method should be here?
    OfferType getOfferType();

}
