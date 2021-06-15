package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;
import com.company.Models.Venue;
import com.company.Helper.Parser;

public class Remove_all_by_venue extends Command {
    @Override
    public Responce Execute() throws Exception {
        Responce responce = new Responce();
        if(args.size() > 0) {
            Venue v = Parser.GetVenue(args.get(0));
            if (Printer.tickets.removeIf(u -> u.getVenue().equals(v))) {
                responce.add("Успешно");
            } else {
                responce.add("Неудачно");
            }
        }
        else{
            responce.add("Не все аргументы");
        }
        return responce;
    }

}
