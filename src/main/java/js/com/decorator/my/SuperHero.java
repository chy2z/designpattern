package js.com.decorator.my;

/**
* @Title: SuperHero
* @Description: 英雄名字叫 超级英雄
* @author chy
* @date 2018/5/15 14:46
*/
public class SuperHero extends Hero {

    private String name;

    public SuperHero(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了新技能");
    }
}
