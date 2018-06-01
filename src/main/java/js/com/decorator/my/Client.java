package js.com.decorator.my;

/**
* @Title: Client
* @Description: 装饰器模式:用来包装原有的类,向一个现有的对象添加新的功能,同时又不改变其结构
  关键词: 包装
  打个比方: 竞技游戏 英雄学习4个技能
* @author chy
* @date 2018/5/15 11:14
*/
public class Client {

      public static void main(String[] args) {

          Hero hero = new SuperHero("超人");

          Skill_A a = new Skill_A(hero, "A");
          Skill_B b = new Skill_B(a, "B");

          //学习技能A
          //a.learnSkills();

          //同时学习技能A和技能B
          b.learnSkills();
      }
}