package js.com.template_method.callback;


public interface BizOperation {
    <T> BizResult<T> exec(CallBack<T> callBack, T t);
}
