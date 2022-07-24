package academy;

import academy.supernatural.strikeable.monsters.Monster;
import academy.supernatural.strikeable.monsters.MonsterFactory;
import academy.supernatural.strikeable.monsters.MonsterType;

import static academy.Messages.*;

public class Player {
    public Monster[] monsters;
    private int deadMonsters;
    private String name;
    private boolean lost;

    public Player(String name) {
        this.name = name;
        this.lost = false;
        this.deadMonsters=0;
    }


    public void pickMonsters(int numberMonsters) {
        monsters = new Monster[numberMonsters];
        MonsterType[] monsterTypes = MonsterType.values();
        MonsterType type;
        for (int i = 0; i < monsters.length; i++) {
            type = monsterTypes[RandomGenerator.generateRandom(0, monsterTypes.length - 1)];
            monsters[i] = MonsterFactory.monsterGenerator(type);
        }
    }

    public int attack() {
            Monster monster = choseMonster();
            if(monster == null){
                return 0;
            }
            return monster.attack();
        }


       public void defence(int damage) {
            Monster monster = choseMonster();
            if(monster == null) {
                return;
            } monster.defence(damage);

            if(!monster.isAlive()){
                deadMonsters ++;
                System.out.printf(DEAD_MONSTERS, getName(), deadMonsters);
            }

            if (checkDeadMonsters() == monsters.length) {
                System.out.printf(ALL_MONSTERS_DIED, getName());
                lost = true;
            }
        }

    private Monster choseMonster() {
        if (!canChooseMonster()) {
            return null;
        }

        Monster monster = monsters[RandomGenerator.generateRandom(0, monsters.length - 1)];
        if (!monster.isAlive()) {
            monster=choseMonster();
        }

        return monster;
    }

    private boolean canChooseMonster() {  return deadMonsters < monsters.length;}


    public String getName() {
        return name;
    }

    public boolean isLost() {
        return lost;
    }
    private int checkDeadMonsters(){
        return deadMonsters;
    }
}
