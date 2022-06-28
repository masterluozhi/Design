package adapter;

public class PoliceCarAdapter extends CarController {
    private PoliceLamp policeLamp;
    public PoliceSound policeSound;

    public PoliceCarAdapter() {
       policeLamp = new PoliceLamp();
       policeSound = new PoliceSound();
    }


    @Override
    public void phonate() {
       policeSound.alarmSoud();
    }

    @Override
    public void twinkle() {
        policeLamp.alarmSound();
    }
}
