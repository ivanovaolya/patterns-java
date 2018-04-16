package patterns.behavioral.command.impl;

import patterns.behavioral.command.entity.Light;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
