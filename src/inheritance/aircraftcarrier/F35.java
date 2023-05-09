package aircraftcarrier;

public class F35 extends Aircraft {

    public F35(String type, int maxAmmo, int damage) {
        super("F35", 12, 50);
    }

    @Override
    public boolean isPriority() {
        return true;
    }
}
