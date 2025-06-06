package org.example;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class Main {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();

        String language;

        if (args.length == 0) {
            language = "en";
        } else {
            language = args[0].toLowerCase();
        }
        Greeting gp = new Greeting(language);

        System.out.println(Ansi.ansi()
                .fg(gp.getGreetingColor()).a(gp.getGreeting() + " ")
                .fg(gp.getPersonColor()).a(gp.getPerson() + " ")
                .fg(gp.getPunctuationColor()).a(gp.getPunctuation())
                .reset());

        AnsiConsole.systemUninstall();
    }
}