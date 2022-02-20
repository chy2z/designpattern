package js.java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Lambda例子
 */
public class LambdaCase {

    static class Student {
        String name;
        Integer age;
        String sex;
        Integer money;
        double length;

        public Student(String name, Integer age, String sex, Integer money, double length) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.money = money;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Integer getMoney() {
            return money;
        }

        public void setMoney(Integer money) {
            this.money = money;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("chy", 25, "男", 100, 180));
        students.add(new Student("zjj", 30, "女", 1000, 165));
        students.add(new Student("jack", 35, "男", 200, 170));
        students.add(new Student("json", 28, "女", 500, 175));

        Map<String, Student> studentsMap = new HashMap<>();
        studentsMap.put("1001", new Student("chy", 25, "男", 100, 180));
        studentsMap.put("1002", new Student("zjj", 30, "女", 1000, 165));
        studentsMap.put("1003", new Student("json", 28, "女", 500, 175));

        //转换
        List<String> names = students.stream().map(v -> v.name).collect(Collectors.toList());

        names.stream().forEach(v->System.out.println(v));

        List<Integer> ages = students.stream().map(v -> v.age).collect(Collectors.toList());

        ages.stream().forEach(v->System.out.println(v));

        //List 过滤和转换
        names=students.stream().filter(v->"男".equals(v.getSex())).map(v -> v.name).collect(Collectors.toList());

        names.stream().forEach(v->System.out.println(v));

        List<Student> filterStudents=students.stream().filter(v->"男".equals(v.getSex())).collect(Collectors.toList());

        filterStudents.stream().forEach(v->System.out.println(v.getName()));

        //Map 过滤和转换
        names=studentsMap.entrySet().stream().filter(entry->entry.getValue().money>=500).map(entry->entry.getValue().name).collect(Collectors.toList());

        names.stream().forEach(v->System.out.println(v));

        Set<Map.Entry<String, Student>> filterstudentsMap= studentsMap.entrySet().stream().filter(entry->entry.getValue().money>=500).collect(Collectors.toSet());

        filterstudentsMap.stream().forEach(entry->System.out.println(entry.getValue().name));

        //Map 过滤和转换
        List<Student> List= studentsMap.entrySet().stream().filter(entry->entry.getValue().length>=180)
                .map(entry->{
                    return  entry.getValue();
                })
                .collect(Collectors.toList());

        List.stream().forEach(v->System.out.println(v.getName()));

        //过滤空对象
        studentsMap.keySet().stream().filter(Objects::nonNull).forEach(System.out::println);

        //匹配1条
       Optional<Student> optional= students.stream().filter(v->v.length>=180).findFirst();

       if(optional.isPresent()){
           System.out.println("找到");
       }
       else{
           System.out.println("没找到");
       }


        //最大年龄
        Optional<Student> max =students.stream().max((o1, o2)->o1.getAge().compareTo(o2.getAge()));

        if(optional.isPresent()){
            System.out.println("最大年龄:"+max.get().getAge());
        }
        else{
            System.out.println("没找到");
        }

        //最小年龄
        Optional<Student> min =students.stream().min((o1, o2)->o1.getAge().compareTo(o2.getAge()));

        if(optional.isPresent()){
            System.out.println("最小年龄:"+min.get().getAge());
        }
        else{
            System.out.println("没找到");
        }

        //去重复
        List<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.stream().distinct().forEach(System.out::println);

    }
}
