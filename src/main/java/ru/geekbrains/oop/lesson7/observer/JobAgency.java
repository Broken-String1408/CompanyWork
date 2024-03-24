package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JobAgency implements Publisher {

    private final Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(String companyName, int salary, OfferType offerType){
        List<Observer> accepted = new ArrayList<>();
        boolean isWorkersAvailable = false;
        for (Observer observer : observers){
            if(observer.getOfferType() == offerType){
                isWorkersAvailable = true;
                boolean isAccepted = observer
                        .onReceiveOffer(new Offer(companyName, salary, offerType));
//                  Modifying list while iterating through it?
                if(isAccepted){
//                        removeObserver(observer);
//                        return;
                    accepted.add(observer);
                }
            }
        }
        if(!isWorkersAvailable) System.out.printf("%s не нашел соискателей для: %s\n", companyName, offerType.desc);
        for(Observer observer: accepted){
            removeObserver(observer);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
