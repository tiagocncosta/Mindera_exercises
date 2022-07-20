package morning_radio;

import static morning_radio.Radio.MAXIMUM_NUMBER_OF_SONGS;

public class HostTalker extends Host {
    public HostTalker(String name) {
        super(name);
    }

    public void talk(){
        System.out.println("Are you enjoying the show ? bla bla bla..");
    }
    @Override
    public void playMusic(String[] Musics) {
        int j = 0;
        for (int i = 0; i < MAXIMUM_NUMBER_OF_SONGS/2; i++) {
            int a = (int) (Math.random() * 6);
            System.out.println(Musics[a]);
            talk();
            j ++;

            if(j == 2){
                j = 0;
                playCommercial();

            }
        }
        System.out.println("and thatss it for today byeee");
    }
}
