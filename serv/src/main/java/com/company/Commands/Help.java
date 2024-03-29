package com.company.Commands;


import com.company.Command;
import com.company.Managers.CommandManager;
import com.company.Models.Responce;

public class Help extends Command {
    @Override
    public Responce Execute() {
        Responce responce = new Responce();
        for (Command a: CommandManager.getInstance().GetCommands()) {
            responce.add("Команда: " + a.getName());
        }
        return responce;
    }
}
