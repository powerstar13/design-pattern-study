package design.pattern.study.aop;

import design.pattern.study.proxy.Html;
import design.pattern.study.proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {

        before.run(); // 기록 시작

        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser loading html from: " + url);

            try {
                Thread.sleep(1500); // 로딩 시간을 1.5초 딜레이
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("AopBrowser use cache html: " + url);
        }

        after.run(); // 기록 종료

        return html;
    }
}
