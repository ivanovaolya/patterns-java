package patterns.behavioral.command.entity;

import patterns.behavioral.command.impl.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class RemoteControl {

    private Map<String, Command> commands;

    public RemoteControl() {
        commands = new HashMap<>();
    }

    public void setCommand(final String name, final Command command) {
        commands.put(name, command);
    }

    public void pushButton(final String name) {
        final Command command = Optional.ofNullable(commands.get(name)).orElseThrow(RuntimeException::new);
        command.execute();
    }

}
