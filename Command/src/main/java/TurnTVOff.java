public class TurnTVOff implements Command
{
    ElectronicDevice theDevice;
    public TurnTVOff(ElectronicDevice newDevice)
    {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }
}
