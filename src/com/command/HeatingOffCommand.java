package com.command;

import com.receiver.HeatingSystem;

public class HeatingOffCommand implements Command{
    HeatingSystem hs;

    public HeatingOffCommand(HeatingSystem hs) {
        this.hs = hs;
    }

    @Override
    public void execute() {
        hs.of();
    }
}
