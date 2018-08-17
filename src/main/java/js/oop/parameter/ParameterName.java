package js.oop.parameter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * java 1.8
 * 编译器时加上-parameters
 */
public abstract class ParameterName {

    public void fun(String name1,int age1) {
        System.out.println("name:" + name1 + ",age:" + String.valueOf(age1));
    }

    public abstract void test(String msg,int age);

    /**
     * 切换编译环境 java1.8
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws  Exception {



        Method method = ParameterName.class.getMethod("fun",String.class,int.class);
        //@since 1.8
        Parameter[] parameters= method.getParameters();
        Arrays.stream(parameters).forEach(parameter -> {
             System.out.println(parameter.getName());
        });

        method = ParameterName.class.getMethod("test",String.class,int.class);
        parameters= method.getParameters();
        Arrays.stream(parameters).forEach(parameter -> {
            System.out.println(parameter.getName());
        });


    }

}
