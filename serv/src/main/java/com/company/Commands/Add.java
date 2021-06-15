package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Helper.Parser;
import com.company.Models.Responce;

public class Add extends Command {

    @Override
    public Responce Execute()  {
        Responce responce = new Responce();
        if(args.size() >= 1) {
            Printer.tickets.add(Parser.GetTicket(args.get(0)));
            responce.add("Успешно");
        }
        else {
            responce.add("Неудача");
        }
        return responce;
    }
}
