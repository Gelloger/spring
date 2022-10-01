package project.gelog.springshell.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Command {

    @Autowired
    public Command() {
    }

    @ShellMethod(value = "테스트", key = "test")
    public String test(@ShellOption(defaultValue = "test입니다") String text) {
        return text;
    }
}
