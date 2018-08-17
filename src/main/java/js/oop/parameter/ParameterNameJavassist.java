package js.oop.parameter;

import javassist.*;
import javassist.bytecode.*;

/**
 * 类直接获取参数名称
 */
public abstract class ParameterNameJavassist {

    public abstract void test1(String myMsg);

    public abstract void test2(String myMsg,int myAge);

    public void fun(String name1,int age1) {
        System.out.println("name:" + name1 + ",age:" + String.valueOf(age1));
    }

    public abstract void test3(String myMsg,int myAge, String mySex);

    /**
     * 获取类方法
     * @param funName
     */
    public static void getClassParamterName(String funName){
        Class<?> clazz = ParameterNameJavassist.class;
        ClassPool pool = ClassPool.getDefault();
        try {
            CtClass ctClass = pool.get(clazz.getName());
            CtMethod ctMethod = ctClass.getDeclaredMethod(funName);
            // 使用javassist的反射方法的参数名
            MethodInfo methodInfo = ctMethod.getMethodInfo();
            CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
            LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute
                    .getAttribute(LocalVariableAttribute.tag);
            if (attr != null) {
                int len = ctMethod.getParameterTypes().length;
                // 非静态的成员函数的第一个参数是this
                int pos = Modifier.isStatic(ctMethod.getModifiers()) ? 0 : 1;
                System.out.print(funName+" : ");
                for (int i = 0; i < len; i++) {
                    System.out.print(attr.variableName(i + pos) + ' ');
                }
                System.out.println();
            }

            System.out.println(funName+"获取结束");

        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取接口参数名称
     * @param funName
     */
    public static void getInterfaceParamterName(Class<?> clazz,String funName){
        ClassPool pool = ClassPool.getDefault();
        try {
            CtClass ctClass = pool.get(clazz.getName());
            CtMethod ctMethod = ctClass.getDeclaredMethod(funName);
            // 使用javassist的反射方法的参数名
            MethodInfo methodInfo = ctMethod.getMethodInfo();

            MethodParametersAttribute methodParameters= (MethodParametersAttribute)methodInfo.getAttribute("MethodParameters");

            //获取参数的个数
            int count =ctMethod.getParameterTypes().length;

            CtClass[] pCtClass= ctMethod.getParameterTypes();

            for(int i=0;i<count;i++) {
                String str = methodParameters.getConstPool().getUtf8Info(ByteArray.readU16bit(methodParameters.get(), i * 4 + 1));
                System.out.println("参数名称:" + str + ",参数类型" + pCtClass[i].getName());
            }

            //取而第一个参数
            //String str= methodParameters.getConstPool().getUtf8Info(ByteArray.readU16bit(methodParameters.get(), 0 * 4 + 1));

            //System.out.println(str);

            //取而第二个参数
            //str= methodParameters.getConstPool().getUtf8Info(ByteArray.readU16bit(methodParameters.get(), 1 * 4 + 1));

            //System.out.println(str);

            System.out.println(funName+"获取结束");

        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            getClassParamterName("fun");
        } catch (Exception e) {
            System.out.println("获取类函数参数出错");
        }


        try {
            /**
             * 抽象函数和接口函数
             */
            getInterfaceParamterName( ParameterNameJavassist.class,"test1");
            getInterfaceParamterName( ParameterNameJavassist.class,"test2");
            getInterfaceParamterName( ParameterNameJavassist.class,"test3");
        } catch (Exception e) {
            System.out.println("获取抽象类/接口函数参数出错");
        }
    }
}
