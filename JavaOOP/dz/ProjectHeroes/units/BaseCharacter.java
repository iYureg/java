package ProjectHeroes.units;

import ProjectHeroes.source.Coord;
import ProjectHeroes.Interface.CharacterInterface;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseCharacter implements CharacterInterface {
    protected Random r = new Random();
    protected String id;
    protected String name;
    protected String type;
    protected boolean isAlive;
    protected int maxHp = 200;
    protected int hp;

    protected int minDmg = r.nextInt(20, 31);
    protected int maxDmg = r.nextInt(30, 51);
    protected int damage = (minDmg + maxDmg) / 2;
    protected int crtDmg = damage * 2;
    protected int baseFP = 1;
    protected int forcePoint;
    protected Coord point;

    public BaseCharacter(String name , String type) {
        this.id = (r.nextInt(Short.MAX_VALUE)) + name + (r.nextInt(Short.MAX_VALUE));
        this.name = name;
        this.isAlive = true;
        this.hp = maxHp;
        this.damage = minDmg;
        this.forcePoint = baseFP;
    }
    public BaseCharacter(String name, int x, int y) {
        this.id = (r.nextInt(Short.MAX_VALUE)) + name + (r.nextInt(Short.MAX_VALUE));
        this.name = name;
        this.isAlive = true;
        this.hp = maxHp;
        this.damage = minDmg;
        this.forcePoint = baseFP;
        this.point = new Coord(x, y);
    }

    public void getDamage(int dmg){
         this.hp -= dmg;
    }

    public int getHp(){return this.hp;}
    public void Attack(BaseCharacter target){target.hp -= this.damage;}
    public int getFP(){return this.forcePoint;}
    public String getCoord(){
        return String.format("X: %d, Y: %d", this.point.x, this.point.y);
    }
    public String getName() {
        return this.name;
    }
    public String getInfo() {
        return this.getClass().toString();
    }
    public String getType() { return this.type; }

    protected BaseCharacter getTarget(ArrayList<BaseCharacter> enemy) {

        int dist = 10000;
        int index = 0;
        for (int i = 0; i < enemy.size(); i++) {
            if(dist > point.getDistance(enemy.get(i).point)) {
                dist = Math.round(point.getDistance(enemy.get(i).point));
                index = i;
            }
        }
        return  enemy.get(index);
    }

//    protected BaseCharacter getAlly(ArrayList<BaseCharacter> allys){
//
//    }
}
