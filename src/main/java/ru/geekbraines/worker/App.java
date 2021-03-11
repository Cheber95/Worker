package ru.geekbraines.worker;

public class App {

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        createWorkers(workers);
        for (Worker worker : workers) {
            if (worker.age > 40) {
                worker.printData(worker);
            }
        }
    }

    public static void createWorkers(Worker[] workers) {
        workers[0] = new Worker("Иванов Иван Владимирович",
                "Инженер",
                "ivanov@google.com",
                "+79851234567",
                40000,
                38);
        workers[1] = new Worker("Васильев Василий Иванович",
                "Техник",
                "vasya@google.com",
                "+79161234567",
                280000,
                41);
        workers[2] = new Worker("Кузнецов Ян Петрович",
                "Экономист",
                "kuzya@google.com",
                "+79031234567",
                23000,
                18);
        workers[3] = new Worker("Петров Алексей Алексеевич",
                "Заведующий складом",
                "petrow@google.com",
                "+79671234567",
                35000,
                65);
        workers[4] = new Worker("Панов Арсений Игоревич",
                "Охранник",
                "panov@google.com",
                "+79261234567",
                90000,
                29);
    }

}
