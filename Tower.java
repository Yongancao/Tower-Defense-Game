public class Tower {
    private int range;
    private int damage;
    private int cooldown;
    private int x, y;

    public Tower(int x, int y, int range, int damage, int cooldown) {
        this.x = x;
        this.y = y;
        this.range = range;
        this.damage = damage;
        this.cooldown = cooldown;
    }

    public void attack(Enemy enemy) {
        if (isInRange(enemy)) {
            enemy.takeDamage(damage);
        }
    }

    // private boolean isInRange(Enemy enemy) {
    //     double distance = Math.sqrt(Math.pow(enemy.getX() - x, 2) + Math.pow(enemy.getY() - y, 2));
    //     return distance <= range;
    // }
}