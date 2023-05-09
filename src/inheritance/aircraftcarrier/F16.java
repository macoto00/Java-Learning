package aircraftcarrier;

public class F16 extends Aircraft {
    public F16(String type, int maxAmmo, int damage) {
        super("F16", 8, 30);
    }

    @Override
    public boolean isPriority() {
        return false;
    }
}
