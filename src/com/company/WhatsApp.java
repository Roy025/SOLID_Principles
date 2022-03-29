package com.company;

public class WhatsApp implements SocialMedia{
    //OCP - module should be open for extension but closed for modification.
    @Override
    public String MediaName() {
        return " using WhatsApp.";
    }
}
