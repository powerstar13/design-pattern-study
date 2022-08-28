package design.pattern.singleton;

import design.pattern.singleton.study.AClazz;
import design.pattern.singleton.study.BClazz;
import design.pattern.singleton.study.SocketClient;

public class SingletonMain {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
