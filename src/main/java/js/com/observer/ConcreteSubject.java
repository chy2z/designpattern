package js.com.observer;

/**
 * 具体的被观察者
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    public void notifySubs() {
        this.notifyOb();
    }
}
