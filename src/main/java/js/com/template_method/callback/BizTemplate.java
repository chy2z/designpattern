package js.com.template_method.callback;


public class BizTemplate implements BizOperation {
    @Override
    public <T> BizResult<T> exec(CallBack<T> callBack,T t) {
        BizResult<T> bizResult = new BizResult<>(t);
        try {
            callBack.beforeAction(t);
            callBack.doAction(t);
            callBack.afterAction(t);
        } catch (Exception e) {
            bizResult.setSuccess(false);
        } finally {
            callBack.finallyAction(t);
        }
        bizResult.setSuccess(true);
        return bizResult;
    }
}
