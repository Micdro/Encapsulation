public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Michael";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemainint());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemainint());
        EnhancedPlayer michael = new EnhancedPlayer("Michael", 200, "Sword");
        System.out.println("Initial health = " + michael.healthRemainint());
    }
}