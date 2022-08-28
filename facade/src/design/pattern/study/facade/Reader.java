package design.pattern.study.facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        System.out.printf("Reader %s로 연결합니다.\n", fileName);
    }

    public void fileRead() {
        System.out.printf("Reader %s의 내용을 읽어옵니다.\n", fileName);
    }

    public void fileDisconnect() {
        System.out.printf("Reader %s의 연결을 종료합니다.\n", fileName);
    }
}
