package com.controller;

import com.command.Command;

//Nel pattern del command lo stro responsabile dell'esecuzione del command può essere detto Controller o anche Invoker
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void executeCommand(){
        command.execute();
    }
}
