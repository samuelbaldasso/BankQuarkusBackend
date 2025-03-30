package com.bank.main;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class BankApplication {
    
    public static void main(String[] args) {
        Quarkus.run(args);
    }
}