package js.com.template_method.callback;

/**
 * 回掉类模版
 */
public interface CallBack<T> {
    void beforeAction(T t);
    T doAction(T t);
    void afterAction(T t);
    void finallyAction(T t);
}
