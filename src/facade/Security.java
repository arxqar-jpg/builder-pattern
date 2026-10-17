package facade;

public class Security {
    Lock lock;
    boolean armed = false;

    public Security(Lock lock) {
        this.lock = lock;
    }

    public void arm() {
        if (lock.isLocked()) {
            armed = true;
            System.out.println("Security ON");
        } else {
            System.out.println("Door is not locked");
        }
    }

    public void disarm() {
        armed = false;
        System.out.println("Security OFF");
    }
}