package design.pattern.study;

import design.pattern.study.facade.Ftp;
import design.pattern.study.facade.Reader;
import design.pattern.study.facade.SftpClient;
import design.pattern.study.facade.Writer;

public class FacadeMain {

    public static void main(String[] args) {

        System.out.println("===== Facade 패턴을 적용하기 전 =====");

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disconnect();

        System.out.println("\n===== Facade 패턴을 적용한 후 =====");

        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        // 클라이언트는 추상화된 메서드를 사용하여 복잡도를 낮춘다.
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
    }
}
