package Homework_Lesson4.Task5;

public class NotifierHandler extends Notifier {
    void addNotifier(Notifier notifier) {

    }
    void notifyAll(Notifier notifier) {
    }
}
/*Задание 5.
        Создайте абстрактный класс Notifier с единственным методом notify. Создайте
        дочерние классы. EmailNotifier, SMSNotifier, MessangerNotifier.
        Создайте класс NotifierHandler. Добавьте метод, который позволяет добовлять новый
        способ уведомления. Напрмер, addNotifier(Notifier notifier). Добавьте метод notifyAll().
        Данный метод будет брать все имеющиеся у него объекты Notifier и будет вызывать у
        них метод notify.
        Реализацией метода notify может быть просто вывод в консоль, например для
        EmailNotifier: «Уведомление по email выполнено».*/