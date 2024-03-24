package ru.geekbrains.oop.lesson7.observer;

import java.util.Arrays;
import java.util.Random;

public class Company {

    private final Random random = new Random();

    private final String name;

    private final Publisher jobAgency;

    private final int maxSalary;

    private final int minSalary;

    public Company(String name, Publisher jobAgency, int maxSalary, int minSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(minSalary, maxSalary);
        int offerTypeIndex = random.nextInt(0, OfferType.values().length);
        OfferType offerType = Arrays.stream(OfferType.values()).toList().get(offerTypeIndex);
        jobAgency.sendOffer(name, salary, offerType);
    }


}
