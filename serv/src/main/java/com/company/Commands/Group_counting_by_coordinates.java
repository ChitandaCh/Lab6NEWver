package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Models.Responce;
import com.company.Models.Ticket;
import java.util.ArrayList;
import java.util.Comparator;

public class Group_counting_by_coordinates extends Command {
    @Override
    public Responce Execute() {//сортируем, и прохрдим массив, ищя одинаковые, и считаем количество каждого
        Responce responce = new Responce();
        try {
            ArrayList<Ticket> tickets = new ArrayList<>();
            Printer.tickets.iterator().forEachRemaining(tickets::add);
            tickets.sort(Comparator.comparing(Ticket::getCoordinates));
            int sch = 1;
            for (int i = 1; i < tickets.size(); i++) {
                if (tickets.get(i - 1).getCoordinates().equals(tickets.get(i).getCoordinates())) {
                    sch++;
                } else {
                    responce.add(tickets.get(i - 1).getCoordinates() + "\t\nколичество = " + sch);
                    sch = 1;
                }
            }
            responce.add(tickets.get(tickets.size() - 1).getCoordinates() + "\t\nколичество = " + sch);
        }
        catch (Exception w){
            responce.add("Ошибка в команде");
        }
        return responce;
    }
}
