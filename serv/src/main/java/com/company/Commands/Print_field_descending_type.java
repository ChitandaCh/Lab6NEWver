package com.company.Commands;


import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;
import com.company.Models.Ticket;
import java.util.ArrayList;
import java.util.Comparator;

public class Print_field_descending_type extends Command {
    @Override
    public Responce Execute() {
        Responce responce = new Responce();
        ArrayList<Ticket> a = new ArrayList<>();
        Printer.tickets.iterator().forEachRemaining(a::add);
        a.sort(Comparator.comparing(Ticket::getType));
        for (Ticket ticket : a){
            responce.add(ticket.getType().toString());
        }
        return responce;
    }
}
