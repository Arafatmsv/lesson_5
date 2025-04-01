package HomeWork;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String typeDefence;

    public int getDamage() {
        return bossDamage;
    }
    public int getHealth() {
        return bossHealth;
    }
    public String getTypeDefence() {
        return typeDefence;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }
}
