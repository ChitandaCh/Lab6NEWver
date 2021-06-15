package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;

public class Info extends Command {
    @Override
    public Responce Execute()  {
        Responce responce = new Responce();
        responce.add("Начало старта: " + Printer.start.toString() + "\r\nКол-во элементов: " + Printer.tickets.size());
        return responce;
    }
}
