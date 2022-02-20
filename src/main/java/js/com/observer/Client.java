package js.com.observer;

/**
 * 观察者模式
 *
 */
public class Client {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver ob1 = new ConcreteObserver(subject, "A");
        ConcreteObserver ob2 = new ConcreteObserver(subject, "B");

        subject.attach(ob1);
        subject.attach(ob2);

        subject.setSubjectState("ABC");

        subject.notifySubs();

    }
}
