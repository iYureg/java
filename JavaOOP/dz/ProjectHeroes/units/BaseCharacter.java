package ProjectHeroes.units;

import ProjectHeroes.source.Coord;
import ProjectHeroes.Interface.CharacterInterface;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseCharacter implements CharacterInterface {
    Random r = new Random();
    protected String id;
    protected String name;
    protected boolean isAlive;
    protected int maxHp = 200;
    protected int hp;
    protected int baseDmg = 30;
    protected int damage;
    protected int baseFP = 3;
    protected int forcePoint;
    protected Coord point;

    public BaseCharacter(String name) {
        this.id = (r.nextInt(Short.MAX_VALUE)) + name + (r.nextInt(Short.MAX_VALUE));
        this.name = name;
        this.isAlive = true;
        this.hp = maxHp;
        this.damage = baseDmg;
        this.forcePoint = baseFP;
    }
    public BaseCharacter(String name, int x, int y) {
        this.id = (r.nextInt(Short.MAX_VALUE)) + name + (r.nextInt(Short.MAX_VALUE));
        this.name = name;
        this.isAlive = true;
        this.hp = maxHp;
        this.damage = baseDmg;
        this.forcePoint = baseFP;
        this.point = new Coord(x, y);
    }

    public int getDamage(){
        return this.damage;
    }

    public int getHp(){
        return this.hp;
    }
    public void Attack(BaseCharacter target){
        target.hp -= this.damage;
    }
    public String getCoord(){
        return String.format("X: %d, Y: %d", this.point.x, this.point.y);
    }
    public String getName() {
        return this.name;
    }

    public String getInfo() {
        return this.getClass().toString();
    }


    protected int[] getTarget(ArrayList<BaseCharacter> enemy) {

        int dist = 10000;
        int index = 0;
        for (int i = 0; i < enemy.size(); i++) {
            if(dist > point.getDistance(enemy.get(i).point)) {
                dist = Math.round(point.getDistance(enemy.get(i).point));
                index = i;
            }
        }
        return  new int[] {dist, index};
    }
}
