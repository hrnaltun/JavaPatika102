package homework.adventuregame.player;



import homework.adventuregame.inventory.Inventory;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private Scanner input =new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }

    public int getDamage() {
        return damage+ this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectChar(){
        GameChar[] charlist= {new Samurai(),new Archer(),new Knight()};
        System.out.println("Karaktlerler ");
        for (GameChar gamechar :charlist) {
            System.out.println("Id: "+gamechar.getId()+
                    "\t Karakter: "+gamechar.getName() +
                    "\t Hasar: "+gamechar.getDamage() +
                    "\t Sağlık: " +gamechar.getHealth() +
                    "\t Para: "+gamechar.getMoney());
        }
        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectchar= input.nextInt();
        if (selectchar==1){
            initPlayer(new Samurai());
        }else if (selectchar==2){
            initPlayer(new Knight());
        }else if (selectchar==3){
            initPlayer(new Archer());
        }else {
            initPlayer(new Samurai());
        }


    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println("Silahınız: "+this.getInventory().getWeapon().getName()+
                ", Hasarınız : "+this.getDamage()+
                ", Sağlık: " +this.getHealth()+
                ", Para: "+this.getMoney());
    }

}
