package academy.supernatural.strikeable.monsters;

public class MonsterFactory {


    public  static Monster monsterGenerator(MonsterType type){
        switch (type) {
            case WEREWOLF:
                return new Werewolf(25, MonsterType.WEREWOLF);
            case MUMMY:
                return new Mummy(25,MonsterType.MUMMY);
            default:
                return new Vampire(30,MonsterType.VAMPIRE);
        }
    }


    }

