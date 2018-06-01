package js.com.template_method.my;

/**
* @Title: SoftwareEngineering
* @Description: 软件工程
* @author chy
* @date 2018/5/12 15:45
*/
public abstract class SoftwareEngineering {

    public void work() {
        se_需求分析();
        se_开发阶段();
        se_设计();
        se_实现();
        se_测试();
    }

    protected abstract void se_需求分析();

    protected abstract void se_开发阶段();

    protected abstract void se_设计();

    protected abstract void se_实现();

    protected abstract void se_测试();

}
