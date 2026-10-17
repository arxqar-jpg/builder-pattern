package facade;

public class Lock {
    boolean locked = false;

    public void lock() {
        locked = true;
        System.out.println("Door locked");
    }

    public void unlock() {
        locked = false;
        System.out.println("Door unlocked");
    }

    public boolean isLocked() {
        return locked;
    }
}