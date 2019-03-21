import java.util.Arrays;
import java.util.List;

/**
 * This class is derived from the "World of Zuul" application,
 * author Michael Kolling and David J. Barnes,
 * version 2006.03.30
 * This class holds an enumeration of all command words known to the editor.
 * It is used to recognise commands as they are typed in.
 *
 * @version 2013.09.09
 */

public class CommandWords {

    // a constant array that holds all valid command words
    private static final List<String> validCommands = Arrays.asList(
            "open", "save", "look", "mono", "rot90", "help", "quit", "script");


    /**
     * Check whether a given String is a valid command word.
     *
     * @return true if a given string is a valid command,
     * false if it isn't.
     */
    public boolean isCommand(String command) {
        return validCommands.contains(command);
    }
}
