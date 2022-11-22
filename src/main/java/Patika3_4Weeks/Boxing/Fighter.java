package Patika3_4Weeks.Boxing;

import static java.lang.System.*;

public class Fighter { String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        out.println("------------");
        out.println(this.name + " => " + foe.name + (foe.name.equals("Alex")?" e ":" a ") +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        else if (foe.health - this.damage < 0) {
            return 0;
        }else {
            return foe.health - this.damage;
        }

    }

    public boolean dodge() {
        int randomValue = (int) (Math.random() * 100);  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

}
