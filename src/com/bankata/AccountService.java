package com.bankata;

public class AccountService {
    private final Clock clock;
    private final Console console;

    public AccountService(Clock clock, Console console) {
        this.clock = clock;
        this.console = console;
    }

    public String haciendoEsto() {
        return "esto";
    }
}

