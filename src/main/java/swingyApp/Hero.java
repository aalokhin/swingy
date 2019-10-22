package swingyApp;

public class Hero {
    private String name;
    private String type;
    private int level;
    private int experience;
    private int attack;

    public Hero(String name, String type) {
        this.name = name;
        this.type = type;
        this.experience = 0;
        this.level = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}


/*

 Create a hero
• Select a previously created hero.
In either case, the player can see the hero stats:
• Hero name
• Hero class
• Level
• Experience
• Attack
• Defense
• Hit Points
Hero stats are affected by the hero level and artifacts. There are 3 types of artefacs: • Weapon - increases the attack
• Armor - increases defense
• Helm - increases hit points
After choosing a hero the actual gam

*/


