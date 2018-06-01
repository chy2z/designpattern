package js.com.decorator.my;

/**
* @Title: Skill
* @Description: 学习技能
* @author chy
* @date 2018/5/15 14:51
*/
public class Skill extends Hero {

    private Hero hero;

    public Skill(Hero h){
        this.hero=h;
    }

    @Override
    public void learnSkills() {
        if(hero!=null){
            hero.learnSkills();
        }
    }
}
