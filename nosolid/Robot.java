package nosolid;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // Robotlar yemir, bu metod lazımsızdır
        throw new UnsupportedOperationException("Robots don't eat");
    }

    @Override
    public void sleep() {
        // Robotlar yatmır, bu metod lazımsızdır
        throw new UnsupportedOperationException("Robots don't sleep");
    }


}
