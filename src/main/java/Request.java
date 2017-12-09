public class Request {
    private boolean goingUp;
    private boolean goingDown;
    private int currentFloor;
    private int destinationFloor;

    public Request(int currentFloor) {
      this.currentFloor = currentFloor;
    }

    public void goUp() {
        if(currentFloor == 5) {
            throw new RuntimeException("Cannot go up on fifth floor!");
        }
       goingUp = true;
       goingDown = false;
    }

    public boolean goingUp() {
        return goingUp;
    }

    public void goDown() {
        if(currentFloor == 0) {
            throw new RuntimeException("Cannot go down on ground floor!");
        }
        goingUp = false;
        goingDown = true;
    }

    public boolean goingDown() {
       return goingDown;
    }

    public void goToFloor(int destinationFloor) {
       this.destinationFloor = destinationFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}
