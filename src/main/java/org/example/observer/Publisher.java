package org.example.observer;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, Vacancy vacancy, int salary);
}
