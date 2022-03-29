package com.company;

public class StudentC implements Dog{
    //ISP - Clients should not be forced to depend upon interfaces that they do not use.
    @Override
    public String d() {
        return "\nStudent C has a Dog. ";
    }
}
