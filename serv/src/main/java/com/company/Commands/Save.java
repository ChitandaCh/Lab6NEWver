package com.company.Commands;

import com.company.Command;
import com.company.Printer;
import com.company.Helper.Parser;
import com.company.Models.Responce;

public class Save extends Command {
    @Override
    public Responce Execute() throws Exception {
        Responce responce = new Responce();
        Parser.Save(Printer.path);
        responce.add("успех");
        return responce;
    }
}
