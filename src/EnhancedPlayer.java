public class EnhancedPlayer {
    private String playerName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String playerName) {
        this(playerName, 100, "Sword");
    }

    public EnhancedPlayer(String playerName, int healthPercentage, String weapon) {
        this.playerName = playerName;
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        }

        else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
        else this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0)
        {
            System.out.println("Game over");
        }
    }

    public int healthRemainint() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;

        if (healthPercentage > 100) {
            healthPercentage = 100;
            System.out.println("Health has been completely restored");
        }
    }
}
