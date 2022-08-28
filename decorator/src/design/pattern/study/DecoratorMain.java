package design.pattern.study;

import design.pattern.study.decorator.*;

public class DecoratorMain {

    public static void main(String[] args) {

        // 기본 뼈대
        ICar audi = new Audi(1000);
        audi.showPrice();

        // 기본 뼈대를 두고 부가적인 첨가를 하는 데코레이터 패턴
        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
    }
}
