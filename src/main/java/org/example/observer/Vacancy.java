package org.example.observer;

import java.util.Comparator;

public class Vacancy implements Comparable {
    private Vacancies vacancy;
    private int salary;

    public Vacancy(Vacancies vacancies) {
        this.vacancy = vacancies;
    }

    public Vacancies getName() {
        return vacancy;
    }

    @Override
    public String toString() {
        return String.format("Вакансия на позицию \"%s\"", vacancy);
    }


    public int compareTo(Vacancies vacancies) {
        if (this.vacancy == vacancies)
            return 1;
        else return 0;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.parseInt(String.valueOf((this.vacancy == (Vacancies) o)));
    }

    @Override
    public boolean equals(Object obj) {
        return this.vacancy == (Vacancies) obj ;
    }
}
