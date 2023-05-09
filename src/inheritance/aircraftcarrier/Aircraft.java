package aircraftcarrier;

public abstract class Aircraft {
    private String type;
    private int ammo;
    private int maxAmmo;
    private int baseDamage;

    public Aircraft(String type, int maxAmmo, int damage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = damage;
        this.ammo = 0;
    }

    public int fight() {
        int damage = baseDamage * ammo;
        this.ammo = 0;
        return damage;
    }

    public int refillAmmo(int ammoToFill) {
        int ammoNeeded = maxAmmo - ammo;
        int ammoFilled = Math.min(ammoToFill, ammoNeeded);
        ammo += ammoFilled;
        return ammoToFill - ammoFilled;
    }

    public String getType() {
        return type;
    }

    public void getStatus() {
        int allDamage = baseDamage * ammo;
        System.out.println("Type " + Aircraft.class.getSimpleName() + ", Ammo: " + getAmmo() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + allDamage);
    }

    public abstract boolean isPriority();

    public void setType(String type) {
        this.type = type;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
