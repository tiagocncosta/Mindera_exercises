package morning_radio;

public class Main {
    public static void main(String[] args) {

        Radio radio = new Radio();
        Host host1 = new HostTalker("Jonas");
        Host host2 = new HostLover("Pedrinho");

        radio.setRadioOn();
        radio.dailyProgram(host1,host2, 2);

    }
}
