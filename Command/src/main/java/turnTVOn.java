/**
 * Created by DreamShine on 17/10/2016.
 */
public class turnTVOn implements Command
{
    ElectronicDevice theDevice;
    public turnTVOn(ElectronicDevice newDevice)
    {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }
}
