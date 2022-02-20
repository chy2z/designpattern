package js.com.template_method.callback;

/**
 * 默认回掉类
 * @param <T>
 */
public abstract class DefaultCallBack<T> implements CallBack<T> {

    @Override
    public void beforeAction(T t) {

    }

    @Override
    public T doAction(T t) {
        return null;
    }

    @Override
    public void afterAction(T t) {

    }
}
