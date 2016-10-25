/**
 * Created by DreamShine on 17/10/2016.
 */

import java.util.ArrayList;
import java.util.List;
public class PlayWithRemote
{
    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        //---------------
        turnTVOn onCommand = new turnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();
        //--------------
        TurnTVOff offCommand = new TurnTVOff(newDevice);

        DeviceButton offPressed = new DeviceButton(offCommand);
        offPressed.press();
    }

}
