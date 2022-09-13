package com.revature.spring_java.services;

public class MotivationService {

    public MotivationService() {
        System.out.println("MotivationService#<init> invoked!");
    }

    public String fetchMotivationalQuote() {
        // Mock quote for now, could fetch from an external API later
        return "Don't quit. Suffer now and live the rest of your life like a champion. - Muhammad Ali";
    }

}
