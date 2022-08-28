package design.pattern.study.facade;

public class Ftp {

    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect() {
        System.out.printf("FTP Host: %s, Port: %d로 연결합니다.\n", host, port);
    }

    public void moveDirectory() {
        System.out.printf("FTP path: %s로 이동합니다.\n", path);
    }

    public void disconnect() {
        System.out.println("FTP 연결을 종료합니다.");
    }
}
