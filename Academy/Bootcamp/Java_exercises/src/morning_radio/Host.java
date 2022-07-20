package morning_radio;

import static morning_radio.Radio.MAXIMUM_NUMBER_OF_SONGS;

public abstract class Host {

    protected String name;

    public Host(String name) {
        this.name = name;
    }

    public String openingSong(int dayOfWeek, String Musics[]) {

        switch (dayOfWeek) {
            case 1:
                System.out.println("ITSSS ... Monday we are now going to play " + Musics[0]);
                break;
            case 2:
                System.out.println("Its Tuesday, our opening song is " + Musics[1]);
                break;
            case 3:
                System.out.println("Already at the middle of the week, its Wednesday and we open with " + Musics[2]);
                break;
            case 4:
                System.out.println("HELLO HELLO ITS Thursday, LETS WAKE UP WITH " + Musics[3]);
                break;
            case 5:
                System.out.println("ITS FRIDAY BABYYYY, feel good with our " + Musics[4]);
                break;
            case 6:
                System.out.println("Lets party itsss Saturday and we open with " + Musics[5]);
                break;
            case 7:
                System.out.println("Sunday we are going to start slow with " + Musics[6]);
                break;

        }
        return null;
    }

    public void playMusic(String[] Musics) {
        int j = 0;
        for (int i = 0; i < MAXIMUM_NUMBER_OF_SONGS; i++) {
            int a = (int) (Math.random() * 6);
            System.out.println(Musics[a]);
            j ++;

            if(j == 2){
                j = 0;
                playCommercial();

            }
        }
        System.out.println("and thatss it for today byeee");
    }

    public void playCommercial(){
        System.out.println("Commercial time!!");
    }

    public String getName() {
        return name;
    }
}
