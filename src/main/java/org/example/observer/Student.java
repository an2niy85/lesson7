package org.example.observer;

public class Student implements Observer{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    private int salary = 2000;
    private Vacancies vacancies = Vacancies.Студент;

    @Override
    public void reciveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && vacancy.equals(Vacancies.Студент)){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
