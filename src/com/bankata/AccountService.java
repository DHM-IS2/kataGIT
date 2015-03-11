package com.bankata;

public class AccountService {
    private Clock clock;

    public AccountService(Clock clock) {
        this.clock = clock;
    }

    private final Console console;

    public AccountService(Console console) {
        this.console=console;

    }

    public String haciendoEsto(){
        return "esto";
    }
}

