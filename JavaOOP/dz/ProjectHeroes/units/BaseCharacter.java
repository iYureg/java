package ProjectHeroes.units;

import ProjectHeroes.Interface.CharacterInterface;
import ProjectHeroes.view.AnsiColors;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseCharacter implements CharacterInterface {
    protected Random r = new Random();

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


    public BaseCharacter(String name, int x, int y) {
        this.name = name;
        this.isAlive = true;
        this.hp = maxHp;
        this.damage = minDmg;
        this.forcePoint = baseFP;
        this.point = new Coord(x, y);
    }

    public void getDamage(int dmg){

        if (this.hp <= 0) {
            this.isAlive = false;
        }else {
            this.hp -= dmg;
        }
    }

    @Override
    public String toString() {
       return super.getClass().getSimpleName();
    }
    public void setCordX(int x){
        this.point.x += x;
    }
    public int getHp(){return this.hp;}
    public void setHp(int HP){
        this.hp = HP + this.hp > maxHp ? maxHp : this.hp + HP;
    }
    public int getFP(){return this.forcePoint;}
    public int[] getCoord(){
        return new int[]{this.point.x, this.point.y};
    }
    public String getName() {
        return this.name;
    }

    public String getInfo(){
        return this.name + " - " +
                this.hp + AnsiColors.ANSI_RED + "\u2661 - " + AnsiColors.ANSI_RESET +
                this.forcePoint + "\u2694 ";
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
}
