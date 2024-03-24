package ru.geekbrains.oop.lesson7.observer;

import ru.geekbrains.oop.lesson7.observer.utils.CompaniesSupplier;
import ru.geekbrains.oop.lesson7.observer.utils.WorkersSupplier;

import java.util.List;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        List<Company> companies = CompaniesSupplier.getCompanies(publisher);


        List<Observer> workers = WorkersSupplier.supplyWorkers(10);

        for(Observer observer: workers){
            publisher.registerObserver(observer);
        }

        for(Company company: companies){
            company.needEmployee();
        }

    }

}
