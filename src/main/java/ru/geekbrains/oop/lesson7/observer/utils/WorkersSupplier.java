package ru.geekbrains.oop.lesson7.observer.utils;

import ru.geekbrains.oop.lesson7.observer.*;
import ru.geekbrains.oop.lesson7.observer.Observer;

import java.util.*;

public class WorkersSupplier {

    private static final List<String> workerNames = new ArrayList<>(Arrays.asList("Никита", "Есения", "Александр", "Георгий", "Макар", "Екатерина", "Мирослава", "Матвей", "Алексей", "Анастасия", "Владимир", "Али", "Маргарита", "Арина", "Герман", "Виктория", "Захар", "Даниил", "Варвара", "Константин"));
    private static final Random random = new Random();
    public static List<ru.geekbrains.oop.lesson7.observer.Observer> supplyWorkers(int count){
        if(count <= 0) return new ArrayList<>();
        List<Observer> workers = new ArrayList<>();
        for(int i = 0; i < Math.min(count, workerNames.size()); i++){
            int workerType = random.nextInt(0, 100);
            String workerName = workerNames.get(random.nextInt(0, workerNames.size()));
            workerNames.remove(workerName);
            int offerTypeIndex = random.nextInt(0, OfferType.values().length);
            OfferType offerType = Arrays.stream(OfferType.values()).toList().get(offerTypeIndex);
            if(workerType <= 50) workers.add(new Student(workerName, offerType));
            else if (workerType <= 80) workers.add(new Master(workerName, offerType));
            else workers.add(new SuperPro(workerName, offerType));
        }
        return workers;
    }

}
