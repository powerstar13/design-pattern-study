package design.pattern.study;

import design.pattern.study.adapter.*;

public class AdapterMain {

    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanerAdapter = new SocketAdapter(cleaner); // 220V의 제품을 어댑터에 넣어서 사용
        connect(cleanerAdapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    /**
     * 110V만 사용할 수 있는 콘센트 역할
     */
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
