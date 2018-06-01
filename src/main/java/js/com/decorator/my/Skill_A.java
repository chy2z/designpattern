package js.com.decorator.my;

/**
* @Title: Skill_A
* @Description: 技能A
* @author chy
* @date 2018/5/15 15:19
*/
public class Skill_A extends Skill {

    private String skillName;

    public Skill_A(Hero hero,String skillName){
        super(hero);
        this.skillName=skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("开始学习技能"+skillName);
        super.learnSkills();
        System.out.println("结束学习技能"+skillName);
    }
}
