package design.pattern.study.strategy;

public class Encoder {

    private EncodingStrategy encodingStrategy;

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public String getMessage(String message) {
        return encodingStrategy.encode(message);
    }
}
