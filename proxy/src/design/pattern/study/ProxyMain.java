package design.pattern.study;

import design.pattern.study.aop.AopBrowser;
import design.pattern.study.proxy.Browser;
import design.pattern.study.proxy.BrowserProxy;
import design.pattern.study.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyMain {

    public static void main(String[] args) {

        // 호출할 때마다 로딩하는 방식
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        System.out.println();

        // 캐시 기능을 하는 Proxy를 사용하여 로딩하는 방식
        IBrowser browserCache = new BrowserProxy("www.naver.com");
        browserCache.show();
        browserCache.show();
        browserCache.show();
        browserCache.show();

        System.out.println();

        // 프록시 패턴으로 AOP를 사용하여 수행 시간을 측정하기
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
            () -> { // Runnable 익명 내부 클래스
                System.out.println("before");
                start.set(System.currentTimeMillis()); // 시작 시간
            },
            () -> { // Runnable 익명 내부 클래스
                System.out.println("end");
                long now = System.currentTimeMillis(); // 현재 시간
                end.set(now - start.get()); // 수행 시간
            }
        );

        aopBrowser.show(); // 처음 호출할 때에는 로딩 시간이 필요
        System.out.println("loading time: " + end.get());

        aopBrowser.show(); // 두 번째부터 호출할 때에는 캐시를 이용하기 때문에 빠르게 호출
        System.out.println("loading time: " + end.get());
    }
}
