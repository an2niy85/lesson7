package org.example.observer;

public class Cleaner implements Observer {

    private String name;

    public Cleaner(String name) {
        this.name = name;
    }

    private int salary = 15000;
    private Vacancies vacancies = Vacancies.Уборщик;

    @Override
    public void reciveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && vacancy.equals(Vacancies.Уборщик)){
            System.out.printf("Уборщик %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Уборщик %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
