package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;
import com.company.Models.Ticket;
import com.company.Helper.Parser;

public class Remove_lower extends Command {
    @Override
    public Responce Execute()  {
        Responce responce = new Responce();
        try {
            if(args.size() > 0) {
                Ticket ticket = Parser.GetTicket(args.get(0));
                if (Printer.tickets.removeIf(u -> u.compareTo(ticket) < 0)) {
                    responce.add("Успешно");
                } else {
                    responce.add("Неудачно");
                }
            }
            else{
                responce.add("Не все аргументы");
            }
        }
        catch (Exception e){
            responce.add("Ошибка команды");
        }
        return responce;
    }
}
