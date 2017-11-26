package behavior.strategy;

import behavior.strategy.fly.FlyBehavior;
import behavior.strategy.quack.QuackBehavior;

/**
 * 鸭子类
 *
 * @author Administrator
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    /**
     * 执行飞行
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 执行叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

