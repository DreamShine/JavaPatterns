/**
 * Created by DreamShine on 17/10/2016.
 */
public class DeviceButton
{
    Command theCommand;

    public DeviceButton(Command newCommand)
    {
        theCommand = newCommand;
    }

    public void press()
    {
        theCommand.execute();
    }

}
