package com.bankata;

public class AccountService {
    private Clock clock;

    public AccountService(Clock clock) {
        this.clock = clock;
    }

    public String haciendoEsto(){
        return "esto";
    }
}

