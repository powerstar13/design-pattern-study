package design.pattern.study.adapter;

public class SocketAdapter implements Electronic110V { // 자신의 형태는 110V이다.

    private Electronic220V electronic220V; // 어댑터 패턴을 통해 연결할 220V

    /**
     * 두 개의 인터페이스를 사용하고자 할 때 중간에 어댑터를 두어 연결시켜주는 패턴이다.
     */
    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
