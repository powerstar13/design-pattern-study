package design.pattern.singleton.client;

public class SocketClient {

    private static SocketClient socketClient = null; // 싱글톤 패턴은 자기 자신을 private으로 기본적으로 가지고 있어야 한다. (static 메서드를 통해 제공해야 하므로 static 변수로 제공, null로 초기화)

    /**
     * 기본 생성자를 통해 만들 수 없도록 private으로 막아둬야 한다.
     */
    private SocketClient() {
    }

    /**
     * static 메서드인 getter를 통해 제공해야 한다.
     */
    public static SocketClient getInstance() {

        if (socketClient == null) // null인 경우 객체를 생성하여 제공
            socketClient = new SocketClient();

        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
