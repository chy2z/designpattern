package js.com.template_method.my;

/**
* @Title: JavaSoftWare
* @Description: java 软件系统
* @author chy
* @date 2018/5/12 15:54
*/
public class JavaSoftWare extends SoftwareEngineering {

    @Override
    protected void se_需求分析(){
        System.out.println("java 需求分析");
    }

    @Override
    protected void se_开发阶段(){
        System.out.println("java 开发阶段");
    }

    @Override
    protected void se_设计(){
        System.out.println("java 设计");
    }

    @Override
    protected void se_实现(){
        System.out.println("java 实现");
    }

    @Override
    protected void se_测试(){
        System.out.println("java 测试");
    }

}
