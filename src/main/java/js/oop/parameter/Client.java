package js.oop.parameter;

public class Client {

    public static void main(String[] args) {

        try {
            /**
             * 抽象函数和接口函数
             */
            ParameterNameJavassist.getInterfaceParamterName(IParameterNameJavassist.class,"test1");
            ParameterNameJavassist.getInterfaceParamterName(IParameterNameJavassist.class,"test2");
            ParameterNameJavassist.getInterfaceParamterName(IParameterNameJavassist.class,"test3");
        } catch (Exception e) {
            System.out.println("获取抽象类/接口函数参数出错");
        }
    }
}
