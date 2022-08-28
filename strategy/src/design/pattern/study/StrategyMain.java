package design.pattern.study;

import design.pattern.study.strategy.*;

public class StrategyMain {

    public static void main(String[] args) {

        Encoder encoder = new Encoder(); // 전략 객체를 사용할 객체

        // base64 전략
        EncodingStrategy base64 = new Base64Strategy();

        // normar 전략
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64); // 사용할 때마다 전략을 세팅
        String base64Result = encoder.getMessage(message);
        System.out.println("base64Result = " + base64Result);

        encoder.setEncodingStrategy(normal); // 사용할 때마다 전략을 세팅
        String normalResult = encoder.getMessage(message);
        System.out.println("normalResult = " + normalResult);

        System.out.println("\n===== 새로운 전략이 추가될 경우 =====");

        // append 전략
        EncodingStrategy append = new AppendStrategy();

        encoder.setEncodingStrategy(append); // 사용할 때마다 전략을 세팅
        String appendResult = encoder.getMessage(message);
        System.out.println("normalResult = " + appendResult);
    }
}
