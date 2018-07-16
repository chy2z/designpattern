package js.oop.reflect;

import java.lang.reflect.Type;

/**
* @Title: ChildClass
* @Description: 测试类型反射
* @author chy
* @date 2018/7/2 14:46
*/
@MyAnnotaion
public class ChildClass extends ParentClass implements Interface1,Interface2 {

    @MyAnnotaion
    public void test(){

    }

    public void print(){
        System.out.println("ChildClass");
    }

    public static void main(String[] args){
        try {
            Class<?> beanClass = Class.forName("js.oop.reflect.ChildClass");

            try {
                ChildClass child= (ChildClass)beanClass.newInstance();
                child.print();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            //是否是注解
            if(beanClass.isAnnotation()){
                System.out.println("isAnnotation");
            }
            //是否是接口
            else if(beanClass.isInterface()){
                System.out.println("isInterface");
            }
            //内部匿名类
            else if(beanClass.isAnonymousClass()){
                System.out.println("isAnonymousClass");
            }
            //局部类
            else if(beanClass.isLocalClass()){
                System.out.println("isLocalClass");
            }
            //内部类
            else if(beanClass.isMemberClass()){
                System.out.println("isMemberClass");
            }

            //获得beanClass所实现的所有接口
            //接口对象顺序和这个对象所表示的类中implements子句中接口名的顺序一致
            Class<?> interfaces[] = beanClass.getInterfaces();
            for (Class<?> inte : interfaces) {
                System.out.println("beanClass实现接口："+inte);
            }

            Type[] types= beanClass.getGenericInterfaces();
            for(Type c :types) {
                System.out.println("beanClass实现接口：" + c.toString());
            }

            //获取超类
            System.out.println(beanClass.getGenericSuperclass());

            //返回类中定义的公共、私有、保护的内部类
            Class<?>[] classesD= beanClass.getDeclaredClasses();
            for( Class<?> c:classesD){
                System.out.println("Class：" + c.toString());
            }

            //返回类定义的公共的内部类,以及从父类、父接口那里继承来的内部类
            Class<?>[] classes= beanClass.getClasses();
            for( Class<?> c:classes){
                System.out.println("Class：" + c.toString());
            }

            //是否存在注解
            if(beanClass.isAnnotationPresent(MyAnnotaion.class)){
                System.out.println("isAnnotationPresent:MyAnnotaion");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
