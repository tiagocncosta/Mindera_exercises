package morning_radio;

public class Radio {
    public static final int MAXIMUM_NUMBER_OF_SONGS = 6;


    public String [] Musics = {"Music 1", "Music 2", "Music 3", "Music 4", "Music 5", "Music 6", "Music 7"};
    private Host host;
    private boolean radioOn;

    public Radio() {
        String[] Music = Musics;
        radioOn = false;
    }


    public void dailyProgram(Host host1, Host host2, int dayOfWeek) {
        if (isRadioOn()) {
            host = chooseHost(host1, host2);

            System.out.println("Hello Hello, good morning, i'm your host "
                    + host.getName() + " and this is your morning radio!");
            host.openingSong(dayOfWeek, Musics);
            host.playMusic(Musics);
        }
        }


    public String[] getMusics() {
        return Musics;
    }

    public void setMusics(String[] musics) {
        Musics = musics;
    }

    public boolean isRadioOn() {
        return radioOn;
    }

    public void setRadioOn() {
        this.radioOn = true;
    }

    public Host chooseHost(Host host1, Host host2){
        int a = (int) (Math.random()*2);
        if ( a == 1 ){
            return host1;
        }
        return host2;

    }
}

