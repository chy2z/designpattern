package js.com.observer;


public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;

    private String name;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(name + " update message:" + subject.getSubjectState());
    }
}
