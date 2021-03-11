package ru.geekbraines.worker;

public class Worker {
    String fio;
    String post;
    String email;
    String phone;
    int pay;
    int age;

    Worker(String fio, String post, String email, String phone, int pay, int age) {

        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void printData(Worker w) {
        System.out.printf("\nФИО: %s\nДолжность: %s\ne-mail адрес: %s\nТелефон: %s\nЗаработная плата: %d\nВозраст: %d\n",
                w.fio, w.post, w.email, w.phone, w.pay, w.age);
    }
}
