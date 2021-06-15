package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;


public class Remove_by_id extends Command {
    @Override
    public Responce Execute()  {
        Responce responce = new Responce();
        if(args.size() > 0) {
            if (Printer.tickets.removeIf(u -> u.getId() == Long.parseLong(args.get(0)))) {
                responce.add("Успешно");
            } else {
                responce.add("ID не найден");
            }
        }
        else{
            responce.add("Не все аргументы");
        }
        return responce;
    }
}
