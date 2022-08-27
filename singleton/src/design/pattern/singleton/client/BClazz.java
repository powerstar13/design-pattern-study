package design.pattern.singleton.client;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
