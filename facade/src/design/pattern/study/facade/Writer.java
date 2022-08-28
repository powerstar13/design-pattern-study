package design.pattern.study.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        System.out.printf("Writer %s로 연결합니다.\n", fileName);
    }

    public void fileWrite() {
        System.out.printf("Writer %s로 파일 쓰기를 합니다.\n", fileName);
    }

    public void fileDisconnect() {
        System.out.printf("Writer %s의 연결을 종료합니다.\n", fileName);
    }
}
