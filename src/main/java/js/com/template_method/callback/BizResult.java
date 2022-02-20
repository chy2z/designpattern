package js.com.template_method.callback;

/**
 * 业务处理结果
 * @param <T>
 */
public class BizResult<T> {

    T t;

    boolean success;

    public BizResult(T t){
        this.t=t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
