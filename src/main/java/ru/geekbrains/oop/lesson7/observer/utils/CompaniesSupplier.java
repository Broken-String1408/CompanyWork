package ru.geekbrains.oop.lesson7.observer.utils;

import ru.geekbrains.oop.lesson7.observer.Company;
import ru.geekbrains.oop.lesson7.observer.Publisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class CompaniesSupplier {

    static Random random = new Random();
    private final static String [] companyNames = {"Yandex", "Geekbrains", "Google", "Ozon", "Wildberries", "Magnit"};

    public static List<Company> getCompanies(Publisher publisher){
        List<Company> companies = new ArrayList<>();
        for (String companyName : companyNames) {
            companies.add(new Company(
                    companyName,
                    publisher,
                    random.nextInt(55_000, 180_000),
                    random.nextInt(20_000, 55_000)
            ));
        }
        return companies;
    }

}
