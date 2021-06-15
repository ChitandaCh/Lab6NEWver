package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;
import com.company.Models.Ticket;

public class Show extends Command {
    @Override
    public Responce Execute() {
        Responce responce = new Responce();
        if(Printer.tickets.size() != 0) {
            for (Ticket ticket : Printer.tickets) {
                responce.add(ticket.toString());
            }
        }
        else{
            responce.add("Ни одного элемента нет");
        }
        return responce;
    }
}
