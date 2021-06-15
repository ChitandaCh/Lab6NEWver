package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;


public class Clear extends Command {
    @Override
    public Responce Execute() throws Exception {
        Responce responce = new Responce();
        Printer.tickets.clear();
        responce.add("Удача");
        return responce;
    }
}
