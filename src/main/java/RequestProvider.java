public class RequestProvider {
    private static RequestProvider requestProvider;

    public static RequestProvider getInstance() {
        if (requestProvider == null) {
            requestProvider = new RequestProvider();
        }
        return requestProvider;
    }

    public Request getNextRequest() {
        return new Request(5, Direction.UP);
    }
}
