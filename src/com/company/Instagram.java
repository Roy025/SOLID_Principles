package com.company;

public class Instagram  implements SocialMedia{
    //OCP - module should be open for extension but closed for modification.
    @Override
    public String MediaName() {
        return " using Instagram.";
    }
}
