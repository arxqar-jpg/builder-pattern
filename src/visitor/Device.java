package visitor;

public interface Device {
    void accept(HomeVisitor visitor);
}