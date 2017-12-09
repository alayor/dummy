

public class RequestProvider {
    private static RequestProvider requestProvider;


    public static RequestProvider getInstance() {
        if (requestProvider == null) {
            requestProvider = new RequestProvider();
        }
        return requestProvider;
    }

    public Request getNextRequest() {
        int currentFloor = (int) (Math.random() * 6);
        return new Request(currentFloor, getRandomDestination(currentFloor));
    }

    private Direction getRandomDestination(int currentFloor) {
        if (currentFloor < 0 || currentFloor > 5) {
            throw new IllegalArgumentException("currentFloor should be between zero and five (inclusive)");
        }
        if(currentFloor == 0) {
            return Direction.UP;
        }
        if (currentFloor == 5) {
            return Direction.DOWN;
        }
        double random = Math.random();
        if (random > 0.5) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }
}
