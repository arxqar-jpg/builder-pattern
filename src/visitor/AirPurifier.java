package visitor;

public class AirPurifier implements Device {
    private final int filterLife;

    public AirPurifier(int filterLife) {
        this.filterLife = filterLife;
    }

    public int getFilterLife() {
        return filterLife;
    }
    @Override
    public void accept(HomeVisitor visitor) {
        visitor.visitAirPurifier(this);
    }
}