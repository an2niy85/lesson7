package org.example.observer;

public class Master implements Observer{

    private String name;

    public Master(String name) {
        this.name = name;
    }

    private int salary = 80000;
    private Vacancies vacancies = Vacancies.Мастер;

    @Override
    public void reciveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && vacancy.equals(Vacancies.Мастер)){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
