package com.company;

public class StudentA implements Dog, Fish{
    //ISP - Clients should not be forced to depend upon interfaces that they do not use.
    @Override
    public String d() {
        return "\nStudent A has a Dog. ";
    }

    @Override
    public String fish() {
        return "\nStudent A has Fish as pet.";
    }
}
