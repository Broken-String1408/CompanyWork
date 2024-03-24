package ru.geekbrains.oop.lesson7.observer;

public abstract class Worker implements Observer {

    private final String name;
    private int salary;
    private final OfferType offerType;

    public Worker(String name, int salary, OfferType offerType){
        this.name = name;
        this.salary = salary;
        this.offerType = offerType;
    }

    @Override
    public OfferType getOfferType() {
        return offerType;
    }

    public boolean handleOffer(String workerType, Offer offer){

        if (this.salary <= offer.salary()){
            System.out.printf("%s(%s) %s: Мне нужна эта работа! (компания: %s; заработная плата: %d, вакансия: %s)\n",
                    workerType, offerType.desc, this.name, offer.companyName(), offer.salary(), offer.offerType().desc);
            this.salary = offer.salary();
            return true;
        }

        System.out.printf("%s(%s) %s: Я найду работу получше! (компания: %s; заработная плата: %d, вакансия: %s)\n",
                workerType, offerType.desc, this.name, offer.companyName(), offer.salary(), offer.offerType().desc);
        return false;
    }

}
