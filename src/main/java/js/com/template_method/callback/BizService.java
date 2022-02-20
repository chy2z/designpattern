package js.com.template_method.callback;

/**
 * 提供业务
 */
public class BizService {

    public BizResult<String> query(String key){

        BizTemplate bizTemplate=new BizTemplate();

        BizResult<String> bizResult=  bizTemplate.exec(new DefaultCallBack<String>() {
            @Override
            public void beforeAction(String o) {
                super.beforeAction(o);
            }

            @Override
            public String doAction(String o) {
                super.doAction(o);
                // todo 业务代码
                return "业务数据";
            }

            @Override
            public void afterAction(String o) {
                super.afterAction(o);
            }

            @Override
            public void finallyAction(String o) {

            }
        },key);

        return  bizResult;

    }


}
