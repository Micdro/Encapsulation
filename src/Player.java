public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
    health = health - damage;
    if (health <= 0)
    {
        System.out.println("Game over");
    }
    }

    public int healthRemainint() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;

        if (health > 100) {
            health = 100;
            System.out.println("Health has been completely restored");
        }
    }


}
