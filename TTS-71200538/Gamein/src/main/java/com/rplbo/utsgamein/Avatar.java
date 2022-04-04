package com.rplbo.utsgamein;

public class Avatar extends Actor implements IMoveable, IKeyInput{
    private String name;
    private int healthPoint;
    private int moveSpeed;
    private Weapon weapon;

    public Avatar(String name, int healthPoint, Weapon weapon,int moveSpeed){
        this.name = name;
        this.healthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
        this.weapon = weapon;
    }
    public  void keyPressed(int keyCode){
        if (keyCode == 0){

        }
    }
    public void  hitTaken(int hit){
        hit = this.weapon.getHitDamage();
        this.healthPoint = this.healthPoint - hit;
    }
    public void move(float x, float y){

    }
}
