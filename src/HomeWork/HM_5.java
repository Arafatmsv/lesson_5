package HomeWork;

public class HM_5 {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setTypeDefence("Physical");

        System.out.println("BOSS HEALTH: " + boss.getHealth() + " | BOSS DAMAGE: " + boss.getDamage()
                + " | TYPEDEFENCE: " + boss.getTypeDefence());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero Information:");
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
        }
    }
    public static Hero[] createHeroes() {
        Hero Physical = new Hero(280, 15, "Sword");
        Hero Magical = new Hero(250, 35);
        Hero Kinetic = new Hero(280, 45, "Kinetic");

        return new Hero[]{Physical, Magical, Kinetic};
    }
}
