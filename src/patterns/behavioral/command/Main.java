package patterns.behavioral.command;

import patterns.behavioral.command.entity.Light;
import patterns.behavioral.command.entity.RemoteControl;
import patterns.behavioral.command.impl.LightOffCommand;
import patterns.behavioral.command.impl.LightOnCommand;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Main {

    private static final String LIGHT_ON = "LIGHT_ON";
    private static final String LIGHT_OFF = "LIGHT_OFF";

    public static void main(String[] args) {

        final RemoteControl remoteControl = new RemoteControl();
        final Light light = new Light();

        remoteControl.setCommand(LIGHT_ON, new LightOnCommand(light));
        remoteControl.setCommand(LIGHT_OFF, new LightOffCommand(light));

        remoteControl.pushButton(LIGHT_ON);
        remoteControl.pushButton(LIGHT_OFF);
    }

}
