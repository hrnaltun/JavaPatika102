package homework.adventuregame.locations;

import homework.adventuregame.player.Player;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(1,player,"Güvenli Ev","Burası sizin için güvenli bir ev , düşman yoktur.");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        System.out.println("Canınız yenilendi");
        return true;
    }


}
