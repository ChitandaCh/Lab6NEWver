package com.company.Commands;


import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;

public class Head extends Command {
    @Override
    public Responce Execute()  {
        Responce responce = new Responce();
        if(Printer.tickets.size() != 0) {
            responce.add(Printer.tickets.getFirst().toString());
        }
        else{
                responce.add("Ни одного элемента нет");
        }
        return responce;
    }
}
