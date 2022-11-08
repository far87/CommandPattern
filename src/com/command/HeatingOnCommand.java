package com.command;

import com.receiver.HeatingSystem;

public class HeatingOnCommand implements Command{

    HeatingSystem hs;

    public HeatingOnCommand(HeatingSystem hs) {
        this.hs = hs;
    }

    @Override
    public void execute() {
        hs.on();
    }
}
