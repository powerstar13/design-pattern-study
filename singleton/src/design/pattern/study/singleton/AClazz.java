package design.pattern.study.singleton;

public class AClazz { // Class 키워드로 클래스명을 작성할 수 없으므로 Clazz로 만드는 것이 관례이다.

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance(); // 싱글톤 패턴은 기본 생성자를 통해 생성할 수 없으며, static 메서드인 getInsatance를 통해 만들 수 있다.
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
