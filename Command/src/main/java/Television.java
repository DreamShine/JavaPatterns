/**
 * Created by DreamShine on 17/10/2016.
 */
public class Television implements ElectronicDevice
{
    private int volume = 0;

    public void on() {
        System.out.println("Tv is on");
    }

    public void off() {
        System.out.println("Tv is off");
    }

    public void volumeUp() {
        if(volume < 12)
            volume++;
        System.out.println("TV volume is at " + volume);
    }

    public void volumeDown() {
        if(volume > 0)
            volume --;
        System.out.println("TV volume is at " + volume);
    }
}
