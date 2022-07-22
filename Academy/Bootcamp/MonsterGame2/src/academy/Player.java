package academy;

import academy.supernatural.strikeable.monsters.Monster;
import academy.supernatural.strikeable.monsters.MonsterFactory;
import academy.supernatural.strikeable.monsters.MonsterType;

public class Player {
    public Monster[] monsters;
    private  int deadMonsters;
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


       public void suffer(int damage) {
            Monster monster = choseMonster();
            if(monster == null) {
                return;
            } monster.defence(damage);

            if(!monster.isAlive()){
                deadMonsters ++;
            }

            if (checkDeadMonsters() == monsters.length) {
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
