package com.main;

import com.command.Command;
import com.command.HeatingOffCommand;
import com.command.HeatingOnCommand;
import com.controller.Invoker;
import com.receiver.HeatingSystem;

public class Client {

    public static void main(String[] args){
        //istanzio il receiver
        HeatingSystem hs=new HeatingSystem();

        //creo i vari command
        Command heatOn=new HeatingOnCommand(hs);
        Command heatOff=new HeatingOffCommand(hs);

        //Istanzio l'invoker o controller che eseguirà i command
        Invoker inv=new Invoker();

        //setto il command on
        inv.setCommand(heatOn);
        //eseguo il comando ON
        inv.executeCommand();

        //setto il command off
        inv.setCommand(heatOff);
        //eseguo il comando OFF
        inv.executeCommand();

    }
}
