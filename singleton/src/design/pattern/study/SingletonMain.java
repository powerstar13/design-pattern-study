package design.pattern.study;

import design.pattern.study.singleton.AClazz;
import design.pattern.study.singleton.BClazz;
import design.pattern.study.singleton.SocketClient;

public class SingletonMain {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.printf("두 개의 객체가 동일한가? %s\n", aClient.equals(bClient));
    }
}
