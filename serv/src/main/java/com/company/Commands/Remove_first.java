package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;

public class Remove_first extends Command {
    @Override
    public Responce Execute()  {
        Responce responce = new Responce();
        if(Printer.tickets.size() != 0) {
            Printer.tickets.removeFirst();
        }
        else{
            responce.add("Ни одного элемента нет");
        }
        return responce;
    }
}
