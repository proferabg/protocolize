package dev.simplix.protocolize.bungee.commands;

import dev.simplix.protocolize.bungee.ProtocolizePlugin;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class ProtocolizeCommand extends Command {

    private final ProtocolizePlugin plugin;

    public ProtocolizeCommand(ProtocolizePlugin plugin) {
        super("protocolize");
        this.plugin = plugin;
    }

    @Override
    public void execute(final CommandSender commandSender, final String[] args) {
        if (args.length == 0) {
            commandSender.sendMessage("§bProtocolize version " + plugin.getDescription().getVersion() + " by " + plugin.getDescription().getAuthor());
        }
    }

}
